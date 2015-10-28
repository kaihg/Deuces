package tw.com.jumbo.deuces;

import android.util.Log;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Arrays;

import tw.com.jumbo.deuces.dealer.RandomDealer;

/**
 * Created by kaihghuang on 2015/10/26.
 */
public class RandomDealerTest extends TestCase{

    public void testRandom(){
        int[] card = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] copy = Arrays.copyOf(card,card.length);
        Assert.assertTrue(Arrays.equals(card, copy));


        RandomDealer dealer = new RandomDealer();
        dealer.randomCards(copy);
        System.out.print(Arrays.toString(copy));
        Log.d("kaihg",Arrays.toString(copy));

        Assert.assertFalse(Arrays.equals(card, copy));

    }
}

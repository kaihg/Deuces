package tw.com.jumbo.deuces.dealer;

import java.util.Random;

/**
 * Created by kaihghuang on 2015/10/26.
 */
public class RandomDealer {

    public static int[] randomCards(int[] cards){
        Random random = new Random();

        for (int index = 0; index < cards.length; index++) {
            int target = random.nextInt(cards.length);
            int now = cards[index];
            cards[index] = cards[target];
            cards[target] = now;
        }

        return cards;
    }

}

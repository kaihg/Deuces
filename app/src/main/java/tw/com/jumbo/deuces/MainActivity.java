package tw.com.jumbo.deuces;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;

import tw.com.jumbo.deuces.dealer.Dealer;
import tw.com.jumbo.deuces.dealer.RandomDealer;

public class MainActivity extends AppCompatActivity implements Dealer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] allCards = createCards();
        shuffle(allCards);
        allocationCardToPlayer(allCards);
    }

    private void allocationCardToPlayer(int[] allCards) {
        allocation(R.id.player1Fragment, 0, 12, allCards);
        allocation(R.id.player2Fragment, 13, 25, allCards);
        allocation(R.id.player3Fragment, 26, 38, allCards);
        allocation(R.id.player4Fragment, 39, 51, allCards);
//        FragmentManager manager = getFragmentManager();
//        manager.beginTransaction().commit();
    }

    private void allocation(int fragmentId, int start, int end, int[] allCards) {
        Fragment fragment = PlayerFragment.getInstance(Arrays.copyOfRange(allCards, start, end));
        FragmentManager manager = getFragmentManager();
        manager.beginTransaction().add(fragmentId, fragment).commit();
    }

    private void shuffle(int[] allCards) {
        RandomDealer.randomCards(allCards);
    }

    private int[] createCards() {
        int[] cards = new int[52];

        for (int i = 0; i < 52; i++) {
            cards[i] = i;
        }

        return cards;
    }
}

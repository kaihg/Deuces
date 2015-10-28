package tw.com.jumbo.deuces.dealer;

/**
 * Created by kaihghuang on 2015/10/26.
 */
public class OneTrainFilter implements CardGroupFilter {
    @Override
    public void filterCards(int[] cards) {

        for (int i=0;i<cards.length;i++){
            if (cards[i]> i*4+3 || cards[i] < i*4){
                break;// not a train
            }
        }
    }
}

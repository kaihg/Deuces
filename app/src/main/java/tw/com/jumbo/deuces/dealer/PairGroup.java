package tw.com.jumbo.deuces.dealer;

import tw.com.jumbo.deuces.CardConstant;

/**
 * Created by kaihghuang on 2015/10/26.
 */
public class PairGroup extends CardGroup {

    private int[] mPair;

    public PairGroup(int card1,int card2){
        mPair = new int[2];
        mPair[0] = card1;
        mPair[1] = card2;
    }

    @Override
    public boolean isFirstHand() {
        return mPair[0] == CardConstant.PLUM_THREE;
    }

    @Override
    public int compare(CardGroup lhs, CardGroup rhs) {
        return ((PairGroup)lhs).mPair[1] - ((PairGroup)rhs).mPair[1];
    }
}

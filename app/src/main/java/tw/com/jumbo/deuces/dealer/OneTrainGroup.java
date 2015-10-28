package tw.com.jumbo.deuces.dealer;

import tw.com.jumbo.deuces.CardConstant;

/**
 * Created by kaihghuang on 2015/10/26.
 * 我是一條龍
 */
public class OneTrainGroup extends CardGroup {

    private int[] mTrain;

    public OneTrainGroup(int[] train) {
        if (train.length != 13) {
            throw new IllegalArgumentException("一條龍一定要13張");
        }

        mTrain = train;
    }

    @Override
    public boolean isFirstHand() {
        for (int i : mTrain) {
            if (mTrain[i] == CardConstant.PLUM_THREE) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compare(CardGroup lhs, CardGroup rhs) {
        return -1;
    }
}

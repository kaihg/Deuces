package tw.com.jumbo.deuces.dealer;

import tw.com.jumbo.deuces.CardConstant;

/**
 * Created by kaihghuang on 2015/10/29.
 */
public class FullHorseCardGroup extends CardGroup{

    private int[] mFlush;

    public FullHorseCardGroup(int card1,int card2,int card3,int card4,int card5) {
        mFlush = new int[5];
        mFlush[0] = card1;
        mFlush[1] = card2;
        mFlush[2] = card3;
        mFlush[3] = card4;
        mFlush[4] = card5;
    }

    @Override
    public boolean isFirstHand() {
        for (int card : mFlush){
            if (card== CardConstant.PLUM_THREE){
                return true;
            }
        }
        return false;
    }

    @Override
    public int compare(CardGroup lhs, CardGroup rhs) {
        FullHorseCardGroup lCard = (FullHorseCardGroup) lhs;

        if (!(rhs instanceof FullHorseCardGroup)){
            return -1;
        }

        FullHorseCardGroup rCard = (FullHorseCardGroup) rhs;

        if (CardConstant.isCardNumber2(lCard.mFlush[0]) && CardConstant.isCardNumber2(lCard.mFlush[0])){
            return lCard.mFlush[0] - rCard.mFlush[0];
        }else{
            return lCard.mFlush[4] - rCard.mFlush[4];
        }

    }
}

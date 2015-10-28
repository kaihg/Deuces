package tw.com.jumbo.deuces;

import android.support.annotation.IntDef;

/**
 * Created by kaihghuang on 2015/10/26.
 */
public class CardConstant {
    public static final int PLUM_THREE = 0;

    @IntDef({CARD_SUIT_MOD_CLUB, CARD_SUIT_MOD_DIAMOND, CARD_SUIT_MOD_HEART, CARD_SUIT_MOD_SPADE})
    public @interface CardSuitMode {
    }

    public static final int CARD_SUIT_MOD_CLUB = 0;
    public static final int CARD_SUIT_MOD_DIAMOND = 1;
    public static final int CARD_SUIT_MOD_HEART = 2;
    public static final int CARD_SUIT_MOD_SPADE = 3;


    public static boolean isCardNumber2(int card) {
        return card < 52 && card > 47;
    }

    @CardSuitMode
    public static int getCardSuit(int card) {
        switch (card % 4) {
            case CARD_SUIT_MOD_CLUB:
                return CARD_SUIT_MOD_CLUB;
            case CARD_SUIT_MOD_DIAMOND:
                return CARD_SUIT_MOD_DIAMOND;
            case CARD_SUIT_MOD_HEART:
                return CARD_SUIT_MOD_HEART;
            case CARD_SUIT_MOD_SPADE:
                return CARD_SUIT_MOD_SPADE;
        }
        return CARD_SUIT_MOD_CLUB;
    }


}

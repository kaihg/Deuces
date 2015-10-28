package tw.com.jumbo.deuces.dealer;

import java.util.Comparator;

/**
 * Created by kaihghuang on 2015/10/26.
 */
public abstract class CardGroup implements Comparator<CardGroup>{
    public abstract boolean isFirstHand();
//    public abstract int getCardCount();
}

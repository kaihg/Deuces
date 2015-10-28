package tw.com.jumbo.deuces.player;

import android.support.v7.widget.RecyclerView;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import tw.com.jumbo.deuces.CardConstant;
import tw.com.jumbo.deuces.R;
import tw.com.jumbo.deuces.dealer.CardGroup;

/**
 * Created by kaihghuang on 2015/10/28.
 */
public class CardAdapter extends RecyclerView.Adapter<CardViewHolder> {

    private SparseIntArray mCards;

    public CardAdapter(int[] cards){
        mCards = new SparseIntArray(13);
        for (int i = 0; i < cards.length; i++) {
            mCards.append(i,cards[i]);
        }
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.poker_card_view, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        int card = mCards.get(position);
        switch (CardConstant.getCardSuit(card)){
            case CardConstant.CARD_SUIT_MOD_CLUB:
                holder.mSuit.setImageResource(R.drawable.ic_card_club);
                break;
            case CardConstant.CARD_SUIT_MOD_DIAMOND:
                holder.mSuit.setImageResource(R.drawable.ic_card_diamond);
                break;
            case CardConstant.CARD_SUIT_MOD_HEART:
                holder.mSuit.setImageResource(R.drawable.ic_card_heart);
                break;
            case CardConstant.CARD_SUIT_MOD_SPADE:
                holder.mSuit.setImageResource(R.drawable.ic_card_spade);
                break;
        }

        switch (card / 4){
            case 12:
                holder.mNumber.setText("2");
                break;
            case 11:
                holder.mNumber.setText("A");
                break;
            case 10:
                holder.mNumber.setText("K");
                break;
            case 9:
                holder.mNumber.setText("Q");
                break;
            case 8:
                holder.mNumber.setText("J");
                break;
            default:
                holder.mNumber.setText(String.valueOf(card/4 +3));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mCards.size();
    }
}

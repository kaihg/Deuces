package tw.com.jumbo.deuces.player;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import tw.com.jumbo.deuces.R;

/**
 * Created by kaihghuang on 2015/10/28.
 */
public class CardViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.pokeCardView_suitImage)
    ImageView mSuit;
    @Bind(R.id.pokeCardView_numberText)
    TextView mNumber;

    public CardViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}

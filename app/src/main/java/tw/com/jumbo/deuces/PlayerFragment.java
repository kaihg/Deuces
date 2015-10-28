package tw.com.jumbo.deuces;

import android.animation.Animator;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;

import tw.com.jumbo.deuces.dealer.Dealer;
import tw.com.jumbo.deuces.player.CardAdapter;
import tw.com.jumbo.deuces.player.Player;

/**
 * Created by kaihghuang on 2015/10/28.
 */
public class PlayerFragment extends Fragment implements Player{

    private static final String BUNDLE_KEY_CARDS = "BUNDLE_KEY_CARDS";

    private int[] mCards;
    private Dealer mDealer;

    public static PlayerFragment getInstance(int[] cards){
        PlayerFragment fragment = new PlayerFragment();
        Arrays.sort(cards);
        Bundle bundle = new Bundle();
        bundle.putIntArray(BUNDLE_KEY_CARDS, cards);
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Dealer){
            mDealer = (Dealer) context;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCards = getArguments().getIntArray(BUNDLE_KEY_CARDS);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView recyclerView = new RecyclerView(getActivity());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(new CardAdapter(mCards));

        return recyclerView;
    }
}

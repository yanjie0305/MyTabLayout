package com.example.administrator.mytablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ${郭艳杰} on 2017/1/15.
 */

public class ItemFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        String title = getArguments().getString("title");
        TextView textView = new TextView(getActivity());
        textView.setText(title);
        return textView;
    }

    public static Fragment getInstance(String s) {
        ItemFragment itemFragment = new ItemFragment();
        Bundle args = new Bundle();
        args.putString("title",s);
        itemFragment.setArguments(args);
        return itemFragment;
    }
}

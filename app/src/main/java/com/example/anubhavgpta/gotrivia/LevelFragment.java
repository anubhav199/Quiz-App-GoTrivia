package com.example.anubhavgpta.gotrivia;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LevelFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_level, container,false);
        Button btngocatr = (Button) view.findViewById(R.id.gocatr);
        btngocatr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayFragment playFragment = new PlayFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.fragment_container, playFragment, playFragment.getTag()).commit();

            }
        });
        return view;
    }
}

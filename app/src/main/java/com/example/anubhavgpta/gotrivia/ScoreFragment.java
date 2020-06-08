package com.example.anubhavgpta.gotrivia;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;

public class ScoreFragment extends Fragment {

    TextView compHigh, compHigh1, compHigh2, compHigh3, compHigh4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_score, container,false);

        SharedPreferences pref1 = getActivity().getPreferences(Context.MODE_PRIVATE);
        String highScore1 = pref1.getString("highScore", "0");

        SharedPreferences pref2 = getActivity().getPreferences(Context.MODE_PRIVATE);
        String highScore2 = pref2.getString("highScore1", "0");

        SharedPreferences pref3 = getActivity().getPreferences(Context.MODE_PRIVATE);
        String highScore3 = pref3.getString("highScore2", "0");

        SharedPreferences pref4 = getActivity().getPreferences(Context.MODE_PRIVATE);
        String highScore4 = pref4.getString("highScore3", "0");

        SharedPreferences pref5 = getActivity().getPreferences(Context.MODE_PRIVATE);
        String highScore5 = pref5.getString("highScore4", "0");

        compHigh = (TextView) view.findViewById(R.id.comphigh);
        compHigh1 = (TextView) view.findViewById(R.id.comphigh1);
        compHigh2 = (TextView) view.findViewById(R.id.comphigh2);
        compHigh3 = (TextView) view.findViewById(R.id.comphigh3);
        compHigh4 = (TextView) view.findViewById(R.id.comphigh4);

        compHigh.setText(highScore1);
        compHigh1.setText(highScore5);
        compHigh2.setText(highScore4);
        compHigh3.setText(highScore2);
        compHigh4.setText(highScore3);

        return view;
    }
}

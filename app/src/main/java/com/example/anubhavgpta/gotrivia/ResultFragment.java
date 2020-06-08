package com.example.anubhavgpta.gotrivia;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;

public class ResultFragment extends Fragment {

    TextView attempt , correct, incorrect, comment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.result_fragment, container,false);

        Bundle args = getArguments();

        attempt = (TextView) view.findViewById(R.id.attempted1);
        correct = (TextView) view.findViewById(R.id.correct);
        incorrect = (TextView) view.findViewById(R.id.incorrect);
        comment = (TextView) view.findViewById(R.id.commentary);

        final MediaPlayer end1 = MediaPlayer.create(getActivity() ,R.raw.end);

        end1.start();

        attempt.setText(String.valueOf(args.getString("attempted")));
        correct.setText(String.valueOf(args.getString("correct")));
        incorrect.setText(String.valueOf(args.getString("incorrect")));
        comment.setText(String.valueOf(args.getString("comment")));

        return view;
    }
}

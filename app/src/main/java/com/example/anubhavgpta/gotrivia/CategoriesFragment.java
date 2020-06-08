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

public class CategoriesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categories, container,false);

        Button btn1goquest = (Button) view.findViewById(R.id.goquest);
        btn1goquest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QuestionFragment questionFragment = new QuestionFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.fragment_container, questionFragment, questionFragment.getTag()).commit();
            }
        });

        Button btn2goquest = (Button) view.findViewById(R.id.goquest1);
        btn2goquest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Question1Fragment question1Fragment = new Question1Fragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.fragment_container, question1Fragment, question1Fragment.getTag()).commit();
            }
        });
        Button btn3goquest = (Button) view.findViewById(R.id.goquest2);
        btn3goquest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Question2Fragment question2Fragment = new Question2Fragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.fragment_container, question2Fragment, question2Fragment.getTag()).commit();
            }
        });
        Button btn4goquest = (Button) view.findViewById(R.id.goquest3);
        btn4goquest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Question3Fragment question3Fragment = new Question3Fragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.fragment_container, question3Fragment, question3Fragment.getTag()).commit();
            }
        });
        Button btn5goquest = (Button) view.findViewById(R.id.goquest4);
        btn5goquest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Question4Fragment question4Fragment = new Question4Fragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.fragment_container, question4Fragment, question4Fragment.getTag()).commit();
            }
        });
        return view;
    }
}

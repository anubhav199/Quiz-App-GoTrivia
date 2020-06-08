package com.example.anubhavgpta.gotrivia;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Question2Fragment extends Fragment {
    RadioButton radio_button1, radio_button2, radio_button3, radio_button4;
    TextView text_view_quest, score, question_num;
    Button result;
    RadioGroup radioGroup;

    private static final long COUNTDOWN_IN_MILLIS =30000;
    private Questions2 nQuestions = new Questions2();
    private String nAnswer;
    private TextView countdown;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;
    private int nScore = 0;
    private int questnum = 1;
    private ColorStateList textColorDefaultRb;
    private ColorStateList textColorDefaultCd;
    private boolean answered;
    private int nQuestionsLength = nQuestions.nQuestions.length;

    Random r;
    int a, attempting = 0, incorrectAns;
    List<Integer> holder = new ArrayList();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question_2, container,false);
        radio_button1 = (RadioButton) view.findViewById(R.id.radio_button_1);
        radio_button2 = (RadioButton) view.findViewById(R.id.radio_button_2);
        radio_button3 = (RadioButton) view.findViewById(R.id.radio_button_3);
        radio_button4 = (RadioButton) view.findViewById(R.id.radio_button_4);
        text_view_quest = (TextView) view.findViewById(R.id.text_view_question);
        radioGroup = (RadioGroup) view.findViewById(R.id.radio_groups);
        result = (Button) view.findViewById(R.id.result);
        score = (TextView) view.findViewById(R.id.score);
        question_num = (TextView) view.findViewById(R.id.myTextView);
        countdown = (TextView) view.findViewById(R.id.countdown);

        textColorDefaultRb = radio_button1.getTextColors();
        textColorDefaultCd = countdown.getTextColors();

        final MediaPlayer rightAns = MediaPlayer.create(getActivity() ,R.raw.right);
        final MediaPlayer wrongAns = MediaPlayer.create(getActivity() ,R.raw.wrong);
        final MediaPlayer quest = MediaPlayer.create(getActivity() ,R.raw.next);

        r = new Random();

        timeLeftInMillis = COUNTDOWN_IN_MILLIS;
        startCountDown();
        score.setText("Score: " + nScore);
        question_num.setText(questnum + ":");
        for (int i = 0; i < 15; i++) {
            a = r.nextInt(nQuestionsLength);
            if (!holder.contains(a)) {
                holder.add(a);
                updateQuestion(a);
                break;
            }
        }

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answered){
                    attempting = attempting + 1;
                }
                if(((radio_button1.isChecked() && radio_button1.getText() == nAnswer) || (radio_button2.isChecked() && radio_button2.getText() == nAnswer) || (radio_button3.isChecked() && radio_button3.getText() == nAnswer) || (radio_button4.isChecked() && radio_button4.getText() == nAnswer))&& (result.getText()=="Confirm")){
                    rightAns.start();
                }else if((result.getText() != "Next")&&(result.getText() != "Finish")&&(result.getText() != "View Score!")){
                    wrongAns.start();
                }else{
                    quest.start();
                }
                incorrectAns = attempting - nScore;
                if (!answered) {
                    if (radio_button1.isChecked() || radio_button2.isChecked() || radio_button3.isChecked()|| radio_button4.isChecked()){
                        checkAnswer();
                    } else {
                        Toast.makeText(getActivity(), "Please select an answer!", Toast.LENGTH_SHORT).show();
                    }
                }else if(answered && questnum != 8){
                    showNextQuestion();
                }else {
                    ResultFragment resultFragment = new ResultFragment();
                    Bundle args = new Bundle();
                    SharedPreferences pref1 = getActivity().getPreferences(Context.MODE_PRIVATE);
                    SharedPreferences.Editor edt = pref1.edit();
                    edt.putString("highScore3", String.valueOf(nScore));
                    edt.commit();
                    if(nScore <= 3){
                        args.putString("comment" , "Brush Your Knowledge!");
                    }else if((nScore >3) && (nScore <= 7)){
                        args.putString("comment" , "Good, Keep it up!");
                    }else {
                        args.putString("comment" , "Awesome!!!");
                    }
                    args.putString("attempted" , String.valueOf(attempting));
                    args.putString("correct" , String.valueOf(nScore));
                    args.putString("incorrect" , String.valueOf(incorrectAns));
                    resultFragment.setArguments(args);
                    getFragmentManager().beginTransaction().replace(R.id.fragment_container, resultFragment).commit();

                }
            }
        });

        return view;
    }
    private void updateQuestion ( int num){
        text_view_quest.setText(nQuestions.getQuestions(num));
        radio_button1.setText(nQuestions.getChoice1(num));
        radio_button2.setText(nQuestions.getChoice2(num));
        radio_button3.setText(nQuestions.getChoice3(num));
        radio_button4.setText(nQuestions.getChoice4(num));

        nAnswer = nQuestions.getCorrectAnswer(num);
    }
    private void showSolution(){
        radio_button1.setTextColor(Color.RED);
        radio_button2.setTextColor(Color.RED);
        radio_button3.setTextColor(Color.RED);
        radio_button4.setTextColor(Color.RED);

        if(nAnswer == radio_button1.getText()){
            radio_button1.setTextColor(Color.GREEN);
        }else if(nAnswer == radio_button2.getText()){
            radio_button2.setTextColor(Color.GREEN);
        }else if(nAnswer == radio_button3.getText()){
            radio_button3.setTextColor(Color.GREEN);
        }else if(nAnswer == radio_button4.getText()){
            radio_button4.setTextColor(Color.GREEN);
        }

        radio_button1.setEnabled(false);
        radio_button2.setEnabled(false);
        radio_button3.setEnabled(false);
        radio_button4.setEnabled(false);

        if(questnum < 8){
            result.setText("Next");
        }else{
            result.setText("Finish");
        }
    }
    private void showNextQuestion(){
        radio_button1.setTextColor(textColorDefaultRb);
        radio_button2.setTextColor(textColorDefaultRb);
        radio_button3.setTextColor(textColorDefaultRb);
        radio_button4.setTextColor(textColorDefaultRb);
        radioGroup.clearCheck();

        radio_button1.setEnabled(true);
        radio_button2.setEnabled(true);
        radio_button3.setEnabled(true);
        radio_button4.setEnabled(true);

        if(questnum < 8) {
            questnum++;
            question_num.setText(questnum + ":");
            for (int i = 0; i < 15; i++) {
                a = r.nextInt(nQuestionsLength);
                if (!holder.contains(a)) {
                    holder.add(a);
                    updateQuestion(a);
                    break;
                }
            }
            answered = false;
            result.setText("Confirm");

        }
    }

    private void checkAnswer(){
        answered = true;
        RadioButton rbSelected = getView().findViewById(radioGroup.getCheckedRadioButtonId());

        if (rbSelected.getText() == nAnswer) {
            nScore++;
            score.setText("Score:" + nScore);
        }
        showSolution();
    }

    private void startCountDown(){
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long l) {
                timeLeftInMillis = l;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timeLeftInMillis = 0;
                questnum = 8;
                answered = true;
                showSolution();
                countdown.setText("00:00");
                countdown.setTextColor(Color.RED);
                result.setText("View Score!");

            }
        }.start();
    }

    private void updateCountDownText(){
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;

        String timeFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        countdown.setText(timeFormatted);

        if(timeLeftInMillis < 10000) {
            countdown.setTextColor(Color.RED);
        }else {
            countdown.setTextColor(textColorDefaultCd);
        }
    }

}

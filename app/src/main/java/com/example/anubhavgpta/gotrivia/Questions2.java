package com.example.anubhavgpta.gotrivia;

public class Questions2 {
    public String nQuestions[] = {
            "Which one is the first planet in the solar system?",
            "Which one is the second planet in the solar system?",
            "Which one is the third planet in the solar system?",
            "Which one is the fourth planet in the solar system?",
            "Which one is the fifth planet in the solar system?",
            "Which one is the sixth planet in the solar system?",
            "Which one is the seventh planet in the solar system?",
            "Which one is the eighth planet in the solar system?",
            "Which one is the ninth planet in the solar system?"
    };

    private String nChoices[][] = {
            {"Mercury", "Venus", "Mars", "Saturn"},
            {"Mercury", "Venus", "Neptune", "Saturn"},
            {"Mercury", "Earth", "Mars", "Saturn"},
            {"Earth", "Venus", "Mars", "Saturn"},
            {"Mercury", "Jupiter", "Mars", "Saturn"},
            {"Mercury", "Saturn", "Mars", "Uranus"},
            {"Mercury", "Venus", "Mars", "Uranus"},
            {"Mercury", "Neptune", "Mars", "Saturn"},
            {"Pluto", "Venus", "Mars", "Saturn"}
    };

    private String nCorrectAnswers[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

    public String getQuestions(int a) {
        String question = nQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = nChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = nChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = nChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = nChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = nCorrectAnswers[a];
        return answer;
    }

}

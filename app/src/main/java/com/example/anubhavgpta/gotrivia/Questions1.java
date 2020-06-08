package com.example.anubhavgpta.gotrivia;

public class Questions1 {
    public String nQuestions[] = {
            "Subroto cup is associated with",
            "2014 FIFA World Cup will be held in",
            "2010 winter Olympic was held in",
            "Wilson Jones is associated with",
            "The term “Slam” is associated with",
            "2010 Commonwealth Games held in",
            "The term“Googly” is associated with",
            "Krishna Poonia is associated with",
            "In 1924 the first winter Olympics was held in",
            "The 2014 football world cup is scheduled to be held in",
            "How many gold medals won by India in 2010 Commonwealth Games?",
            "Mahesh Bhupathi is associated with",
            "Ronaldo is associated with",
            "2009 Davis cup was won by",
            "India first took part in the olympic games in the year?"
    };

    private String nChoices[][] = {
            {"Cricket", "Football", "Chess", "Golf"},
            {"India", "Brazil", "Germany", "London"},
            {"USA", "Russia", "Vancouver", "Australia"},
            {"Hockey", "Golf", "Billiards", "Air–race"},
            {"Cricket", "Tennis", "Boxing", "Football"},
            {"Canada", "India", "Britian", "Malaysia"},
            {"Cricket", "Football", "Badminton", "Hockey"},
            {"Football", "Hockey", "Chess", "Athletics"},
            {"Italy", "France", "Austria", "Canada"},
            {"China", "Brazil", "Japan", "Australia"},
            {"30", "32", "36", "38"},
            {"Chess", "Cricket", "Lawn Tennis", "Table Tennis"},
            {"Cricket", "Football", "Hockey", "Tennis"},
            {"France", "Spain", "US", "Czech Republic"},
            {"1920", "1928", "1972", "1974"}
    };

    private String nCorrectAnswers[] = {"Football", "London", "Vancouver", "Billiards", "Tennis", "India", "Cricket", "Chess", "France", "Brazil", "38", "Lawn Tennis", "Football", "Spain", "1920"};

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

package com.example.anubhavgpta.gotrivia;

public class Questions4 {
    public String nQuestions[] = {
            "Who decides the office of profit?",
            "Who among the following is constitution empowered to declare a geographic area as a scheduled area?",
            "In which of the following houses the chairperson is not the member of that house?",
            "The Prime Minister of India is the head of the",
            "Money bill is introduced in",
            "State Governor is appointed by",
            "Parliamentary Supremacy is the definite feature of the political system in",
            "Right to vote is a",
            "Who is called the Guardian of public purse?",
            "The allocation of seats in the present Lok Sabha is based on which one of the following census?",
            "The chairman of the Lok Sabha is designated as",
            "By which bill the Government proposes the collection of revenues for a year?",
    };

    private String nChoices[][] = {
            {"President & Governer", "Union Parliament", "Supreme Court", "High Court"},
            {"Chief Minister", "Prime Minister", "President", "Governor"},
            {"Legislative Assembly", "Legislative council", "Lok SabhaD", "Rajya Sabha"},
            {"State Government", "Central GovernmentC", "Both", "None of these"},
            {"Lok Sabha", "Rajya sabha", "Joint of both", "None of the above"},
            {"Prime Minister", "Chief Justice", "President of India", "Central Cabinet"},
            {" India", "UK", "Australia", "Canada"},
            {" Social Right", "Personal Right", "Political Right", "Legal Right"},
            {"Comptroller", "Auditor General", "President", "Both A and B"},
            {"1971", "1981", "1991", "2001"},
            {"Chairman", "Speaker", "Vice President", "President"},
            {"Economic Bill", "Finance Bill", "Supplementary Bill",  "None of these"}
    };

    private String nCorrectAnswers[] = {"President & Governer", "President", "Rajya Sabha", "Central Government", "Lok Sabha", "President of India", "UK", "Political Right", "Both A and B", "1971", "Speaker", "Finance Bill"};

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

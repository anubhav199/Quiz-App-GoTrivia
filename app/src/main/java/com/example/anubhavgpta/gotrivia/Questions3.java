package com.example.anubhavgpta.gotrivia;

public class Questions3 {
    public String nQuestions[] = {
            "The study of flowers is called",
            "Which of the following plays an important part in photosynthesis?",
            "The largest flightless bird which can run most fastly is",
            "AIDS is caused by Human Immunodeficiency Virus (HIV), which is",
            "The most abundant green house gas is",
            "The gas which has the highest mass energy content is",
            "Who is the father of discoveries?",
            "X–rays travel with the velocity of",
            "Power of a lens is measured in",
            "Bhabha Atomic Research Centre(BARC) is located at",
            "Power reactor is located in Tamil Nadu at",
            "Which one of the following is also called Stranger Gas?",
            "For which one of the following is the density maximum?",
            "The alcohol used in power alcohol is",
            "The reaction between methane and chlorine in diffused sunlight is"
    };

    private String nChoices[][] = {
            {"Phynology", "Polinology", "Agrestology", "Anthology"},
            {"Nemaoblast", "Chloroplast", "Centrosome", "Tonoplast"},
            {"Kiwi", "Penguin", "Amu", "Ostrich"},
            {"Lente virus", "Immune virus", "Retro virus", "Arbo virus"},
            {"CO2", "O3", "SO2", "NO2"},
            {"Hydrogen", "Gober gas", "Natural gas", "Butane"},
            {"Edison", "Pascal", "Einstein", "Archimedes"},
            {"positive rays", "sound", "light", "alpha rays"},
            {"ultrasonic unit", "decibel", "dioptre", "magnification"},
            {"Colaba", "Trombay", "Malabar", "Juhu"},
            {"Kalpakkam", "Sriharikota", "Tuticorn", "Pudukottai"},
            {"Neon", "Argon", "Xenon", "Nitrous oxide"},
            {"Ice", "Water", "Benzene", "Chloroform"},
            {"propanol", "ethyl alcohol", "methyl alcohol", "ethylene glycol"},
            {"oxidation", "reduction", "polymerisation", "substitution"}
    };

    private String nCorrectAnswers[] = {"Anthology", "Chloroplast", "Ostrich", "Retro virus", "CO2", "Hydrogen", "Archimedes", "light", "dioptre", "Trombay", "Kalpakkam", "Xenon", "Water", "ethyl alcohol", "substitution"};

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

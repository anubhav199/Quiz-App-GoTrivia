package com.example.anubhavgpta.gotrivia;

public class Questions {

    public String nQuestions[] = {
            "Which of the following memories is an optical memory?",
            "Which of the following is an example of non volatile memory?",
            "Java was originally invented by",
            "The unit of speed used for super computer is",
            "Whose trademark is the operating system UNIX?",
            "The first mechanical computer designed by Charles Babbage was called",
            "Which of the following is the most powerful type of computer?",
            "Which gate is a single integrated circuit?",
            "Web pages are written using",
            "Find the odd one out.",
            "The parity bit is added for the purpose of",
            "India’s first super computer is",
            "Which of the following is NOT operating system?",
            "The computer that is not considered as a portable computer is",
            "One byte is equivalent to"
    };

    private String nChoices[][] = {
            {"Floppy Disk", "Bubble Memories", "CD–ROM", "Core Memories"},
            {"VLSI", "LSI", "ROM", "RAM"},
            {"Oracle", "Microsoft", "Novell", "Sun"},
            {"KELOPS", "GELOPS", "MELOPS", "None of these"},
            {"Motorola", "Microsoft", "BELL Laboratories", "AshtonTate"},
            {"Abacus", "Analytical Engine", "Calculator", "Processor"},
            {"Super–micro", "Super conductor", "Super computer", "Megaframe"},
            {"Gate", "Mother Board", "Chip", "CPU"},
            {"FTP", "HTTP", "HTML", "URL"},
            {"Coaxial cable", "Microwaves", "Optical fibre", "Twisted pair wire"},
            {" Coding", "Error detection", "Controlling", "Indexing"},
            {"Agni", "Flow solver", "Param", "Trisul"},
            {"Dos", "Unix", "Window NT", "Java"},
            {"Laptop computer", "Mini computer", "Notebook computer", "None of these"},
            {" 4 bits", "8 bits", "12 bits", "32 bits"}
    };

    private String nCorrectAnswers[] = {"CD–ROM", "ROM", "Sun", "GELOPS", "BELL Laboratories", "Analytical Engine", "Super computer", "Gate", "HTML", "Microwaves", "Error detection", "Param", "Java", "Mini computer", "8 bits", ""};

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

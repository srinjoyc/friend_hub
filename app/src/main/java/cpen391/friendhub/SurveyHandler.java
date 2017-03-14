package cpen391.friendhub;

/**
 * Created by Ryan on 2017-03-13.
 */



public class SurveyHandler {
    double att1; //extraversion;
    double att2; //openness;
    double att3; //agreeableness;
    double att4; //conscientiousness;
    double att5; //neuroticism;

    final int numQuestions = 2;


    int att1Scores[] = new int[numQuestions];
    int att2Scores[] = new int[numQuestions];
    int att3Scores[] = new int[numQuestions];
    int att4Scores[] = new int[numQuestions];
    int att5Scores[] = new int[numQuestions];

    public double getAttributeSurveyScore(int attributeNumber){
        compileSurveyScores();
        switch (attributeNumber){
            case 1:
                return att1;
            case 2:
                return att2;
            case 3:
                return att3;
            case 4:
                return att4;
            case 5:
                return att5;
        }
        return 0;
    }

    public void submitSurveyScore(int attributeNumber,int questionNumber, int score){
        switch (attributeNumber){
            case 1:
                att1Scores[questionNumber-1] = score;
            case 2:
                att2Scores[questionNumber-1] = score;
            case 3:
                att3Scores[questionNumber-1] = score;
            case 4:
                att4Scores[questionNumber-1] = score;
            case 5:
                att5Scores[questionNumber-1] = score;
        }
    }

    public void compileSurveyScores(){
        for(int i : att1Scores) att1+=i/numQuestions;

        for(int i : att2Scores) att2+=i/numQuestions;

        for(int i : att3Scores) att3+=i/numQuestions;

        for(int i : att4Scores) att4+=i/numQuestions;

        for(int i : att5Scores) att5+=i/numQuestions;
    }

    //TODO: ADD RETURN QUESTIONS
    public String getQuestionText(int attributeNumber, int questionNumber) {
        return "Stand in"+ attributeNumber + questionNumber;
    }
}
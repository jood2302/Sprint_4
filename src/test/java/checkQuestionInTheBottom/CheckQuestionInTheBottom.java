package checkQuestionInTheBottom;

import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import pom.MainPage;

public class CheckQuestionInTheBottom {

    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    public void creatOrderForSamokatWithTopButton() {

        MainPage objCheckAnswerIsRelatedQuestion = new MainPage(browserRule.driver);

        objCheckAnswerIsRelatedQuestion.open();

        objCheckAnswerIsRelatedQuestion.checkAnswerIsRelatedQuestionOne();
        objCheckAnswerIsRelatedQuestion.checkAnswerIsRelatedQuestionTwo();
        objCheckAnswerIsRelatedQuestion.checkAnswerIsRelatedQuestionThree();
        objCheckAnswerIsRelatedQuestion.checkAnswerIsRelatedQuestionFour();
        objCheckAnswerIsRelatedQuestion.checkAnswerIsRelatedQuestionFive();
        objCheckAnswerIsRelatedQuestion.checkAnswerIsRelatedQuestionSix();
        objCheckAnswerIsRelatedQuestion.checkAnswerIsRelatedQuestionSeven();
        objCheckAnswerIsRelatedQuestion.checkAnswerIsRelatedQuestionEight();
    }
}

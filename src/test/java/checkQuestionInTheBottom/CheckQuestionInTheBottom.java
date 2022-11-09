package checkQuestionInTheBottom;

import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pom.MainPage;

@RunWith(Parameterized.class)
public class CheckQuestionInTheBottom {

    @Rule
    public BrowserRule browserRule = new BrowserRule();

    private final int questionIndex;
    private final int answerIndex;
    public CheckQuestionInTheBottom(int questionIndex, int answerIndex) {
        this.questionIndex = questionIndex;
        this.answerIndex = answerIndex;
        }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {2, 2},
                {3, 3},
                {4, 4},
                {5, 5},
                {6, 6},
                {7, 7},
        };
    }
    @Test
    public void checkQuestionAndAnswer() {
        MainPage objCheckAnswerIsRelatedQuestion = new MainPage(browserRule.driver);

        objCheckAnswerIsRelatedQuestion.open();

        objCheckAnswerIsRelatedQuestion.checkAnswerIsRelatedQuestionOne(questionIndex, answerIndex);
    }
}

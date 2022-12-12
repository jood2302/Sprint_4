package ordersamokat;

import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import pom.FirstOrderPage;
import pom.MainPage;
import pom.SecondOrderPage;

public class CheckOrderSamokatWithDownButton {

    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    public void creatOrderForSamokatWithTopButton() {

        MainPage objMainPageForTopButton = new MainPage(browserRule.driver);

        objMainPageForTopButton.open();
        objMainPageForTopButton.clickDownButton();

        FirstOrderPage objFirstOrderPage = new FirstOrderPage(browserRule.driver);

        objFirstOrderPage.fillFirstForm("Серджио","Уравин", "Печеры, агенство таки", "88114852525");

        SecondOrderPage objSecondOrderPage = new SecondOrderPage(browserRule.driver);

        objSecondOrderPage.fillSecondForm("01.01.2035","Не спешите");
    }
}

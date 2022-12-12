package ordersamokat;

import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import pom.FirstOrderPage;
import pom.MainPage;
import pom.SecondOrderPage;

public class CheckOrderSamokatWithTopButton {

    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    public void creatOrderForSamokatWithTopButton() {

        MainPage objMainPageForTopButton = new MainPage(browserRule.driver);

        objMainPageForTopButton.open();
        objMainPageForTopButton.clickTopButton();

        FirstOrderPage objFirstOrderPage = new FirstOrderPage(browserRule.driver);

        objFirstOrderPage.fillFirstForm("Грегори","Куплянов", "Боярская ул. дом 7", "88005553535");

        SecondOrderPage objSecondOrderPage = new SecondOrderPage(browserRule.driver);

        objSecondOrderPage.fillSecondForm("01.01.2025","Побыстрее");    }
}

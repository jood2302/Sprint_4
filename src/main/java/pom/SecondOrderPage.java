package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SecondOrderPage {
    private WebDriver driver;

    /// Поле выбора даты заказа
    private By date = By.xpath(".//input[contains(@class, 'Input_Responsible__1jDKN') and (@placeholder= '* Когда привезти самокат')]");

    /// Поле выбора срока заказа
    private By orderTime= By.className("Dropdown-control");

    /// Выбор времени
    private By oneDay= By.xpath(".//div[contains(@class, 'Dropdown-option') and (text()= 'сутки')]");

    /// Поле выбора  черного цвета
    private By pickcolor = By.className("Checkbox_Input__14A2w");

    /// Поле комментария для курьера
    private By comment = By.xpath(".//input[contains(@class, 'Input_Responsible__1jDKN') and (@placeholder= 'Комментарий для курьера')]");

    /// Кнопка итогового заказа заказа
    private By finishOrderButton = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM') and (text()= 'Заказать')]");

    /// Кнопка согласия на подтверждение заказа
    private By agreementButton = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM') and (text()= 'Да')]");

    /// Появление в окне кнопки просмотра успешного заказа
    private By statusButton = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM') and (text()= 'Посмотреть статус')]");


    public SecondOrderPage(WebDriver driver){
        this.driver = driver;
    }

    public void setDate(String userdate) {
        driver.findElement(date).sendKeys(userdate, Keys.ENTER);
    }
    public void setOrderTime() {
        driver.findElement(orderTime).click();
        driver.findElement(oneDay).click();
    }

    public void clickColor() {
        driver.findElement(pickcolor).click();
    }

    public void setComment(String usercomment) {
        driver.findElement(comment).sendKeys(usercomment);
    }

    public void clickNextnButton() {
        driver.findElement(finishOrderButton).click();
    }

    public void clickAgreementnButton() {
        driver.findElement(agreementButton).click();
    }

    public void successfulOrderCreation() {
        Assert.assertTrue("Заказ не был создан. Кнопка просмотра статуса заказа не появилась", driver.findElement(statusButton).isDisplayed());
        driver.findElement(statusButton).click();
    }

    public void fillSecondForm(String userdate, String usercomment) {
        setDate(userdate);
        setOrderTime();
        clickColor();
        setComment(usercomment);
        clickNextnButton();
        clickAgreementnButton();
        successfulOrderCreation();
    }
}

package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    private final String url = "https://qa-scooter.praktikum-services.ru/";

    ///Кнопка заказа в верхней части страницы
    private By topButton = By.xpath(".//button[@class='Button_Button__ra12g']");

    ///Кнопка coockie
    private By cookieButton = By.xpath(".//button[@class='App_CookieButton__3cvqF']");

    ///Кнопка заказа в нижней части страницы
    private By downButton = By.xpath(".//button[contains(@class, 'Button_Button__ra12g Button_Middle__1CSJM') and (text()='Заказать')]");

    ///Поиск вопросов
    private By question = By.className("accordion__button");
    ///Поиск ответов
    private By answer = By.className("accordion__panel");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
    }

    public void clickTopButton() {
        driver.findElement(topButton).click();
    }

    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }
    public void clickDownButton() {
        clickCookieButton();
        driver.findElement(downButton).click();
    }

    public void checkAnswerIsRelatedQuestionOne(int questionIndex, int answerIndex) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElements(question).get(questionIndex));
        driver.findElements(question).get(questionIndex).click();
        Assert.assertTrue("Для вопроса №"+(questionIndex+1)+", не показан ответ", driver.findElements(answer).get(answerIndex).isDisplayed());

    }
}

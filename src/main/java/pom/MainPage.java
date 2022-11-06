package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    ///Первый вопрос
    private By questionOne = By.id("accordion__heading-0");
    ///Первый ответ
    private By answerOne = By.id("accordion__panel-0");

    ///Второй вопрос
    private By questionTwo = By.id("accordion__heading-1");
    ///Второй ответ
    private By answerTwo = By.id("accordion__panel-1");

    ///Третий вопрос
    private By questionThree = By.id("accordion__heading-2");
    ///Третий ответ
    private By answerThree = By.id("accordion__panel-2");

    ///Четвертый вопрос
    private By questionFour = By.id("accordion__heading-3");
    ///Четвертый ответ
    private By answerFour = By.id("accordion__panel-3");

    ///Пятый вопрос
    private By questionFive = By.id("accordion__heading-4");
    ///Пятый ответ
    private By answerFive = By.id("accordion__panel-4");

    ///Шестой вопрос
    private By questionSix = By.id("accordion__heading-5");
    ///Шестой ответ
    private By answerSix = By.id("accordion__panel-5");

    ///Седьмой вопрос
    private By questionSeven = By.id("accordion__heading-6");
    ///Седьмой ответ
    private By answerSeven = By.id("accordion__panel-6");

    ///Восьмой вопрос
    private By questionEight = By.id("accordion__heading-7");
    ///Восьмой ответ
    private By answerEight = By.id("accordion__panel-7");

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

    public void checkAnswerIsRelatedQuestionOne() {
        driver.findElement(questionOne).sendKeys(Keys.RETURN);;
        Assert.assertTrue("Для вопроса №1, не показан ответ", driver.findElement(answerOne).isDisplayed());

    }

    public void checkAnswerIsRelatedQuestionTwo() {
        driver.findElement(questionTwo).sendKeys(Keys.RETURN);
        Assert.assertTrue("Для вопроса №2, не показан ответ", driver.findElement(answerTwo).isDisplayed());
    }

    public void checkAnswerIsRelatedQuestionThree() {
        driver.findElement(questionThree).sendKeys(Keys.RETURN);
        Assert.assertTrue("Для вопроса №3, не показан ответ", driver.findElement(answerThree).isDisplayed());
    }

    public void checkAnswerIsRelatedQuestionFour() {
        driver.findElement(questionFour).sendKeys(Keys.RETURN);
        Assert.assertTrue("Для вопроса №4, не показан ответ", driver.findElement(answerFour).isDisplayed());
    }

    public void checkAnswerIsRelatedQuestionFive() {
        driver.findElement(questionFive).sendKeys(Keys.RETURN);
        Assert.assertTrue("Для вопроса №5, не показан ответ", driver.findElement(answerFive).isDisplayed());
    }

    public void checkAnswerIsRelatedQuestionSix() {
        driver.findElement(questionSix).sendKeys(Keys.RETURN);
        Assert.assertTrue("Для вопроса №6, не показан ответ", driver.findElement(answerSix).isDisplayed());
    }

    public void checkAnswerIsRelatedQuestionSeven() {
        driver.findElement(questionSeven).sendKeys(Keys.RETURN);
        Assert.assertTrue("Для вопроса №7, не показан ответ", driver.findElement(answerSeven).isDisplayed());
    }

    public void checkAnswerIsRelatedQuestionEight() {
        driver.findElement(questionEight).sendKeys(Keys.RETURN);
        Assert.assertTrue("Для вопроса №8, не показан ответ", driver.findElement(answerEight).isDisplayed());
    }
}

package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FirstOrderPage {
    private WebDriver driver;

    ///Поле ввода Имени
    private By name = By.xpath(".//input[contains(@class, 'Input_Responsible__1jDKN') and (@placeholder= '* Имя')]");

    ///Поле ввода Фамилии
    private By surname = By.xpath(".//input[contains(@class, 'Input_Responsible__1jDKN') and (@placeholder= '* Фамилия')]");

    ///Поле ввода адреса
    private By address = By.xpath(".//input[contains(@class, 'Input_Responsible__1jDKN') and (@placeholder= '* Адрес: куда привезти заказ')]");

    ///Поле выбора станция метро
    private By subway = By.xpath(".//input[@class='select-search__input']");

    ///Поле ввода телефона
    private By phone = By.xpath(".//input[contains(@class, 'Input_Responsible__1jDKN') and (@placeholder= '* Телефон: на него позвонит курьер')]");

    /// Кнопка Далее для оформления заказа
    private By next = By.xpath(".//button[text()='Далее']");

    public FirstOrderPage(WebDriver driver){
        this.driver = driver;
    }

    public void setName(String username) {
        driver.findElement(name).sendKeys(username);
    }
    public void setSurname(String usersurname) {
        driver.findElement(surname).sendKeys(usersurname);
    }

    public void setAdress(String usersadress) {
        driver.findElement(address).sendKeys(usersadress);
    }

    public void setSubway() {
        driver.findElement(subway).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

    }

    public void setPhone(String userphone) {
        driver.findElement(phone).sendKeys(userphone);
    }

    public void clickNextnButton() {
        driver.findElement(next).click();
    }

    public void fillFirstForm(String username, String usersurname, String usersadress,
                              String userphone) {
        setName(username);
        setSurname(usersurname);
        setAdress(usersadress);
        setSubway();
        setPhone(userphone);
        clickNextnButton();
    }
}

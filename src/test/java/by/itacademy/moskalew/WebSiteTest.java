package by.itacademy.moskalew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSiteTest {
    @Test
    public void testOnlinerLoginButton() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

        String enterButtonLocator = "//*[@id=\"userbar\"]/div[1]/div/div/div[1]";
        By enterButtonBy = By.xpath(enterButtonLocator);
        WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
        enterButtonWebElement.click();

        String enterTitleAuthFormLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/div[1]";
        By enterTitleAuthFormBy = By.xpath(enterTitleAuthFormLocator);
        WebElement enterTitleAuthFormWebElement = driver.findElement(enterTitleAuthFormBy);
        String actual = enterTitleAuthFormWebElement.getText();

        String expected = "Вход";
        Assertions.assertEquals(expected, actual);
        driver.close();
    }

    @Test
    public void devBy() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://devby.io/");

        String enterButtonLocator = "/html/body/div[2]/header/div[1]/div[3]/a";
        By enterButtonBy = By.xpath(enterButtonLocator);
        WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
        enterButtonWebElement.click();

        String enterTitleAuthFormLocator = "/html/body/div[1]/div/div/div/div/ul/a[1]";
        By enterTitleAuthFormBy = By.xpath(enterTitleAuthFormLocator);
        Thread.sleep(4000);

        By inputLoginBy = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/form/ul/li[1]/input");
        WebElement inputLoginByWebelement = driver.findElement(inputLoginBy);
        inputLoginByWebelement.sendKeys("qwerty");
        Thread.sleep(4000);
        By inputPasswordBy = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/form/ul/li[2]/div/input");
        WebElement inputPasswordWebelement = driver.findElement(inputPasswordBy);
        inputPasswordWebelement.sendKeys("12345");

        By buttonEnterBy = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/form/button");
        WebElement buttonEnterWebelement = driver.findElement(buttonEnterBy);
        buttonEnterWebelement.click();
        Thread.sleep(4000);
        By textErrorMessegeBy = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/form/span");
        WebElement textErrorMessegeWebelement = driver.findElement(textErrorMessegeBy);
        String actual = textErrorMessegeWebelement.getText();

        String expected = "Неверный логин или пароль.";
        Assertions.assertEquals(expected, actual);
        driver.close();
    }

    @Test
    public void testJavaRush() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://javarush.com/");

        String enterButtonLocator = "//*[@id=\"button_menu_start_learning_unauthorized_user\"]";
        By enterButtonBy = By.xpath(enterButtonLocator);
        Thread.sleep(2000);
        WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
        enterButtonWebElement.click();

        String enterTitleAuthFormLocator = "//*[@id=\"id_button_jr_welcome_start_learning_1\"]";
        By enterTitleAuthFormBy = By.xpath(enterTitleAuthFormLocator);
        WebElement enterTitleAuthFormWebElement = driver.findElement(enterTitleAuthFormBy);
        String actual = enterTitleAuthFormWebElement.getText();

        String expected = "НАЧАТЬ";
        Assertions.assertEquals(expected, actual);
        driver.close();
    }

    @Test
    public void testOnliner() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

        String enterButtonLocator = "//*[@id=\"userbar\"]/div[1]/div/div/div[1]";
        By enterButtonBy = By.xpath(enterButtonLocator);
        WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
        enterButtonWebElement.click();

        String buttonEnter = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/button";
        By buttonEnterBy = By.xpath(buttonEnter);
        WebElement buttonEnterWebElement = driver.findElement(buttonEnterBy);
        buttonEnterWebElement.click();

        String errorMassageLogin = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div[2]/div";
        By errorMassageLoginBy = By.xpath(errorMassageLogin);
        WebElement errorMassageLoginWebElement = driver.findElement(errorMassageLoginBy);
        String actualErrorMassageLogin = errorMassageLoginWebElement.getText();
        String expectedErrorMassageLogin = "Укажите ник или e-mail";
        Assertions.assertEquals(expectedErrorMassageLogin, actualErrorMassageLogin);

        String errorMassagePassword = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div";
        By errorMassagePasswordBy = By.xpath(errorMassagePassword);
        WebElement errorMassagePasswordWebElement = driver.findElement(errorMassagePasswordBy);
        String actualErrorMassagePassword = errorMassagePasswordWebElement.getText();
        String expectedErrorMassagePassword = "Укажите пароль";
        Assertions.assertEquals(expectedErrorMassagePassword, actualErrorMassagePassword);
    }
}

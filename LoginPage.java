package pages;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    String baseURL = "https://saucedemo.com";
    public LoginPage basePage(){
    driver.get(baseURL);
    return this;
    }


    }
    


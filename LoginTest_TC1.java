package tests;

import org.junit.Test;

import pages.LoginPage;

public class LoginTest_TC1 extends BaseTest {

    public LoginPage loginPage;
@Test
    public void loginTC1(){
     loginPage = new LoginPage(driver);
    loginPage.basePage();

try{
 Thread.sleep(5000);
} catch(InterruptedException e){
    e.printStackTrace();
}




    }
    
}

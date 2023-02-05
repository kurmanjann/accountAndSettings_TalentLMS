package uiTests;

import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.AddUserPage;
import com.talentLMS.UI.page.AdminHomePage;
import com.talentLMS.UI.page.LoginPage;
import com.talentLMS.UI.page.accountAndSettings.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTest {

    public LoginPage loginPage;
    public AdminHomePage adminHomePage;
    public AddUserPage addUserPage;
    public WebElementActions webElementActions;
    public WebDriver driver;

    // account & settings
    public BasicSettings basicSettings;
    public Certificates certificates;
    public Domain domain;
    public E_commerce eCommerce;
    public Gamification gamification;
    public Homepage homepage;
    public Themes themes;
    public Users users;

    @BeforeClass
    public void setUpUiTest() {
        loginPage = new LoginPage();
        adminHomePage = new AdminHomePage();
        webElementActions = new WebElementActions();
        addUserPage = new AddUserPage();
        driver = Driver.getDriver();

        // account & settings
        basicSettings = new BasicSettings();
        certificates = new Certificates();
        domain = new Domain();
        eCommerce = new E_commerce();
        gamification = new Gamification();
        homepage = new Homepage();
        themes = new Themes();
        users = new Users();
    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }
}

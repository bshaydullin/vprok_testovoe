import com.codeborne.selenide.Configuration;
        import org.junit.jupiter.api.BeforeAll;
        import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.BackOffice;

public class MainTest {
    LoginPage loginPage = new LoginPage();
    BackOffice backOffice = new BackOffice();

    public String email = "vladimir.kochegarov@x5.ru";
    public String password = "123321";
    public String orderId = "126293100";

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "http://bulat.shaydullin-bo.caladan02-sel.vprok.tech";
    }

    @Test
    void loginUser() throws InterruptedException {
        loginPage.openLoginPage();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        Thread.sleep(3000);
    }
    void searchProduct() throws InterruptedException {
        backOffice.enterOrder(orderId);
        backOffice.checkForm("126293100");
        Thread.sleep(3000);
    }
}
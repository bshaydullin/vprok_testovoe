package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
        private final SelenideElement modal = $("[role=dialog]");

        public void openLoginPage() {
                open("/login");
        }

        public LoginPage enterEmail(String email) {
                $(By.name("email")).setValue(email);
                return this;
        }

        public LoginPage enterPassword(String password) {
                $(By.name("password")).setValue(password).pressEnter();
                return this;
        }
}
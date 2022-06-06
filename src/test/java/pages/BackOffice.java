package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BackOffice {
    private final SelenideElement modal = $("[role=dialog]");

    public BackOffice enterOrder(String orderId) {
        $(By.name("orderId")).setValue(orderId).pressEnter();
        return this;
    }

    public BackOffice checkForm(String value) {
        modal.$(By.id("page-wrapper")).shouldHave(Condition.text("126293100"));
        return this;
    }
}
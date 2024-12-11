package pages.components.Calendar;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationResultsModal {
    public void verifyModalAppears(){
        $(".modal-open").shouldHave(
                text("Sherzod"),
                text("Rakhmatov"),
                text("0000000001"),
                text("sheqweqw@bk.ru"));
    }
    public void verifyResult(String key, String value){
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));
    }
}

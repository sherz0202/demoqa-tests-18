package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CloseCookies {

    @Test
    void closeCookies(){
        open("https://www.otpbank.ru/retail/bank-services/");
        $(byTagAndText("strong","Закрыть")).click();
        $(withText("Продолжая просмотр сайта")).shouldBe(hidden);
        sleep(5000);
    }
}

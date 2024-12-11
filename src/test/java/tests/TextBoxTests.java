package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void BeforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void FirstTest(){
        open("/text-box");

        $("#userName").setValue("Sherzod");
        $("#userEmail").setValue("sherz0202@bk.ru");
        $("#currentAddress").setValue("Aviasozlar");
        $("#permanentAddress").setValue("1 11 1");
        $("#submit").click();


        $("#output").shouldHave(text("Sherzod"), text("sherz0202@bk.ru"), text("Aviasozlar"), text("1 11 1"));




    }
}

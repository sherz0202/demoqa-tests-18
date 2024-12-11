package tests;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationWithPageObjectTests extends TestBase {

    @Test
    void AutomationPracticeForm() {

        registrationPage.openPage()
                .setFirstName("Sherzod")
                .setLastName("Rakhmatov")
                .setEmail("sheqweqw@bk.ru")
                .setGenter("Male")
                .setNumber("0000000001")
                .setBirthDate("02","February","1998")
                .setSubject("Math")
                .setHobbies("Sports")
                .setAddress("Tash")
                .setState("NCR")
                .setCity("Delhi")
                .btnSubmit();

        //$("#uploadPicture").uploadFromClasspath("/Users/ahmadovserzod/IdeaProjects/demoqa-tests-18/src/test/pictures/1.jpg");

        registrationPage.verifyModalAppears()
                .verifyResult("Student Name", "Sherzod Rakhmatov")
                .verifyResult("Student Email", "sheqweqw@bk.ru")
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", "0000000001")
                .verifyResult("Date of Birth", "02 February,1998");



    }
}

package pages;

import pages.components.Calendar.CalendarComponent;
import pages.components.Calendar.RegistrationResultsModal;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();

    private SelenideElement
            lastNameInput = $("#lastName"),
            firstNameInput = $("#firstName"),
            emailInput = $("#userEmail"),
            genterInput = $("#genterWrapper"),
            numberInput = $("#userNumber");



    public RegistrationPage openPage(){
        open("/automation-practice-form");

        return this;
    }

    public RegistrationPage setFirstName(String value){
        $(firstNameInput).setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value){
        $(lastNameInput).setValue(value);

        return this;
    }

    public RegistrationPage setEmail(String value){
        $(emailInput).setValue(value);

        return this;
    }

    public RegistrationPage setGenter(String value){
        $(genterInput).$(byText(value)).click();

        return this;
    }

    public RegistrationPage setNumber(String value){
        $(numberInput).setValue(value);

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year){
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public RegistrationPage verifyModalAppears(){
        registrationResultsModal.verifyModalAppears();

        return this;
    }

    public RegistrationPage verifyResult(String key, String value){
        registrationResultsModal.verifyResult(key, value);

        return this;
    }

    public RegistrationPage setSubject(String value){
        $("#subjectsInput").setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setHobbies(String value){
        $("#hobbiesWrapper").$(byText(value)).click();

        return this;
    }

    public RegistrationPage setAddress(String value){
        $("#currentAddress").setValue("Tash");

        return this;
    }

    public RegistrationPage setState(String value){
        $("#state").click();
        $(byText(value)).click();

        return this;
    }

    public RegistrationPage setCity(String value){
        $("#city").click();
        $(byText(value)).click();

        return this;
    }

    public RegistrationPage btnSubmit(){
        $("#submit").click();

        return this;
    }




}

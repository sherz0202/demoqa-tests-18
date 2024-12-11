package tests;

import static com.codeborne.selenide.Selenide.$;

public class LoginPO {
    public void loginPassportAndCard(){

    }

    public void loginWithUsernamePassword(String username, String password){
        $("username").setValue(username);
        $("password").setValue(password);
        $("submit-btn").click();
        return;
    }
}

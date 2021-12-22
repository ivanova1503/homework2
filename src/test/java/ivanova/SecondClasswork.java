package ivanova;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SecondClasswork {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Yuliya");
        $("#userEmail").setValue("test@test.com");
        $("#currentAddress").setValue("Tiraspol");
        $("#permanentAddress").setValue("Moscow");
        $("#submit").click();

        $("#output #name").shouldHave(text("Yuliya"));
        // или $("#output").$("#name").shouldHave(text("Yuliya"));
        $("#output #email").shouldHave(text("test@test.com"));
        $("#output #currentAddress").shouldHave(text("Tiraspol"));
        $("#output #permanentAddress").shouldHave(text("Moscow"));
        // или вообще круто в селекторе output
        $("#output").shouldHave(text("Yuliya"), text("test@test.com"), text("Tiraspol"), text("Moscow"));


    }


}

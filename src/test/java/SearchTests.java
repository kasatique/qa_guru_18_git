import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.beans.PropertyEditor;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest111() {
        Configuration.pageLoadStrategy = "eager";
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("#search").shouldHave(text("https://ru.selenide.org"));
    }
}

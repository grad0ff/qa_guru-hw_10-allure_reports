package allure_report;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubPageHandler {
    @Step("Открываем главную страницу Github")
    void openGithub() {
        open("https://github.com");
    }

    @Step("В поле поиска вводим текст 'allure2' и нажимаем Enter")
    void searchAllure2() {
        $("[name='q']").setValue("allure2").pressEnter();
    }

    @Step("Находим ссылку на репозиторий 'allure-framework/allure2' и кликаем на нее")
    void refLinkClick() {
        $(By.linkText("https://github.com/allure-framework/allure2")).click();
    }

    @Step("Нажимаем на таб 'Issue'")
    void tabIssueClick() {
        $("#issues-tab").click();
    }

    @Step("Проверяем что issue с номером 1658 содержит текст 'Set up section'")
    void checkResult() {
        $("#issue_1658").shouldHave(Condition.text("Set up section"));
    }
}

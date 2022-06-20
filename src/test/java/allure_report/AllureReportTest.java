package allure_report;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class AllureReportTest {

    @BeforeEach
    void initTests() {
        // Чистим куки перед тестом
        webdriver().driver().clearCookies();
    }

    @AfterEach
    void finishTest() {
        // Закрываем вебдрайвер
        webdriver().driver().close();
    }

    @Test
    @Description("Test with usage Selenide Listener")
    void issueNameTestViaListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com");
        $("[name='q']").setValue("allure2").pressEnter();
        $(By.linkText("https://github.com/allure-framework/allure2")).click();
        $("#issues-tab").click();
        $("#issue_1658").shouldHave(Condition.text("Set up section"));
    }

    @Test
    @Description("Test with usage Lambda Steps")
    void issueNameTestViaLambdaStep() {
        step("Открываем главную страницу Github", () -> open("https://github.com"));
        step("В поле поиска вводим текст 'allure2' и нажимаем Enter", () -> {
            $("[name='q']").setValue("allure2").pressEnter();
        });
        step("Находим ссылку на репозиторий 'allure-framework/allure2' и кликаем на нее",
                () -> $(By.linkText("https://github.com/allure-framework/allure2")).click());
        step("Нажимаем на таб 'Issue'", () -> $("#issues-tab").click());
        step("Проверяем что issue с номером 1658 содержит текст 'Set up section'", () -> {
            $("#issue_1658").shouldHave(Condition.text("Set up section"));
        });
    }

    @Test
    @Description("Test with usage Step Annotations")
    void issueNameTestViaStepAnnotations() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        GithubPageHandler pageHandler = new GithubPageHandler();
        pageHandler.openGithub();
        pageHandler.searchAllure2();
        pageHandler.refLinkClick();
        pageHandler.tabIssueClick();
        pageHandler.checkResult();
    }

}

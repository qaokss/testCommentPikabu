package tests;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class TestPikabuComment extends TestBase {

    /**
     * Тест проверяет, что ссылка "Софт для быстрого создания скриншотов" ведёт на http://monosnap.com/
     */
    @Test
    public void testLinkRedirection() {
        openUrl();
        chooseDate("01/08/2019", "02/08/2019");
        chooseStoryNumber(6);
        String comment = new String($(By.cssSelector("div.comments__container_main.comments__container>div.comment>div.comment__body>div.comment__content")).getText());
        Assert.assertTrue(comment.contains("2000"));
    }

}

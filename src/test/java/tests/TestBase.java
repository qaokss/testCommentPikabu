package tests;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {

    /**
     * Выбирор периода дат из календаря
     *
     * @param fromdate - дата начала периода
     * @param todate   - дата окончания периода
     */
    protected void chooseDate(String fromdate, String todate) {
        $(By.cssSelector("span.feed-panel__calendar")).click();
        $(By.xpath("//input[@value='']")).click();
        $(By.xpath("//input[@value='']")).clear();
        $(By.xpath("//input[@value='']")).sendKeys(fromdate);
        $(By.xpath("//div[2]/input")).click();
        $(By.xpath("//div[2]/input")).clear();
        $(By.xpath("//div[2]/input")).sendKeys(todate);
        $(By.cssSelector("button.button.button_success")).click();
    }

    /**
     * Переход по ссылочке
     */
    protected void openUrl() {
        open("https://pikabu.ru/");
    }

    /**
     * Переход в пост по указанному номеру
     *
     * @param number - номер поста на странице в порядке возрастания
     */
    protected void chooseStoryNumber(int number) {
        $(By.xpath("//article[" + number + "]/div[2]/header/h2/a")).click();

    }

    /**
     * Метод возвращает текст первого комментария в посте
     */
    protected String getTextFromFirstComment() {
        switchTo().window(1);
        return $(By.xpath("//section/div/div/div/div[2]")).getText();
    }

    /**
     * для логирования
     */
    Logger logger = LoggerFactory.getLogger(TestBase.class);
}

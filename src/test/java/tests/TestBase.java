package tests;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {


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

    protected void openUrl() {
        open("https://pikabu.ru/");
    }

    protected void chooseStoryNumber(int number) {
        $(By.xpath("//article[" + number + "]/div[2]/header/h2/a")).click();

    }
}

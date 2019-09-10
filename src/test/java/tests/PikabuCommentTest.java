package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PikabuCommentTest extends TestBase {

    /**
     * Тест проверяет, что первый комментарий из поста №6 за период 01-02 августа 2019 года содержит текст "2000"
     */
    @Test
    public void testPikabuComment() {
        logger.info("Открывается вкладочка https://pikabu.ru/");
        openUrl();

        logger.info("Выбор периода из календаря");
        chooseDate("01/08/2019", "02/08/2019");

        logger.info("Открытие поста");
        chooseStoryNumber(6);

        logger.info("Пост открыт, проверка наличия в первом комментарии заданного значения");
        assertTrue(getTextFromFirstComment().contains("2000"));

    }

}

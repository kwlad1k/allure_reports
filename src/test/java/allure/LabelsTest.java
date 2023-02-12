package allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {
    @Test
    @Feature("Issue в репозитории")
    @Story("Сознадние Issue")
    @Owner("Kwlad1ck")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "GitHub", url = "https://github.com/kwlad1k")
    @DisplayName("Создание Issue для авторизованного пользователя")
    public void testStaticLabels() {
    }

    @Test
    public void testDynamicLabels() {
    }
}

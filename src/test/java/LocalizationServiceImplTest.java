import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import netology.entity.Country;
import netology.i18n.LocalizationService;
import netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    @Test
    void testLocal() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String actual = localizationService.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";
        Assertions.assertEquals(expected, actual);
    }
}
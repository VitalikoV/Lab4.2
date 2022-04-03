import com.company.StringController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringControllerTest {

    @Test
    @DisplayName("Checking collocation")
    void testCollocations(){
        String data = "there are collocations";
        Boolean isCollocation = StringController.ifAnyWordStartsWithLetter(data, 'a');
        assertTrue(isCollocation);
    }

    @Test
    @DisplayName("Checking no collocation")
    void testNotCollocations(){
        String data = "there no collocations starting with a ";
        Boolean isCollocation = StringController.ifAnyWordStartsWithLetter(data, 'a');
        assertFalse(isCollocation);
    }
}

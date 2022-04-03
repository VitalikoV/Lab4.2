import com.company.FileParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FileParserTest {

    @Test
    @DisplayName("Simple generation of file and checking if it contains the value")
    void testGenerateCSV() throws IOException {
        FileParser.generateCSVFile("test file generation", "test");
        String data = FileParser.readCSVFile("test.txt");
        assertEquals("test file generation", data);

    }
}

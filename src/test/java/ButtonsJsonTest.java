import buttons.CopyPasteButtonParser;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ButtonsJsonTest {
    @Test
    public void jsonParseTest(){
        assertFalse("Failed to find any buttons in json",CopyPasteButtonParser.getButtonsArray().isEmpty());
    }
}

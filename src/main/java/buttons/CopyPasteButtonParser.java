package buttons;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyPasteButtonParser {
    public static List<CopyPasteButton> getButtonsArray() {
        List<CopyPasteButton> buttons = new ArrayList<>();
        try (FileReader jsonReader = new FileReader("src/main/resources/buttons.json")) {
            JSONArray buttonsJsonArray = (JSONArray) new JSONParser().parse(jsonReader);
            for (Object o : buttonsJsonArray) {
                JSONObject buttonJson = (JSONObject) o;
                String name = (String) buttonJson.get("name");
                String value = (String) buttonJson.get("value");
                buttons.add(new CopyPasteButton(name, value));
            }
        } catch (Exception exception) {
            System.out.println("Got an exception during json parse!: " + exception.toString());
            System.out.println(Arrays.toString(exception.getStackTrace()));
        }
        return buttons;
    }
}

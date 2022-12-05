import buttons.CopyButtonListener;
import buttons.CopyPasteButton;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import static buttons.CopyPasteButtonParser.getButtonsArray;

public class Gui {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Field test toolkit");
        CopyButtonListener listener = new CopyButtonListener();
        List<CopyPasteButton> buttons = getButtonsArray();
        for (JButton button : buttons) {
            button.addActionListener(listener);
            frame.add(button);
        }

        frame.setAlwaysOnTop(true);
        frame.setLocationByPlatform(true);
        frame.setLayout(new GridLayout());
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBackground(Color.GRAY);
        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/resources/icon.png");
        frame.setIconImage(icon);
        frame.setVisible(true);
    }
}
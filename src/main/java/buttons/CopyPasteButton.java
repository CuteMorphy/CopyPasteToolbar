package buttons;

import javax.swing.*;
import java.awt.*;

public class CopyPasteButton extends JButton {
    String value;

    public CopyPasteButton(String name, String value) {
        super(name);
        this.value = value;
        this.setVisible(true);
        this.setFont(new Font("Corbel", Font.PLAIN, 14));
        this.setBackground(Color.GRAY);
        this.setOpaque(false);
        this.setFocusPainted(false);
        this.setBorderPainted(false);
    }

    @Override
    public String toString() {
        return value;
    }
}

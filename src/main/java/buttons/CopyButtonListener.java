package buttons;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CopyButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String toClip = e.getSource().toString();
        StringSelection stringSelectionObj = new StringSelection(toClip);
        Clipboard clipboardObj = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboardObj.setContents(stringSelectionObj, null);
    }
}

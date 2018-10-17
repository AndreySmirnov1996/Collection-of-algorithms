package patterns.fabric.dialogs;

import patterns.fabric.buttons.Button;
import patterns.fabric.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public void renderWindow() {
        System.out.println("Render window of windows dialog");

    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

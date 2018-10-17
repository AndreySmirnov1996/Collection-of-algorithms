package patterns.fabric.dialogs;

import patterns.fabric.buttons.Button;
import patterns.fabric.buttons.HTMLButton;

public class WebDialog extends Dialog {
    @Override
    public void renderWindow() {
        System.out.println("Render window of web dialog");
    }

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}

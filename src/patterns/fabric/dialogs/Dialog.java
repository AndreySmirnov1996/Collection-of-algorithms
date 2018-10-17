package patterns.fabric.dialogs;

import patterns.fabric.buttons.Button;

public abstract class Dialog {
    public void renderWindow(){
        Button button = createButton();
        button.onClick(); //do something
        button.render();
        System.out.println("Just render button");
    }
    public abstract Button createButton();
}

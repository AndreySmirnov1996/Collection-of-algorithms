package patterns.fabric;

import patterns.fabric.dialogs.Dialog;
import patterns.fabric.dialogs.WebDialog;
import patterns.fabric.dialogs.WindowsDialog;

public class Main {
    public static Dialog dialog;

    public static void initialize() {
        String system = "Windows";
        if (system.equals("Windows")) {
            dialog = new WindowsDialog();
        } else if (system.equals("Web")) {
            dialog = new WebDialog();
        }
    }

    public static void main(String[] args) {
        Main.initialize();
        dialog.renderWindow();
    }
}

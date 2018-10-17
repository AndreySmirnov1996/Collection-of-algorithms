package patterns.fabric.buttons;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render of windows button");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button clicked!");
    }
}

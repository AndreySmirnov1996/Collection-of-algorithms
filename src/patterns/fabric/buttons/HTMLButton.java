package patterns.fabric.buttons;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Render of HTML button");
    }

    @Override
    public void onClick() {
        System.out.println("HTML button clicked!");
    }
}

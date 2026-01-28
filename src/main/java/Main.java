public class Main {
    public static void main(String[] args) {

        // Choose the style- AFactory or BFactory
        UIFactory factory = new AFactory();

        // Create UI elements
        Button button = factory.createButton("Click me");
        TextField textField = factory.createTextField("Type here");
        Checkbox checkbox = factory.createCheckbox("Accept terms");

        // Display elements
        System.out.println("=== Initial Display ===");
        button.display();
        textField.display();
        checkbox.display();

        // Dynamically change text
        System.out.println("\n=== After Changing Text ===");
        button.setText("New Button Text");
        textField.setText("New TextField Text");
        checkbox.setText("New Checkbox Text");

        // Display elements again
        button.display();
        textField.display();
        checkbox.display();
    }
}

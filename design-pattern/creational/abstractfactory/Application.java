public class Application {
    private Button button;
    private Checkbox checkbox;
    private TextField textField;

    Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        textField = factory.createTextField();
    }

    void render() {
        button.render();
        checkbox.render();
        textField.render();
    }
}
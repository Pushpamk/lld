public class Main {
    public static void main(String[] args) {
        UIFactory factory;

        String theme = "DARK"; // can get from config

        if (theme.equals("DARK")) {
            factory = new DarkThemeFactory();
        } else {
            factory = new LightThemeFactory();
        }

        Application app = new Application(factory);
        app.render();
    }
}
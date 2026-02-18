class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Remote remote = new Remote();

        ICommand lightOn = new TurnOnLightCommand(light);
        ICommand lightOff = new TurnOffLightCommand(light);

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
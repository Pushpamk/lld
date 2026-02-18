public class TurnOnLightCommand implements ICommand {
    private Light light;

    TurnOnLightCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
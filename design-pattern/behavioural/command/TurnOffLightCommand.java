public class TurnOffLightCommand implements ICommand {
    private Light light;
    
    TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
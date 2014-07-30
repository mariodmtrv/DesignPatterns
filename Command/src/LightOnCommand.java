public class LightOnCommand implements Command {
	Light light;

	@Override
	public void execute() {
		light.on();

	}

	public LightOnCommand(Light light) {
		this.light = light;
		this.light.setBrightness(7);
	}

	@Override
	public void undo() {
		light.off();

	}

}

public class LightOffCommand implements Command {
	Light light;

	@Override
	public void execute() {
		light.off();

	}

	public LightOffCommand(Light light) {
		this.light = light;
		this.light.setBrightness(7);
	}

	@Override
	public void undo() {
		light.on();
		
	}

}

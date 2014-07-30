public class Light {
	private int brightness;

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	public void on() {
		System.out.println("Lamp is turned on.");
	}

	public void off() {
		System.out.println("Lamp is turned off.");
	}

}

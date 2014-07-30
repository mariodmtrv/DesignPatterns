/**
 * Encapsulates a request as an object letting parameterization of other objects
 * with different requests, queue or log requests, and support undoable
 * operations
 * */
public class RemoteControlTest {
	/**
	 * Responsible for creating a concrete command and setting its receiver
	 * */
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		remote.setCommand(0, lightOn, lightOff);
		remote.onButtonPressed(0);

		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(
				garageDoor);
		GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(
				garageDoor);
		remote.setCommand(1, garageDoorOpen, garageDoorClose);
		remote.offButtonPressed(0);
		remote.onButtonPressed(1);
		System.out.println(remote);
	}
}

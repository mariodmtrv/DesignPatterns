/**
 * Defines a binding between an action and a receiver The invoker makes a
 * request by calling execute and the ConcreteCommand carries it out by calling
 * one or more actions on the Receiver
 * */
public class GarageDoorOpenCommand implements Command {
	private GarageDoor garageDoor;

	@Override
	public void execute() {
		garageDoor.up();

	}

	public GarageDoorOpenCommand(GarageDoor door) {
		this.garageDoor = door;
	}

	@Override
	public void undo() {
		garageDoor.down();

	}

}

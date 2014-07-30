/**
 * A null object - no meaningful object to return and the <b>null</b> handling
 * responsibility is removed
 */
public class NoCommand implements Command {

	@Override
	public void execute() {

	}

	@Override
	public void undo() {

	}

}

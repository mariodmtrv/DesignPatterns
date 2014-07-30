/**
 * Invoker - holds a command and at some point asks the command to carry out a
 * request by calling its execute method
 * */

public class RemoteControl {
	private static final int COMMANDS_COUNT = 10;
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControl() {
		Command noCommand = new NoCommand();
		onCommands = new Command[COMMANDS_COUNT];
		offCommands = new Command[COMMANDS_COUNT];
		for (int i = 0; i < onCommands.length; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;

	}

	public void setCommand(int position, Command onCommand, Command offCommand) {
		onCommands[position] = onCommand;
		offCommands[position] = offCommand;
	}

	public void onButtonPressed(int position) {
		onCommands[position].execute();
		undoCommand = onCommands[position];
	}

	public void offButtonPressed(int position) {
		offCommands[position].execute();
		undoCommand = offCommands[position];
	}

	public void undoButtonPressed() {
		undoCommand.execute();
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("---Remote control---\n");
		for (int commandIndex = 0; commandIndex < COMMANDS_COUNT; commandIndex++)

		{
			builder.append("[slot " + commandIndex + "]  "
					+ onCommands[commandIndex].getClass().getName() + "  "
					+ offCommands[commandIndex].getClass().getName() + "\n");

		}
		return builder.toString();
	}
}

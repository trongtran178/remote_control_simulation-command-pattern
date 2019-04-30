package concretecommand;

import command.Command;
import receiver.Light;

public class LightOnCommand implements Command {

	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {

		light.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}

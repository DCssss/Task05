package by.md5620.Task05.finalTask.controller.command;

import java.util.HashMap;
import java.util.Map;

import by.md5620.Task05.finalTask.controller.command.impl.FindProductCommand;
import by.md5620.Task05.finalTask.controller.command.impl.LoginCommand;

public class CommandProvider {

	private Map<String, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put("login", new LoginCommand());
		commands.put("findProduct", new FindProductCommand());
	}
	
	public Command takeCommand(String commandName) {
		return commands.get(commandName);
	}
}

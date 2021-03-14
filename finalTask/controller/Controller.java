package by.md5620.Task05.finalTask.controller;

import by.md5620.Task05.finalTask.controller.command.Command;
import by.md5620.Task05.finalTask.controller.command.CommandProvider;
import by.md5620.Task05.finalTask.service.ServiceException;

public class Controller {

    private static final String WHITESPACES = "\\s+";

    private final CommandProvider provider = new CommandProvider();

    public String doAction(String request) throws ServiceException {
        String commandName = request.split(WHITESPACES, 2)[0];
        Command command = provider.takeCommand(commandName);
        return command.execute(request);
    }
}

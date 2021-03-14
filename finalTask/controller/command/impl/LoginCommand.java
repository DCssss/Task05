package by.md5620.Task05.finalTask.controller.command.impl;

import by.md5620.Task05.finalTask.controller.command.Command;
import by.md5620.Task05.finalTask.service.ServiceException;
import by.md5620.Task05.finalTask.service.ServiceProvider;
import by.md5620.Task05.finalTask.service.UserService;

public class LoginCommand implements Command {

	private static final String WHITESPACES = "\\s+";
	private static final String EQUAL = "=";

	@Override
	public String execute(String request) throws ServiceException {
		String[] params = request.split(WHITESPACES);
		String login = params[1].split(EQUAL)[1];
		String password = params[2].split(EQUAL)[1];
		ServiceProvider provider = ServiceProvider.getInstance();
		UserService userService = provider.getUserService();
		
		boolean result = userService.login(login, password);
		if (result == true) {
			return "Авторизация произведена успешно.";
		} else {
			return "Пожалуйста, проверьте введенный логин или пароль."; 
		}
	}
}

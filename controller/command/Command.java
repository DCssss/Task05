package by.md5620.Task05.finalTask.controller.command;

import by.md5620.Task05.finalTask.service.ServiceException;

public interface Command {
	String execute(String request) throws ServiceException;
}

package by.md5620.Task05.finalTask.main;

import by.md5620.Task05.finalTask.controller.Controller;
import by.md5620.Task05.finalTask.service.ServiceException;
import by.md5620.Task05.finalTask.view.View;

public class Main {

    public static void main(String[] args) throws ServiceException {
		String command;
		String response;
		Controller controller = new Controller();

		command = "login login=dcssss password=12345";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();

		command = "findProduct VacuumCleaner MOTOR_SPEED_REGULATION=3000";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();
		
		command = "findProduct Speaker CORD_LENGTH=3";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();

		command = "findProduct Laptop BATTERY_CAPACITY=3";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();

    }
}

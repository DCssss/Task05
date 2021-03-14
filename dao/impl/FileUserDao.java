package by.md5620.Task05.finalTask.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import by.md5620.Task05.finalTask.dao.DaoException;
import by.md5620.Task05.finalTask.dao.UserDao;

public class FileUserDao implements UserDao {

	private static final String RESOURCES_USERS = "/src/resources/appliances.db";
	private static final String USER_DIR = "user.dir";
	private static final String WHITESPACE_AND_EQUAL_SIGN = "[\\s=]";
	
	@Override
	public boolean authorization(String login, String password) throws DaoException {
		boolean flag = false;
		try (BufferedReader br = new BufferedReader(new FileReader(System.getProperty(USER_DIR) + RESOURCES_USERS))) {
			String currentLine;
			while ((currentLine = br.readLine()) != null) {
				if (checkCredentials(currentLine, login, password)) {
					flag = true;
					break;
				}
			}
		} catch (FileNotFoundException e) {
			throw new DaoException("Пожалуйста проверьте имя файла и путь.", e);
		} catch (IOException e) {
			throw new DaoException("Пожалуйста проверьте файл.", e);
		}
		return flag;
	}

	@Override
	public boolean checkCredentials(String currentLine, String login, String password) {
		boolean flag = false;
		String[] step = currentLine.split(WHITESPACE_AND_EQUAL_SIGN);
		if (step[0].equals(login) && step[1].equals(password)) {
			flag = true;
		}
		return flag;
	}
}

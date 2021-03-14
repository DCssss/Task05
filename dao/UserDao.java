package by.md5620.Task05.finalTask.dao;

public interface UserDao {
	
	boolean authorization(String login, String password) throws DaoException;

	boolean checkCredentials(String currentLine, String productSpecType, String productSpecValue);
}

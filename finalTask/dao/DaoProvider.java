package by.md5620.Task05.finalTask.dao;

import by.md5620.Task05.finalTask.dao.impl.FileApplianceDao;
import by.md5620.Task05.finalTask.dao.impl.FileUserDao;

public class DaoProvider {
	
	private static final DaoProvider INSTANCE = new DaoProvider();
	private final UserDao userDao = new FileUserDao();
	private final ApplianceDao applianceDao = new FileApplianceDao();

	private DaoProvider() { }

	public static DaoProvider getInstance() {
		return INSTANCE;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public ApplianceDao getApplianceDao() {
		return applianceDao;
	}

}

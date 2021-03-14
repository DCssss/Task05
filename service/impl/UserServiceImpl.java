package by.md5620.Task05.finalTask.service.impl;

import by.md5620.Task05.finalTask.dao.DaoException;
import by.md5620.Task05.finalTask.dao.DaoProvider;
import by.md5620.Task05.finalTask.dao.UserDao;
import by.md5620.Task05.finalTask.service.ServiceException;
import by.md5620.Task05.finalTask.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public boolean login(String login, String password) throws ServiceException {
        boolean result;
        if (login == null || password == null || login.length() < 4 || password.length() < 5) {
            result = false;
        } else {
            DaoProvider provider = DaoProvider.getInstance();
            UserDao userDao = provider.getUserDao();
            try {
                result = userDao.authorization(login, password);
            } catch (DaoException e) {
                throw new ServiceException(e);
            }
        }
        return result;
    }
}

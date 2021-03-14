package by.md5620.Task05.finalTask.dao;

import java.io.IOException;
import java.util.List;

public interface ApplianceDao {

	List<String> searchForProduct(String productName, String productSpecType, String productSpecValue) throws DaoException;

	boolean addProductToFile(String request) throws DaoException, IOException;
}

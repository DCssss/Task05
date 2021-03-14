package by.md5620.Task05.finalTask.service;

import by.md5620.Task05.finalTask.entity.Appliance;

public interface ApplianceService {
	<T extends Appliance> T findProduct(String request) throws ServiceException;
	boolean addNewProduct(String request) throws ServiceException;
}

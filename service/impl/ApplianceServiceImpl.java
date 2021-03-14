package by.md5620.Task05.finalTask.service.impl;

import by.md5620.Task05.finalTask.dao.ApplianceDao;
import by.md5620.Task05.finalTask.dao.DaoException;
import by.md5620.Task05.finalTask.dao.DaoProvider;
import by.md5620.Task05.finalTask.entity.Appliance;
import by.md5620.Task05.finalTask.entity.device.cleaning.VacuumCleaner;
import by.md5620.Task05.finalTask.entity.device.kitchen.Oven;
import by.md5620.Task05.finalTask.entity.device.kitchen.Refrigerator;
import by.md5620.Task05.finalTask.entity.device.sound.Range;
import by.md5620.Task05.finalTask.entity.device.sound.Speaker;
import by.md5620.Task05.finalTask.entity.electronic.portable.Laptop;
import by.md5620.Task05.finalTask.entity.electronic.portable.TabletPC;
import by.md5620.Task05.finalTask.service.ApplianceService;
import by.md5620.Task05.finalTask.service.ServiceException;
import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    private static final String WHITESPACES = "\\s+";
    private static final String EQUAL = "=";
    private static final String HYPHEN = "-";

    @Override
    public <T extends Appliance> T findProduct(String request) throws ServiceException {
        String[] params = request.split(WHITESPACES);
        String productName = params[1];
        String productSpecType = params[2].split(EQUAL)[0];
        String productSpecValue = params[2].split(EQUAL)[1];

        DaoProvider provider = DaoProvider.getInstance();
        ApplianceDao applianceDao = provider.getApplianceDao();
        List<String> data;
        try {
            data = applianceDao.searchForProduct(productName, productSpecType, productSpecValue);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
        T obj = null;
        switch (productName) {
            case "Oven":
                obj = (T) new Oven(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), Integer.parseInt(data.get(3)), Integer.parseInt(data.get(4)), Integer.parseInt(data.get(5)), Double.parseDouble(data.get(6)), Double.parseDouble(data.get(7)));
                break;
            case "Refrigerator":
                obj = (T) new Refrigerator(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), Integer.parseInt(data.get(3)), Integer.parseInt(data.get(4)), Double.parseDouble(data.get(5)), Integer.parseInt(data.get(6)), Integer.parseInt(data.get(7)));
                break;
            case "VacuumCleaner":
                obj = (T) new VacuumCleaner(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), data.get(3).charAt(0), data.get(4), data.get(5), Integer.parseInt(data.get(6)), Integer.parseInt(data.get(7)));
                break;
            case "Speaker":
                obj = (T) new Speaker(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), Integer.parseInt(data.get(3)), getRange(data), Integer.parseInt(data.get(5)));
                break;
            case "Laptop":
                obj = (T) new Laptop(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), data.get(3), Integer.parseInt(data.get(4)), Integer.parseInt(data.get(5)), Double.parseDouble(data.get(6)), Double.parseDouble(data.get(7)));
                break;
            case "TabletPC":
                obj = (T) new TabletPC(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), Double.parseDouble(data.get(3)), Integer.parseInt(data.get(4)), Integer.parseInt(data.get(5)), data.get(6));
                break;
            default:
                break;
        }
        return obj;
    }

    @Override
    public boolean addNewProduct(String request) throws ServiceException {
        DaoProvider provider = DaoProvider.getInstance();
        ApplianceDao applianceDao = provider.getApplianceDao();
        boolean result;
        try {
            result = applianceDao.addProductToFile(request);
        } catch (DaoException | IOException e) {
            throw new ServiceException(e);
        }
        return result;
    }

    private Range getRange(List<String> data) {
        String[] r = data.get(4).split(HYPHEN);
        return new Range(Double.parseDouble(r[0]), Double.parseDouble(r[1]));
    }
}

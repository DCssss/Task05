package by.md5620.Task05.finalTask.controller.command.impl;

import by.md5620.Task05.finalTask.controller.command.Command;
import by.md5620.Task05.finalTask.entity.Appliance;
import by.md5620.Task05.finalTask.service.ApplianceService;
import by.md5620.Task05.finalTask.service.ServiceException;
import by.md5620.Task05.finalTask.service.ServiceProvider;

public class FindProductCommand implements Command {

    @Override
    public String execute(String request) throws ServiceException {
        ServiceProvider provider = ServiceProvider.getInstance();
        ApplianceService applianceService = provider.getApplianceService();
        Appliance product = applianceService.findProduct(request);
        String productRepresentation = product.toString();
        
        if (!productRepresentation.isEmpty()) {
        	return productRepresentation;
        } else {
        	return "Товар не найден.";
        }
    }
}

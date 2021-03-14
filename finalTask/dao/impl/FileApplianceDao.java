package by.md5620.Task05.finalTask.dao.impl;

import java.io.*;
import java.util.*;

import by.md5620.Task05.finalTask.dao.ApplianceDao;
import by.md5620.Task05.finalTask.dao.DaoException;

public class FileApplianceDao implements ApplianceDao {

    private static final String RESOURCES = "/src/resources/appliances.db";
    private static final String USER_DIR = "user.dir";
    private static final String SINGLE_OR_MORE_WHITESPACES = "\\s+";
    private static final String COLON_AND_WHITESPACE = ": ";
    private static final String EQUAL_SIGN = "=";
    private static final String NEW_LINE = "\n";
    private static final String COMMA = ",";
    private static final String EMPTY = "";

    @Override
    public List<String> searchForProduct(String productName, String productSpecType, String productSpecValue) throws DaoException {
        StringBuilder product = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(System.getProperty(USER_DIR) + RESOURCES))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                if (currentLine.contains(productName) && checkData(currentLine, productSpecType, productSpecValue)) {
                    product.append(currentLine);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new DaoException("Пожалуйста проверьте имя файла и путь.", e);
        } catch (IOException e) {
            throw new DaoException("Пожалуйста проверьте файл.", e);
        }
        return prepData(product.toString());
    }

    @Override
    public boolean addProductToFile(String request) throws DaoException {
        int linesBefore = 0;
        int linesAfter = 0;
        if (!isProductExist(request)) {
            String newProduct = request.split(SINGLE_OR_MORE_WHITESPACES, 2)[1];
            linesBefore = countLines();
            saveToFile(newProduct);
            linesAfter = countLines();
        }
        return linesAfter > linesBefore;
    }

    private List<String> prepData(String data) {
        String[] step = data.split(COLON_AND_WHITESPACE)[1].split(COMMA);
        List<String> product = new ArrayList<>();
        for (String str : step) {
            product.add(str.split(EQUAL_SIGN)[1]);
        }
        return product;
    }

    private boolean checkData(String currentLine, String productSpecType, String productSpecValue) {
        String[] step = currentLine.split(COLON_AND_WHITESPACE)[1].replaceAll(COMMA, EMPTY).split(SINGLE_OR_MORE_WHITESPACES);
        Map<String, String> map = new HashMap<>();
        for (String str : step) {
            String[] result = str.split(EQUAL_SIGN);
            map.put(result[0], result[1]);
        }
        return map.get(productSpecType).equals(productSpecValue);
    }

    private boolean isProductExist(String request) throws DaoException {
        boolean flag = true;
        String params = request.split(SINGLE_OR_MORE_WHITESPACES, 2)[1];
        String productName = params.split(COLON_AND_WHITESPACE)[0].trim();
        String[] step = params.split(COLON_AND_WHITESPACE)[1].replaceAll(COMMA, EMPTY).split(SINGLE_OR_MORE_WHITESPACES);
        for (String str : step) {
            String[] result = str.split(EQUAL_SIGN);
            if (searchForProduct(productName, result[0], result[1]).isEmpty()) {
                flag = false;
            }
        }
        return flag;
    }

    private void saveToFile(String newProduct) throws DaoException {
    	try (BufferedWriter writer = new BufferedWriter(new FileWriter(RESOURCES, true))) {
			writer.append(NEW_LINE);
			writer.append(newProduct);
		} catch (FileNotFoundException e) {
			throw new DaoException("Пожалуйста проверьте имя файла и путь.", e);
		} catch (IOException e) {
			throw new DaoException("Пожалуйста проверьте файл.", e);
		}
    }

    private int countLines() throws DaoException {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(RESOURCES))) {
            while (reader.readLine() != null) {
                lines++;
            }
        } catch (FileNotFoundException e) {
            throw new DaoException("Пожалуйста проверьте имя файла и путь.", e);
        } catch (IOException e) {
            throw new DaoException("Пожалуйста проверьте файл.", e);
        }
        return lines;
    }
}

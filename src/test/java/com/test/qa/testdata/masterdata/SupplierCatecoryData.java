package com.test.qa.testdata.masterdata;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class SupplierCatecoryData extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(SupplierCatecoryData.class);

    public SupplierCatecoryData() {
        super("src\\test\\resources\\ExcelSheet\\plantdetails.xlsx");
    }
    @DataProvider(name = "Supplierdataprovider")
    public Object[][] Supplierprovider() {

        int rows = getRowCount("suppliercategorydata");
        int col = getColumnCount("suppliercategorydata");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("suppliercategorydata", i, j);
            }
        }
        return data;
    }


}

package com.test.qa.testdata.masterdata;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class CategoryData extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(EmployeeData.class);

    public CategoryData() {
        super("src\\test\\resources\\ExcelSheet\\plantdetails.xlsx");
    }

    @DataProvider(name = "CategoryDataprovider")
    public Object[][] CategoryDataprovider() {

        int rows = getRowCount("Category");
        int col = getColumnCount("Category");


        LOGGER.info("row = " + rows + " columns = " + col);
        System.out.println("row = " + rows + " columns = " + col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) data[i - 1][j] = getData("Category", i, j);
        }
        return data;
    }
}

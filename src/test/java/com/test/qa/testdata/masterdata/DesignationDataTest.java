package com.test.qa.testdata.masterdata;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class DesignationDataTest extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(DesignationDataTest.class);

    public DesignationDataTest() {
        super("src\\test\\resources\\ExcelSheet\\plantNg.xlsx");
    }
    @DataProvider(name = "Desigantiondataprovider")
    public Object[][] Desigantiondataprovider() {

        int rows = getRowCount("Designation");
        int col = getColumnCount("Designation");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Designation", i, j);
            }
        }
        return data;
    }
}

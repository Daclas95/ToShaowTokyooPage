package com.test.qa.testdata.masterdata;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class MaterialStateDataTest extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(MaterialStateDataTest.class);

    public MaterialStateDataTest() {
        super("src\\test\\resources\\ExcelSheet\\plantNg.xlsx");
    }
    @DataProvider(name = "Materialstatedataprovider")
    public Object[][] Materialstatedataprovider() {

        int rows = getRowCount("MaterialNg.MaterialState");
        int col = getColumnCount("MaterialNg.MaterialState");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("MaterialNg.MaterialState", i, j);
            }
        }
        return data;
    }
}

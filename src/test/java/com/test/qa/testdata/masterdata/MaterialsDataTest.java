package com.test.qa.testdata.masterdata;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class MaterialsDataTest extends ExcelDataConfig {


   private static final Logger LOGGER = Logger.getLogger(MaterialsDataTest.class);

    public MaterialsDataTest() {
        super("src\\test\\resources\\ExcelSheet\\plantNg.xlsx");
    }
    @DataProvider(name = "Materialdataprovider")
    public Object[][] Materialdataprovider() {

        int rows = getRowCount("MaterialNg.Materials");
        int col = getColumnCount("MaterialNg.Materials");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("MaterialNg.Materials", i, j);
            }
        }
        return data;
    }
}

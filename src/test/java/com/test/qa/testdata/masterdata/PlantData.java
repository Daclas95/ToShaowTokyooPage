package com.test.qa.testdata.masterdata;

import utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
/**
 * @Author Nixsala
 */

public class PlantData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(PlantData.class);// to print logger

    public PlantData() {
        super("src\\test\\resources\\ExcelSheet\\plantNg.xlsx");
    }//excel source
    @DataProvider (name = "PlantDetail")
    public Object[][] PlantDetailprovider() {

        // To get rows and Coloumns
        int rows = getRowCount("plantNG.plant");
        int col = getColumnCount("plantNG.plant");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("plantNG.plant", i, j);
            }
        }
        return data;
    }

}

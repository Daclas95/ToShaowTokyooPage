
package com.test.qa.testdata.masterdata;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class AddProjectPourData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(AddProjectPourData.class);

    public AddProjectPourData() {
        super("src\\test\\resources\\ExcelSheet\\excel.xlsx");
    }
    @DataProvider (name = "AddProjectPour")
    public Object[][] Login() {

        int rows = getRowCount("AddProjectPour");
        int col = getColumnCount("AddProjectPour");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AddProjectPour", i, j);
            }
        }
        return data;
    }

}

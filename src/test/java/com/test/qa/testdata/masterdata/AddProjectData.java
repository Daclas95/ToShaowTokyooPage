
package com.test.qa.testdata.masterdata;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class AddProjectData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(AddProjectData.class);

    public AddProjectData() {
        super("src\\test\\resources\\ExcelSheet\\excel.xlsx");
    }
    @DataProvider (name = "AddProject")
    public Object[][] AddProjects() {

        int rows = getRowCount("AddProject");
        int col = getColumnCount("AddProject");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AddProject", i, j);
            }
        }
        return data;
    }

}

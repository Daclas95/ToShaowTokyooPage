package com.test.qa.testdata.masterdata;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;
/**
 * @Author Banuja
 */

public class RoleData extends ExcelDataConfig {

        private static final Logger LOGGER = Logger.getLogger(RoleData.class);

        public RoleData () {
            super("src\\test\\resources\\ExcelSheet\\plantdetails.xlsx");
        }
        @DataProvider(name = "RoleDataTokyo")
        public Object[][] RoleDataTokyo() {

            int rows = getRowCount("RoleData");
            int col = getColumnCount("RoleData");


            LOGGER.info("row = "+ rows + " columns = "+ col);
            System.out.println("row = "+ rows + " columns = "+ col);
            Object[][] data = new Object[rows][col];
            for (int i = 1; i <= rows; i++) {
                for (int j = 0; j < col; j++) {
                    data[i - 1][j] = getData("RoleData", i, j);
                }
            }
            return data;
        }

    }



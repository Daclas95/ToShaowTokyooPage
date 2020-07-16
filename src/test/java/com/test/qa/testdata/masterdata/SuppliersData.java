package com.test.qa.testdata.masterdata;

import utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

    public class SuppliersData extends ExcelDataConfig {

        private static final Logger LOGGER = Logger.getLogger(SuppliersData.class);

        public SuppliersData () {
            super("src\\test\\resources\\ExcelSheet\\SupplierSheet.xlsx");
        }
        @DataProvider(name = "SupplierTest")
        public Object[][] SupplierTest() {

            int rows = getRowCount("Sheet3");
            int col = getColumnCount("Sheet3");


            LOGGER.info("row = "+ rows + " columns = "+ col);
            System.out.println("row = "+ rows + " columns = "+ col);
            Object[][] data = new Object[rows][col];
            for (int i = 1; i <= rows; i++) {
                for (int j = 0; j < col; j++) {
                    data[i - 1][j] = getData("Sheet3", i, j);
                }
            }
            return data;
        }

}

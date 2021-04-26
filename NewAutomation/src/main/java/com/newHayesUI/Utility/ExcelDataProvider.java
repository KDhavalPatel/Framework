package com.newHayesUI.Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

		XSSFWorkbook wb;
		XSSFSheet sheet1;

		public ExcelDataProvider(String excelpath) {
		File src = new File(excelpath);
			try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Unable to read Excel File" + e.getMessage());
			}
		}

	public String getData(String sheetIndex, int row, int column) {
		return wb.getSheet(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}

	public String getStringData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}

	public double getNumericData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
		}

		public int getrowCount(int sheetnumber) {
			int row = wb.getSheetAt(sheetnumber).getLastRowNum();
			row = row + 1;
			return row;
		}

	}


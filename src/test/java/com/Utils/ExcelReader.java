package com.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {

//	public static int totalRow;
//
//	public List<Map<String, String>> getData(String excelFilePath, String sheetName)
//			throws InvalidFormatException, IOException {
//
//		Workbook workbook = WorkbookFactory.create(new File(excelFilePath));
//		Sheet sheet = workbook.getSheet(sheetName);
//		workbook.close();
//		return readSheet(sheet);
//	}
//
//	private List<Map<String, String>> readSheet(Sheet sheet) {
//
//		Row row;
//		Cell cell;
//
//		totalRow = sheet.getLastRowNum();
//
//		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();
//
//		for (int currentRow = 1; currentRow <= totalRow; currentRow++) {
//
//			row = sheet.getRow(currentRow);
//
//			int totalColumn = row.getLastCellNum();
//
//			LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();
//
//			for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
//
//				cell = row.getCell(currentColumn);
//
//				String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
//						.getStringCellValue();
//
//				columnMapdata.put(columnHeaderName, cell.getStringCellValue());
//			}
//
//			excelRows.add(columnMapdata);
//		}
//
//		return excelRows;
//	}
//
//	public int countRow() {
//
//		return totalRow;
//	}
	 private static HSSFWorkbook workbook;
	    private static HSSFSheet sheet;
	    private static HSSFRow row;
	    private static HSSFCell cell;

	   public void setExcelFile(String excelFilePath,String sheetName) throws IOException {
	       //Create an object of File class to open xls file
	       File file =    new File(excelFilePath);
	       
	       //Create an object of FileInputStream class to read excel file
	       FileInputStream inputStream = new FileInputStream(file);
	       
	       //creating workbook instance that refers to .xls file
	       workbook=new HSSFWorkbook(inputStream);
	       
	       //creating a Sheet object
	        sheet=workbook.getSheet(sheetName);
	   }
	    public String getCellData(int rowNumber,int cellNumber){
	       //getting the cell value from rowNumber and cell Number
	        cell =sheet.getRow(rowNumber).getCell(cellNumber);
	        
	        //returning the cell value as string
	        return cell.getStringCellValue();
	    }

	    public int getRowCountInSheet(){
	       int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	       return rowcount;
	    }

	    public void setCellValue(int rowNum,int cellNum,String cellValue,String excelFilePath) throws IOException {
	    	//creating a new cell in row and setting value to it      
	    	sheet.getRow(rowNum).createCell(cellNum).setCellValue(cellValue);
	        
	    	FileOutputStream outputStream = new FileOutputStream(excelFilePath);
	    	workbook.write(outputStream);
	    }
}
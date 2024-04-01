package com.model.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileut {

	
public String fileinfo(String keyval) throws IOException {
	FileInputStream gs=new FileInputStream("./src/test/resources/configs.properties");
	Properties jd=new Properties();
	jd.load(gs);
	String sh=jd.getProperty(keyval);
	return sh;
}
	
public String datin(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream jsh=new FileInputStream("./src/main/resources/demosheet.xlsx");
	Workbook work=WorkbookFactory.create(jsh);
	Sheet sjs=work.getSheet(sheetname);
	Row ro=sjs.getRow(row);
	 Cell cel=ro.getCell(cell);
	 String sd=cel.getStringCellValue();
	 return sd;
}
}

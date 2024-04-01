package com.testsuitess;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.elements.elementsrepo;
import com.mainbase.baseclass;
import com.utility.dautils;

public class logintest extends baseclass {
	
	
@Test
public void test1() throws EncryptedDocumentException, IOException {
	elementsrepo gh=new elementsrepo(driver);
	gh.intializing(cs.dataut("Dat", 1,0),cs.dataut("Dat", 1,1));

	
	
}
	

}

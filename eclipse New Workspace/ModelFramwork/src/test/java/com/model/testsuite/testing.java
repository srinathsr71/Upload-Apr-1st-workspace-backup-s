package com.model.testsuite;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.model.base.parent;
import com.model.ele.loginele;

public class testing extends parent{

	
	
@Test
public void testexec() throws EncryptedDocumentException, IOException {
	loginele jsa=new loginele(driver);
	jsa.login(hg.datin("datainf", 1, 0),hg.datin("datainf", 1, 1));
	jsa.login(hg.datin("datainf", 2, 0),hg.datin("datainf", 2, 1),hg.fileinfo("url1"));
}

	
}

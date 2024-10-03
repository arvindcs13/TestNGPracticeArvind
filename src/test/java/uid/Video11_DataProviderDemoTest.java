package uid;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Video11_DataProviderDemoTest {

	
	@DataProvider
	public Object[][] dataSet() throws Throwable {
		
		
	
	Object[][] data = new Object[4][2];
	data[0][0] ="Arvind";
	data[0][1] ="Yadav";
	data[1][0] ="Abhinav";
	data[1][1] ="Srivastava";
	data[2][0] ="Mohit";
	data[2][1] ="Sinha";
	data[3][0] ="Mohit";
	data[3][1] ="Sinha";
			return data;
				
	}
	
	@Test(dataProvider="dataSet")
	public void usedataProvider(String username, String lastname) {
		
		System.out.println(username+"========================"+lastname);
	}

}

package testNG_programs;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

import apache_programs.P4;

public class actitimeDataProviders {

	@DataProvider
	public Object[] demoDataProvider() {    
		Object[] data=new Object[4]; 
		data[0]="Samanths";
		data[1]=25.55f;
		data[2]=10000;
		data[3]='$';
		return data;		
	}
	
	@DataProvider(parallel=true)
	public Object[][] actitimeLoginData(){
		Object[][] data=new Object[3][2];
		data[0][0]="admin";
		data[0][1]="manager";
		data[1][0]="trainee";
		data[1][1]="12345";
		data[2][0]="amith";
		data[2][1]="baby";
		return data;
	}
	
	@DataProvider
	public Object[][] addUserData() throws EncryptedDocumentException, IOException{
		Object[][] data=new Object[1][5];
		data[0][0]=P4.getdata("logincr", 1, 0);
		data[0][1]=P4.getdata("logincr", 1, 1);
		data[0][2]=P4.getdata("adduser", 1, 0);
		data[0][3]=P4.getdata("adduser", 1, 1);
		data[0][4]=P4.getdata("adduser", 1, 2);
		return data;
	}
}

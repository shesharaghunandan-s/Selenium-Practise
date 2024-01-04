package testNG_programs;
/*program for data provider*/

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P11 {
@DataProvider
public Object[] demoDataProvider() {    //this method will return array of object data type
	Object[] data=new Object[4]; //reason for creating object class arrary is that it can store value of any datatype
	data[0]="Samanths";
	data[1]=25.55f;
	data[2]=10000;
	data[3]='$';
	return data;
			
}

@Test(dataProvider="demoDataProvider")
public void demoScript(Object obj)
{
	System.out.println(obj);
}
}

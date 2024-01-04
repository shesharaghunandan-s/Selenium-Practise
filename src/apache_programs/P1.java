package apache_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*program to read the data from Excel*/
public class P1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	/*read the data from excel*/
	FileInputStream f1=new FileInputStream("./data/Myexcel.xlsx");
	/*create the workspace*/
	Workbook book = WorkbookFactory.create(f1);//the data that is fetched and brought by"FileInputStream f1=new FileInputStream("./data/Myexcel.xlsx");"
	                                           //will be received by workbook created in memory by using "WorkbookFactory.create(f1)".the workbook can have many pages
	                                          //in this program we are using page named as "demo".from demo sheet we are fetching data by using index of 'rows' and 'coloumn'
	                                         //by using "book.getSheet("demo").getRow(0).getCell(0).getStringCellValue();"
	/*read the data from specified sheet,rows and columns*/
	String d = book.getSheet("demo").getRow(0).getCell(0).getStringCellValue();
	System.out.println(d);
}
} 

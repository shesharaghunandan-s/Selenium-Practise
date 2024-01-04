package apache_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/*to change value in a cell*/
public class p2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		/*read the data from excel*/
		FileInputStream f1=new FileInputStream("./data/Myexcel.xlsx");
		/*create the workspace*/
		Workbook book = WorkbookFactory.create(f1);
		/*sets the data from specifies sheet,row and column*/
		book.getSheet("demo").getRow(0).getCell(0).setCellValue("Thamanna");
		/*writs the data into ecxel*/
		FileOutputStream f2 = new FileOutputStream("./data/Myexcel.xlsx");
		book.write(f2);
		
}
}
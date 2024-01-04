package apache_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/*program to write data into new cell*/
public class p3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		/*read the data from excel*/
		FileInputStream f1=new FileInputStream("./data/Myexcel.xlsx");
		/*create the workspace*/
		Workbook book = WorkbookFactory.create(f1);
		/*writes the data into speified cell of a sheet*/
		book.getSheet("demo").createRow(3).createCell(0).setCellValue("suhas");
		/*writs the data into ecxel*/
		FileOutputStream f2 = new FileOutputStream("./data/Myexcel.xlsx");
		book.write(f2);
}
}
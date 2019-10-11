package Test_Scripts;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Locators.All_Locators;
import multiScreenShot.MultiScreenShot;

public class Login_Test_Script {

	public static void SignIn(WebDriver driver, XSSFSheet Sfile, XSSFCell cell, ExtentTest setup, String FilePath, XSSFWorkbook WBfile, MultiScreenShot multiScreens) throws InterruptedException, IOException {

		//Looping in the excel for data 
		for(int i=0; i<= Sfile.getLastRowNum(); i++)
		{
			// Import & send data for Email from Excel.
			cell = Sfile.getRow(i).getCell(1);
			cell.setCellType(CellType.STRING);
			
			All_Locators.LGN(driver).click();
			Thread.sleep(2000);
			All_Locators.Cpmny(driver).click();
			Thread.sleep(2000);
			/* All_Locators.cmpnylgn(driver).clear(); */
			All_Locators.cmpnylgn(driver).sendKeys(cell.getStringCellValue());

			// Import  & send data for password from Excel.
			cell = Sfile.getRow(i).getCell(2);
			cell.setCellType(CellType.STRING);
			/* All_Locators.pwd(driver).clear(); */
			All_Locators.pwd(driver).sendKeys(cell.getStringCellValue());

			//submit
			All_Locators.LoginSubmit(driver).click();	
			Thread.sleep(5000);		


			//Local Variable
			String ExpectedUrl = "https://bidlinkmemphis.com/stagrfp/";
			String ActualUrl = driver.getCurrentUrl();
			String message;

			//Login verification
			if (ExpectedUrl.equalsIgnoreCase(ActualUrl)) {
				message = "Pass";
				setup.pass("Login Successed");
			} else {
				message = "Fail";
				setup.fail("Login Failed"); 
				multiScreens.multiScreenShot(driver);
			}


			// Create cell in excel where message needs to be written.
			Sfile.getRow(i).createCell(3).setCellValue(message);

			// Specify the file in which message needs to be written.
			FileOutputStream fileOutput = new FileOutputStream(FilePath);

			//write message into excel
			WBfile.write(fileOutput);
		}
	}
}

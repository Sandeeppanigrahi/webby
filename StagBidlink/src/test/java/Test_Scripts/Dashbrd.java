package Test_Scripts;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import Locators.All_Locators;
import multiScreenShot.MultiScreenShot;

public class Dashbrd {

	public static void dshbrd(WebDriver driver, XSSFSheet Sfile, XSSFCell cell, ExtentTest setup, String FilePath,
			XSSFWorkbook WBfile, MultiScreenShot multiScreens) throws InterruptedException, IOException {
		for (int i = 0; i <= Sfile.getLastRowNum(); i++) {
			All_Locators.totaloppr(driver).click();
			Thread.sleep(3000);
			All_Locators.viewoppr(driver).click();
			Thread.sleep(3000);
			All_Locators.backoppr(driver).click();
			Thread.sleep(3000);
			All_Locators.mainclickdash(driver).click();
			Thread.sleep(3000);
			All_Locators.likeoppr(driver).click();
			Thread.sleep(3000);
			All_Locators.likedview(driver).click();
			Thread.sleep(3000);
			All_Locators.backliked(driver).click();
			Thread.sleep(3000);
			All_Locators.maindshb(driver).click();
			Thread.sleep(3000);
			All_Locators.favrtd(driver).click();
			Thread.sleep(3000);
			All_Locators.cmpn(driver).click();
			Thread.sleep(5000);
			All_Locators.createoppr(driver).click();
			Thread.sleep(3000);
			cell = Sfile.getRow(i).getCell(0);
			cell.setCellType(CellType.STRING);
			All_Locators.nameoppr(driver).sendKeys(cell.getStringCellValue());
			Thread.sleep(3000);
			
			cell = Sfile.getRow(i).getCell(1);
			cell.setCellType(CellType.STRING);
			All_Locators.deptname(driver).sendKeys(cell.getStringCellValue());
			Thread.sleep(3000);
			cell = Sfile.getRow(i).getCell(2);
			cell.setCellType(CellType.STRING);
			All_Locators.linkbd(driver).sendKeys(cell.getStringCellValue());
			Thread.sleep(3000);
			cell = Sfile.getRow(i).getCell(3);
			cell.setCellType(CellType.STRING);
			All_Locators.ref(driver).sendKeys(cell.getStringCellValue());
			Thread.sleep(3000);
            All_Locators.pstdate(driver).click();
			Thread.sleep(3000);
			All_Locators.selctdte(driver).click();
			Thread.sleep(3000);
			All_Locators.duedte(driver).click();
			Thread.sleep(3000);
			All_Locators.dueslte(driver).click();
			Thread.sleep(3000);
			All_Locators.duetime(driver).click();
			Thread.sleep(3000);
			/*
			 * All_Locators.Deadline(driver).click(); Thread.sleep(3000);
			 * All_Locators.deadlinesel(driver).click(); Thread.sleep(3000);
			 */
			cell = Sfile.getRow(i).getCell(4);
			cell.setCellType(CellType.STRING);
			All_Locators.Descprt(driver).sendKeys(cell.getStringCellValue());
			Thread.sleep(3000);
			All_Locators.NAICS(driver).click();
			Thread.sleep(3000);
			All_Locators.selnaics(driver).click();
			Thread.sleep(3000);
			cell = Sfile.getRow(i).getCell(5);
			cell.setCellType(CellType.STRING);
			All_Locators.cntcfirstname(driver).sendKeys(cell.getStringCellValue());
			Thread.sleep(3000);
			cell = Sfile.getRow(i).getCell(6);
			cell.setCellType(CellType.STRING);
			All_Locators.cntclstname(driver).sendKeys(cell.getStringCellValue());
			Thread.sleep(3000);
			All_Locators.Postoppr(driver).click();
			Thread.sleep(5000);
			All_Locators.Profile(driver).click();
			Thread.sleep(3000);
			All_Locators.Editprfl(driver).click();
			Thread.sleep(3000);
			All_Locators.update(driver).click();
			Thread.sleep(3000);
			All_Locators.Vendor(driver).click();
			Thread.sleep(3000);
			All_Locators.viewwndr(driver).click();
			Thread.sleep(3000);
			All_Locators.viewbck(driver).click();
			Thread.sleep(3000);
			All_Locators.vndrsearch(driver).sendKeys("hjdfhfhgfh");
			Thread.sleep(3000);
			All_Locators.vndrsearch(driver).sendKeys(Keys.BACK_SPACE);
			Thread.sleep(3000);
			All_Locators.advsrch(driver).click();
			Thread.sleep(3000);
			All_Locators.srchbtn(driver).click();
			Thread.sleep(3000);
			All_Locators.editP(driver).click();
			Thread.sleep(3000);
			All_Locators.lgto(driver).click();
			
			
			

			// Looping in the excel for data
			/*
			 * for (int i=0; i<=Sfile.getLastRowNum(); i++) { try {
			 * All_Locators.nameoppr(driver).click(); setup.info("Create Oppr");
			 * Thread.sleep(5000); } catch (Exception e) {
			 * multiScreens.multiScreenShot(driver); }
			 */

			/*
			 * //Import & send data for Create Opportunity from excel cell =
			 * Sfile.getRow(i).getCell(0); cell.setCellType(CellType.STRING);
			 * All_Locators.JobTitle(driver).clear();
			 * All_Locators.nameoppr(driver).sendKeys(cell.getStringCellValue());
			 * Thread.sleep(3000);
			 */

			// Verifying for duplicate job title
			/*
			 * String AlertMessagBlock =
			 * driver.findElement(By.className("help-block")).getText(); String AlertMessg =
			 * "Already exists"; String message;
			 * 
			 * if (AlertMessagBlock.equalsIgnoreCase(AlertMessg)) { message =
			 * "Job Title Already exit"; multiScreens.multiScreenShot(driver);
			 * setup.fail("Job Title Already exit"); All_Locators.CancelJob(driver).click();
			 * Thread.sleep(5000); }else {
			 */

			/*
			 * cell = Sfile.getRow(i).getCell(1); cell.setCellType(CellType.STRING);
			 * 
			 * All_Locators.deptname(driver).sendKeys(cell.getStringCellValue());
			 * Thread.sleep(3000)
			 */;

			/*
			 * cell = Sfile.getRow(i).getCell(2); cell.setCellType(CellType.STRING);
			 * All_Locators.linkbd(driver).sendKeys(cell.getStringCellValue());
			 * Thread.sleep(3000);
			 */
			/*
			 * cell = Sfile.getRow(i).getCell(3); cell.setCellType(CellType.STRING);
			 * All_Locators.ref(driver).sendKeys(cell.getStringCellValue());
			 * Thread.sleep(3000);
			 */

			/*
			 * cell = Sfile.getRow(i).getCell(4); cell.setCellType(CellType.STRING);
			 * All_Locators.Descprt(driver).sendKeys(cell.getStringCellValue());
			 * Thread.sleep(3000);
			 */
			/*
			 * cell = Sfile.getRow(i).getCell(5); cell.setCellType(CellType.STRING);
			 * All_Locators.cntcfirstname(driver).sendKeys(cell.getStringCellValue());
			 * Thread.sleep(3000);
			 */
			/*
			 * cell = Sfile.getRow(i).getCell(6); cell.setCellType(CellType.STRING);
			 * All_Locators.cntclstname(driver).sendKeys(cell.getStringCellValue());
			 */
		}

	}
}

/*
 * // Create cell in excel where message needs to be written.
 * Sfile.getRow(i).createCell(2).setCellValue(message);
 * 
 * // Specify the file in which message needs to be written. FileOutputStream
 * fileOutput = new FileOutputStream(FilePath);
 * 
 * //write message into excel WBfile.write(fileOutput); Thread.sleep(5000);
 */

// End For Loop

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class All_Locators{
	WebDriver driver;

	
	//Login
	public static WebElement LGN (WebDriver driver) {WebElement lgn = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[2]/div/div/nav/ul/li[5]/a"));
	return lgn;}
	
	public static WebElement Cpmny(WebDriver driver) {WebElement cmpnyid = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/ul/li[2]/em"));
	return cmpnyid;}
	
	public static WebElement cmpnylgn(WebDriver driver) {WebElement Cmpnylgn = driver.findElement(By.name("company_email"));
	return Cmpnylgn;}
	
	public static WebElement pwd(WebDriver driver) {WebElement PWD = driver.findElement(By.name("company_password"));
	return PWD;}
	
	public static WebElement LoginSubmit(WebDriver driver) {WebElement loginsubmit = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[2]/form/div/div[3]/button"));
	return loginsubmit;}


	//Dash board Action
	
	public static WebElement totaloppr(WebDriver driver) {WebElement Totaloppr = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/a/div"));
	return Totaloppr;}
	public static WebElement viewoppr(WebDriver driver) {WebElement View = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[5]/div/a/i"));
	return View;}
	public static WebElement backoppr(WebDriver driver) {WebElement Backoppr = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div/div/div/div[1]/div[2]/button"));
	return Backoppr;}
	public static WebElement mainclickdash(WebDriver driver) {WebElement maindshb = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[2]/div/div[1]/nav/ul/li[1]/a"));
	return maindshb;}
	public static WebElement likeoppr(WebDriver driver) {WebElement Likedoppr = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/a/div"));
	return Likedoppr;} 
	public static WebElement likedview(WebDriver driver) {WebElement Likedview = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[4]/div/a/i"));
	return Likedview;}
	public static WebElement backliked(WebDriver driver) {WebElement BackLiked = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div/div/div/div[1]/div[2]/button"));
	return BackLiked;}
	public static WebElement maindshb(WebDriver driver) {WebElement mdshb = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[2]/div/div[1]/nav/ul/li[1]/a"));
	return mdshb;}
	public static WebElement favrtd(WebDriver driver) {WebElement Fav = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div/div[3]/a/div"));
	return Fav;}
	public static WebElement cmpn(WebDriver driver) {WebElement CV = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[2]/div/div[1]/nav/ul/li[2]/a"));
	return CV;}
	public static WebElement createoppr(WebDriver driver) {WebElement coppr = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[2]/div/div[1]/nav/ul/li[4]/a"));
	return coppr;}
	public static WebElement nameoppr(WebDriver driver) {WebElement noprt = driver.findElement(By.name("name_ofrfp"));
	return noprt;}
	public static WebElement deptname(WebDriver driver) {WebElement dptm = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div/div[1]/div[1]/div[2]/div/input"));
	return dptm;}
	public static WebElement linkbd(WebDriver driver) {WebElement lnkbd = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div/div[1]/div[2]/div[1]/div/input"));
	return lnkbd;}
	public static WebElement ref(WebDriver driver) {WebElement Ref = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div/div[1]/div[2]/div[2]/div/input"));
	return Ref;}
	public static WebElement pstdate(WebDriver driver) {WebElement Posted = driver.findElement(By.name("rfp_post_date"));
	return Posted;}
	public static WebElement selctdte(WebDriver driver) {WebElement slectdte = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div/div[1]/div[3]/div[1]/div/div/div[2]/div/div[2]/div[2]/div[4]/div[1]"));
	return slectdte;}
	public static WebElement duedte(WebDriver driver) {WebElement Due = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div/div[1]/div[3]/div[2]/div/div/div/div/input"));
	return Due;}
	public static WebElement dueslte(WebDriver driver) {WebElement dueStl = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div/div[1]/div[3]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[4]/div[6]"));
	return dueStl;}
	public static WebElement duetime(WebDriver driver) {WebElement DTime = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div/div[1]/div[3]/div[2]/div/div/div[2]/div/div[3]/div[2]/div/ul/li[40]"));
	return DTime;}

	/*
	 * public static WebElement Deadline(WebDriver driver) {WebElement DL =
	 * driver.findElement(By.name("rfp_post_date")); return DL;} public static
	 * WebElement deadlinesel(WebDriver driver) {WebElement DLS =
	 * driver.findElement(By.xpath(
	 * "/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div/div[1]/div[4]/div[1]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[7]"
	 * )); return DLS;}
	 */
	public static WebElement Descprt(WebDriver driver) {WebElement descrp = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div/div[1]/div[5]/div/div/textarea"));
	return descrp;}
	public static WebElement NAICS (WebDriver driver) {WebElement NAIC = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div/div[2]/div/div/div/div/div[1]/div/div/div[1]/input"));
	return NAIC;}
	public static WebElement selnaics(WebDriver driver) {WebElement selnaic = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div/div[2]/div/div/div/div/ul/li[3]/a/span"));
	return selnaic;}
	public static WebElement cntcfirstname(WebDriver driver) {WebElement Frstnmecnt = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div/div[4]/div[1]/div[1]/div/input"));
	return Frstnmecnt;}
	public static WebElement cntclstname(WebDriver driver) {WebElement lstnmecnt = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div/div[4]/div[1]/div[2]/div/input"));
	return lstnmecnt;}
	public static WebElement Postoppr(WebDriver driver) {WebElement Post = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/form/span[4]"));
	return Post;}
	public static WebElement Profile(WebDriver driver) {WebElement prfl = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[2]/div/div[3]/a/em/span"));
	return prfl;}
	public static WebElement Editprfl(WebDriver driver) {WebElement EP = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[2]/div/div[3]/div/ul/li[1]/a"));
	return EP;}
    public static WebElement update(WebDriver driver) {WebElement updt = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/form/div/div[2]/div/span"));
    return updt;}
    public static WebElement Vendor(WebDriver driver) {WebElement vndr = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[2]/div/div[1]/nav/ul/li[3]/a"));
    return vndr;}
    public static WebElement viewwndr (WebDriver driver) {WebElement viewvn  = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[8]/div/a[1]/i"));
    return viewvn ;}
    public static WebElement viewbck (WebDriver driver) {WebElement back  = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div[1]/div/div[1]/button"));
    return back;}
    public static WebElement vndrsearch (WebDriver driver) {WebElement srchvn = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/div/div[2]/div/input"));
    return srchvn ;}
    public static WebElement advsrch (WebDriver driver) {WebElement Advsrc = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div[1]/a"));
    return Advsrc ;}
    public static WebElement srchbtn (WebDriver driver) {WebElement SrcBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div[1]/form/div/div/div/span"));
    return SrcBtn;}
    public static WebElement editP (WebDriver driver) {WebElement EDITP = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[2]/div/div[3]/a/em/span"));
    return EDITP;}
    public static WebElement lgto (WebDriver driver) {WebElement Logout = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[2]/div/div[3]/div/ul/li[7]/a"));
    return Logout;}
    
    }


	/*
	 * //Salary Components public static WebElement SalaryComp(WebDriver driver)
	 * {WebElement salarycomp = driver.findElement(By.xpath(
	 * "//*[@id=\"menu_admin_viewSalaryComponentList\"]/span[2]")); return
	 * salarycomp;} public static WebElement SalaryAdd(WebDriver driver) {WebElement
	 * salaryadd =
	 * driver.findElement(By.xpath("//*[@id=\"salaryComponentDiv\"]/div/a/i"));
	 * return salaryadd;} public static WebElement CompName(WebDriver driver)
	 * {WebElement compname = driver.findElement(By.xpath("//*[@id=\"name\"]"));
	 * return compname;} public static WebElement ErrorBox(WebDriver driver)
	 * {WebElement errorbox = driver.findElement(By.xpath(
	 * "//*[@id=\"editSalaryComponentModal\"]/form/div[1]/div/materializecss-decorator[1]/div/sf-decorator/div/span"
	 * )); return errorbox;} public static WebElement Earning(WebDriver driver)
	 * {WebElement earning = driver.findElement(By.xpath(
	 * "//*[@id=\"editSalaryComponentModal\"]/form/div[1]/div/materializecss-decorator[2]/div/sf-decorator/div/ul/li[1]/label"
	 * )); return earning;} public static WebElement CTC(WebDriver driver)
	 * {WebElement ctc = driver.findElement(By.xpath(
	 * "//*[@id=\"editSalaryComponentModal\"]/form/div[1]/div/materializecss-decorator[4]/div/sf-decorator[2]/div/label"
	 * )); return ctc;} public static WebElement Amount(WebDriver driver)
	 * {WebElement amount = driver.findElement(By.xpath(
	 * "//*[@id=\"editSalaryComponentModal\"]/form/div[1]/div/materializecss-decorator[6]/div/sf-decorator[1]/div/label"
	 * )); return amount;} public static WebElement SaveSal(WebDriver driver)
	 * {WebElement savesal = driver.findElement(By.xpath(
	 * "//*[@id=\"editSalaryComponentModal\"]/form/div[2]/a[1]")); return savesal;}
	 * public static WebElement CancelSal(WebDriver driver) {WebElement cancelsal =
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"editSalaryComponentModal\"]/form/div[2]/a[2]")); return
	 * cancelsal;}
	 */








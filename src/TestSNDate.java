import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestSNDate {

	@Test
	void checkDayNameOfDateTest1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//calendar
		//assertTrue(driver.getTitle().contains("Select your date"));
		driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("30");
		driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Month\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2003");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("80");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		String result = driver.findElement(By.xpath("//*[@id=\"about\"]/div/h1")).getText();
		assertEquals("วันที่คุณเลือกคือ \"วันพฤหัสบดี\"", result);
		driver.close();
	}
	@Test
		void checkDayNameOfDateTest2() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//assertTrue(driver.getTitle().contains("Shil3aiinuWebsite"));
		driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("32");
		driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Month\"]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2002");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
		String result = driver.switchTo().alert().getText();
		assertEquals("มีบางอย่างที่ผิดพลาดคุณใส่วันที่ไม่มีในระบบ คุณใส่วันที่ : 32 ในเดือน : 05 ในปี : 2002", result);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.close();
}
	@Test
	void checkDayNameOfDateTest3() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:3000/index.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//assertTrue(driver.getTitle().contains("Shil3aiinuWebsite"));
	driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("32");
	driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"Month\"]/option[6]")).click();
	driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2002");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
	String result = driver.switchTo().alert().getText();
	assertEquals("มีบางอย่างที่ผิดพลาดคุณใส่วันที่ไม่มีในระบบ คุณใส่วันที่ : 32 ในเดือน : 05 ในปี : 2002", result);
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	driver.close();
}
	@Test
	void checkDayNameOfDateTest4() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:3000/index.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("");
	driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"Month\"]/option[6]")).click();
	driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2002");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
	String result =  driver.findElement(By.xpath("//*[@id=\"Date\"]")).getText();
	assertEquals("", result);
	Thread.sleep(2000);
	driver.close();
	}
	@Test
	void checkDayNameOfDateTest5() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:3000/index.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("30");
	driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2002");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
	String result =  driver.findElement(By.xpath("//*[@id=\"Month\"]/option[1]")).getText();
	assertEquals("เลือกเดือนที่ท่านต้องการ", result);
	Thread.sleep(2000);
	driver.close();
}
	@Test
	void checkDayNameOfDateTest6() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:3000/index.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("29");
	driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"Month\"]/option[3]")).click();
	driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2023");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
	String result = driver.switchTo().alert().getText();
	assertEquals("มีบางอย่างที่ผิดพลาดคุณใส่วันที่ไม่มีในระบบ คุณใส่วันที่ : 29 ในเดือน : 02 ในปี : 2023", result);
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	driver.close();
}
	@Test
	void checkDayNameOfDateTest7() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:3000/index.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("29");
	driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"Month\"]/option[3]")).click();
	driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2020");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a")).click();
	Thread.sleep(2000);
	String result = driver.findElement(By.xpath("//*[@id=\"about\"]/div/h1")).getText();
	assertEquals("วันที่คุณเลือกคือ \"วันเสาร์\"", result);
	driver.close();
}
	@Test
	void checkDayNameOfDateTest8() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:3000/index.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("30");
	driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"Month\"]/option[6]")).click();
	driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2024");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
	String result = driver.switchTo().alert().getText();
	assertEquals("มีบางอย่างที่ผิดพลาดคุณใส่ปีที่ไม่มีในระบบ คุณใส่ปี : 2024", result);
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	driver.close();
}
}
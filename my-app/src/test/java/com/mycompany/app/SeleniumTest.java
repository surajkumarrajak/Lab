package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;  

public class SeleniumTest {  
  
   public static void main(String[] args) {  

       //@Test
       //public void TestSelenium(){
        
    
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.gecko.driver", "/home/lab/Lab/resources/geckodriver");  
    WebDriver driver=new FirefoxDriver();  
      
// Launch website  
    driver.navigate().to("http://www.google.com/");  
    System.out.println("navigated to google......");
          
    // Click on the search text box and send value  
    driver.findElement(By.name("q")).sendKeys("https://www.spicejet.com/"); 
    System.out.println("found lst-ib......");
          
    
    WebDriverWait mywait=new WebDriverWait(driver,40);
    WebElement ele=mywait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
    ele.click();
    // Click on the search button  
    Dimension txt = driver.findElement(By.name("q")).getSize(); 
    System.out.println("txt...... " + txt.getHeight());
    
    // height is 39, assert height
    
    Assert.assertTrue(txt.getHeight() == 39);
    
    Test test = new Test();
   
    //System.out.println(test.getMessage());
   Assert.assertTrue(test.getMessage().equals("Hello World!"));
   
   test.setMessage("bye bye");
   Assert.assertFalse(test.getMessage().equals("Hello World!"));
     
    }  
  
}
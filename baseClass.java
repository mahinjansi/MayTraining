package javaSeleniumCodePractice;


import amazonProject.utilityPackage.TakesScreenShots;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.*;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
public class baseClass<JavaScriptExecutor> {
 @Test
 public void main() {
  System.setProperty("webdriver.gecko.driver","geckodriver.exe");
  WebDriver driver = new FirefoxDriver();
  driver.get("https://www.roicians.com/");
  driver.manage().window().maximize();
  JavascriptExecutor js = (JavascriptExecutor) driver;

  js.executeScript("window.scrollBy(0,3000)");

 }
}


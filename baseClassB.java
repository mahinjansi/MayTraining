package javaSeleniumCodePractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class baseClassB implements ITestListener {
 @Override
 public void onStart(ITestContext context){
  System.out.println("Test start");
 }
 @Override
 public void onTestStart(ITestResult Result){
  System.out.println("Test case start - method is onTestStart" + Result.getName());
 }
 @Override
 public void onTestSuccess(ITestResult Result){
  System.out.println("Success Test case" + Result.getName());
 }
 @Override
 public void onTestFailure(ITestResult Result){
  System.out.println("-- " + Result.getName());
 }
 @Override
 public void onFinish(ITestContext context){
  System.out.println("On test cash finish" );
 }

}

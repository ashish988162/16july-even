package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testclass {
  @Test//tc---->methods 
  public void A() {
	  
	  System.out.println("hi TC is Running");
	  //display in testng report
	  Reporter.log("hi tc is running-----> by log");//use of reporter.log with single string parameter class
	  //display in testng  as well as console 
	  Reporter.log("hi tc is running-----> by log true", true);//use of repoeter.log call with two parameter i.e.string,boolean
	  
  }
}

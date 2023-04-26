package learningTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotationtest {
  @Test
  public void f() {
	  
	  System.out.println();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println();
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println();
  }

  @BeforeClass
  public void beforeClass() {
	   
		System.out.println();
	}
  

  @AfterClass
  public void afterClass() {
	  System.out.println();
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println();
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}

package testngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	
  @Test(groups = "FUNCTIONAL")
  public void ft1() {
	  Reporter.log("ft1 tc",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it1() {
	  Reporter.log("it1 tc",true);
  }
  
  @Test(groups = "SMOKE")
  public void st1() {
	  Reporter.log("st1 tc",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void ft2() {
	  Reporter.log("ft2 tc",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it2() {
	  Reporter.log("it2 tc",true);
  }
  
  @Test(groups = "SMOKE")
  public void st2() {
	  Reporter.log("st2 tc",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void ft3() {
	  Reporter.log("ft3 tc",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it3() {
	  Reporter.log("it3 tc",true);
  }
  
  @Test(groups = "SMOKE")
  public void st3() {
	  Reporter.log("st3 tc",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void ft4() {
	  Reporter.log("ft4 tc",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it4() {
	  Reporter.log("it4 tc",true);
  }
  
  @Test(groups = "SMOKE")
  public void st4() {
	  Reporter.log("st4 tc",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void ft5() {
	  Reporter.log("ft5 tc",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it5() {
	  Reporter.log("it5 tc",true);
  }
  
  @Test(groups = "SMOKE")
  public void st5() {
	  Reporter.log("st5 tc",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void ft6() {
	  Reporter.log("ft6 tc",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it6() {
	  Reporter.log("it6 tc",true);
  }
  
  @Test(groups = "SMOKE")
  public void st6() {
	  Reporter.log("st6 tc",true);
  }
  
}

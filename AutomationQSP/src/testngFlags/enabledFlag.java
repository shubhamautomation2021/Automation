package testngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabledFlag {
  @Test(enabled = false )
  public void f() 
  {
	  Reporter.log("hiiiii");
  }
}

package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void a() {
	  Reporter.log("Demo Class",true);
  }
}

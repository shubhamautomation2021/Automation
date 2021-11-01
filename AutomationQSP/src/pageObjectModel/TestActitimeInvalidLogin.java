package pageObjectModel;

import java.io.IOException;

public class TestActitimeInvalidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {


		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		int rc = flib.getTheRowCount(EXCEL_PATH, "Invalid");

		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH, "Invalid", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "Invalid", i, 1);

			lp.invalidLoginActiTime(username, password);



		}


	}

}
package test.testcase.com;

import org.testng.annotations.Test;

//import test.pom.com.Imdbhome;
//import test.pom.com.Wikihome;

public class TestCases extends Base {
	// public WebDriver driver;

	@Test
	public void countryMatch() {

		if (varc == wcountry) {

			System.out.println("final country matched");

		} else {
			System.out.println("not matched");
		}

		System.out.println("Test match country");
	}

	@Test
	public void dateMatch() {

		if (varcdate == wdate) {
			System.out.println("final date matched");
		} else {
			System.out.println("not matched failed the test case");
		}
	}

}

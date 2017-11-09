package bg.pragmatic.core.pages;

import org.junit.Assert;

import bg.pragmatic.utils.Browser;

public class BasePage {
	
	/**
	 * All the methods that start with verify are making asserts in the page
	 * and mark it as failed or it passes if it is as expected.
	 * THis method verifies the title of the current page if it is as you expected it.
	 * 
	 * @param messageOnFailure the failing message that will appear in the reports if actual and expected are not the same
	 * @param expectedTitle the title that you would expect to be present in your browser
	 */
	public static void verifyTitle(String messageOnFailure, String expectedTitle) {
		String actualTitle = Browser.driver.getTitle();
		
		Assert.assertEquals(messageOnFailure, expectedTitle, actualTitle);
	}

}

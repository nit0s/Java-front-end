package page_object;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestGooglePage {
	Google_page gp;
	
	@Before
	public void initializeTest(){ gp = new Google_page(); }

	@Test
	public void searchingReturnResults(){
		gp.openBrowser();
		gp.searchSomething();
		assertTrue( gp.searchReturnResults() );
	}
	
	@After
	public void finishTest(){ gp.closeBrowser();}


}

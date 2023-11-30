package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTC_005 extends ProjectSpecificMethod{
	
	@Test
	public void ViewPage() {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsTab()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.enterPhno()
		.clickSubmitButton()
		.retriveLeadId()
		.verifyCreateLead();
		
	}

}

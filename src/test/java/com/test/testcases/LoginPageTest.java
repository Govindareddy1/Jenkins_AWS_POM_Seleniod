package com.test.testcases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.test.listeners.TestAllureListener;
import com.test.utils.Constants;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Epic 001: Design App - Login Page")
@Story("US 01: Login Design with  features")
@Listeners(TestAllureListener.class)
public class LoginPageTest extends BaseTest {

	@Description("login Page Title Test")
	@Severity(SeverityLevel.MINOR)
	@Test(priority = 1)
	public void loginPageTitleTest() throws InterruptedException {
		Thread.sleep(10000);
		String actTitle = loginPage.getLoginPageTitle();
		System.out.println("-->page title: " + actTitle);
		Assert.assertEquals(actTitle, Constants.LOGIN_PAGE_TITLE);
	}

	@Description("login Page Url Test")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 2)
	public void loginPageUrlTest() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("-->loginPageUrlTest method...");
		Assert.assertTrue(loginPage.getLoginPageUrl());
	}

	@Description("forgot pwd link Test")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 3)
	public void forgotPwdLinkTest() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("-->forgot pwd link Test method...");
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	@Description("register link Test")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 4, enabled = true)
	public void registerLinkTest() throws InterruptedException {
		Thread.sleep(20000);
		System.out.println("-->Register Link Test method...");
		Assert.assertTrue(loginPage.isRegisterLinkExist());
	}


}

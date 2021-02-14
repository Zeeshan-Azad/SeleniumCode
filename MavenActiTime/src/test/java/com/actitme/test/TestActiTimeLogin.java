package com.actitme.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.actitime.generics.BaseTest;
import com.actitime.pom.ActiTimeLogin;

public class TestActiTimeLogin extends BaseTest{

	@Test
	public void login() throws IOException {
		ActiTimeLogin login = new ActiTimeLogin(driver);
		login.loginMethod();
	}
}

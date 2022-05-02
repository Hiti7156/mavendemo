package com.sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hdet.App;

public class AppTest {


	@Test
	public void testlogin1()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("Hiti", "Hiti123"));
	}
	
	@Test
	public void testlogin2()
	{
		App myapp=new App();
		Assert.assertEquals(1,myapp.userLogin("Hiti","Hiti@123"));
	}
}


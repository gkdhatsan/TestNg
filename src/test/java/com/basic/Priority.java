package com.basic;

import org.testng.annotations.Test;

public class Priority {

	@Test
	private void me() {
		System.out.println("@Test1");
	}

	@Test
	private void m2() {
		System.out.println("@Test2");

	}

	@Test(priority=-2)
	private void m3() {
		System.out.println("@Test3");
	}

	@Test(priority=1)
	private void a4() {
		System.out.println("@Test4");
	}

	@Test(priority=-1)
	private void m5() {
		System.out.println("@Test5");
	}

}

package com.basic;

import org.testng.annotations.Test;

public class GroupsInclude {

	@Test(groups="@Smoke")
	private void m1() {

		System.out.println("@Smoke");

	}

	@Test(groups= {"@Regression","@Smoke"})
	private void m2() {

		System.out.println("{\"@Regression\",\"@Smoke\"}");

	}

	@Test(groups= {"@Sanity","@Regression"})
	private void m3() {

		System.out.println("{\"@Sanity\",\"@Regression\"}");

	}

	@Test(groups="@Smoke")
	private void m4() {

		System.out.println("@Smoke");

	}

	@Test(groups="@Formal")
	private void m5() {

		System.out.println("@Formal");

	}

	@Test(groups= {"@Regression","@Sanity"})
	private void m6() {

		System.out.println("{\"@Regression\",\"@Sanity\"}");

	}

	@Test(groups="@Regression")
	private void m7() {

		System.out.println("@Regression");

	}

	@Test(groups= {"@Sanity","@Smoke"})
	private void m8() {

		System.out.println("{\"@Sanity\",\"@Smoke\"}");

	}

}

package org.dimension;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class methods {
	@BeforeClass
	private void m1() {
		// TODO Auto-generated method stub
System.out.println("111");

	}
@Test
private void tc1() {
	System.out.println("222");
}
@Test
private void tc2() {
	System.out.println("333");

}
}

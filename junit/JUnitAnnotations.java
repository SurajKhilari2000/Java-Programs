package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitAnnotations {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class  method");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("in after class method");
	}

	@Before
	public void before() {
		System.out.println("in before method");
	}

	@After
	public void after() {
		System.out.println("in after method");
	}

	@Test
	public void test1() {
		System.out.println("in test1 method");
	}

	@Test
	public void test2() {
		System.out.println("in test2 method");
	}

	@Ignore
	public void ignore() {
		System.out.println("in ignor method");
	}

}

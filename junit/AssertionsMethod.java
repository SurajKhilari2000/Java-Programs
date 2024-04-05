package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertionsMethod {

	@Test
	void testAssertion() {
		int a = 10;
		int b = 20;
		String s1 = "welcome";
		String s2 = "Welcome";
		String s3 = null;
		assertSame(a, b);
		assertNotSame(a, b);
		assertTrue(a == b);
		assertTrue(a < b);
		assertSame(s1, s2);
		assertNull(s1);
		assertNotNull(s1);
		assertNull(s3);

	}

}

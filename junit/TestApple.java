package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestApple {

	@Test
	void testCorrectColor() {
		Apple apple = new Apple();
		apple.setColor("Green");
		assertTrue(apple.checkColor());
	}
	@Test
	void testWrongeColor() {
		Apple apple= new Apple();
		apple.setColor("Blue");
		assertFalse(apple.checkColor());
		
	}
}

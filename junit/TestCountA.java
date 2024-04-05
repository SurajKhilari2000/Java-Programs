package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCountA {

	@Test
	void tes() {
		Methods obj = new Methods();
		int count = obj.countA("Arya");
		assertEquals(2, count);
	}

}

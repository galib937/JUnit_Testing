package net.therapconnect.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestingApplicationTests {

	@Test
	void b() {
		Assertions.assertTrue(true);
	}

	@Test
	void a() {
		Assertions.assertTrue(false);
	}

}



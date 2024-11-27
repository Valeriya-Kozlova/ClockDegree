package com.example.ClockDegree;

import com.example.ClockDegree.service.ClockDegreeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class ClockDegreeApplicationTests {

	@Autowired
	ClockDegreeService service;

	@Test
	void contextLoads() {
	}

	@Test
	void testGetAngle0() {
		LocalDateTime date = LocalDateTime.of(2019, 2, 2, 12, 0);
		double expected = 0;
		double actual = service.getAngle(date);
		Assertions.assertEquals(expected, actual);

	}

	@Test
	void testGetAngleRandom() {
		LocalDateTime date = LocalDateTime.of(2019, 2, 2, 16, 58);
		double expected = 161;
		double actual = service.getAngle(date);
		Assertions.assertEquals(expected, actual);

	}

	@Test
	void testGetAngleEqualAngels() {
		LocalDateTime date = LocalDateTime.of(2019, 2, 2, 12, 30);
		double expected = 180;
		double actual = service.getAngle(date);
		Assertions.assertEquals(expected, actual);

	}

}

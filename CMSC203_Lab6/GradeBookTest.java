//package lab6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook g1,g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(2.5);
		g1.addScore(4.7);
		g2.addScore(6.2);
		g2.addScore(7.8);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = g2 = null;
	}
	
	@Test
	void testToString() {
		assertTrue(g1.toString().equals("[2.5, 4.7, 0.0, 0.0, 0.0]"));
		assertTrue(g2.toString().equals("[6.2, 7.8, 0.0, 0.0, 0.0]"));
	}
	
	@Test
	void testGetScoreSize() {
		assertEquals(2, g1.getScoreSize());
		assertEquals(2,g2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(7.2,g1.sum(),0.001);
		assertEquals(14.0,g2.sum(),0.001);
	}

	@Test
	void testMinimum() {
		assertEquals(2.5,g1.minimum(),0.001);
		assertEquals(6.2,g2.minimum(),0.001);
	}

	@Test
	void testFinalScore() {
		assertEquals(4.7,g1.finalScore(),0.001);
		assertEquals(7.8,g2.finalScore(),0.001);
	}

}

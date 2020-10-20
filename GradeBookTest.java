package lab6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook g1, g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook (5);
		g2 = new GradeBook(5);
		
		g1.addScore(13);
		g1.addScore(25);
		g1.addScore(15);
		g1.addScore(18);
		g1.addScore(21);
		
		g2.addScore(1);
		g2.addScore(2);
		g2.addScore(3);
		g2.addScore(4);
		g2.addScore(5);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("13.0 25.0 15.0 18.0 21.0 "));
		assertEquals(5, g1.getScoreSize(), .001);
		
		assertTrue(g2.toString().equals("1.0 2.0 3.0 4.0 5.0 "));
		assertEquals(5, g2.getScoreSize(), .001);
	
	}

	@Test
	void testSum() {
		assertEquals(92, g1.sum(), .0001 );
		assertEquals(15, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(13, g1.minimum(), .001);
		assertEquals(1, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(79, g1.finalScore(), .001);
		assertEquals(14, g2.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}

//Roll Number: 1623
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OverTest {

	
	Over[] over=new Over[5];
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOver() {
		//fail("Not yet implemented");
	}

	@Test
	public void testTotalOverRuns() {
		//fail("Not yet implemented");
		over[0] = new Over(1,2,2,2,6,1,3);
		over[1] = new Over(2,3,4,0,1,2,1);
		over[2] = new Over(3,6,4,2,1,3,2);
		over[3] = new Over(4,4,4,4,1,2,3);
		over[4] = new Over(5,1,4,1,3,6,1);
		assertEquals(16,over[0].totalOverRuns());//runs scored in an over 16.. over number 1
		assertEquals(11,over[1].totalOverRuns());//runs scored in an over 11.. over number 2
		assertEquals(18,over[2].totalOverRuns());
		assertEquals(18,over[3].totalOverRuns());
		assertEquals(16,over[4].totalOverRuns());
	}

	@Test
	public void testRunsPerBall() {
		//fail("Not yet implemented");
		over[0] = new Over(1,2,2,2,6,1,3);
		over[1] = new Over(2,3,4,0,1,2,1);
		over[2] = new Over(3,6,4,2,1,3,2);
		over[3] = new Over(4,4,4,4,1,2,3);
		over[4] = new Over(5,1,4,1,3,6,1);
		
		assertEquals(1,over[0].RunsPerBall(5));//runs scored 1..over 1.. ball number 5..
		assertEquals(0,over[1].RunsPerBall(3));//runs scored 0..over 2.. ball number 3.. 
		assertEquals(2,over[2].RunsPerBall(6));
		assertEquals(4,over[3].RunsPerBall(2));
		assertEquals(1,over[4].RunsPerBall(1));
		
		
	}

}

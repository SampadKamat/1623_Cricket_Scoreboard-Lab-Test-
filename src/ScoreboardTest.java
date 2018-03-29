//Roll Number: 1623

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScoreboardTest {

	@Before
	public void setUp() throws Exception {
	}
  //calculate the total score
	@Test
	public void testTotalScore() {

		Over[] over=new Over[5];
		
		over[0] = new Over(1,2,2,2,6,1,3);
		over[1] = new Over(2,3,4,0,1,2,1);
		over[2] = new Over(3,6,4,2,1,3,2);
		over[3] = new Over(4,4,4,4,1,2,3);
		over[4] = new Over(5,1,4,1,3,6,1);
		Scoreboard s=new Scoreboard();
		assertEquals(79,s.totalScore(over));//total runs scored 79
	}

}

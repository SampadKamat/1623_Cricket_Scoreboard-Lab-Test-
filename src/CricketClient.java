//Roll Number: 1623
import java.util.ArrayList;
import java.util.List;

public class CricketClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Over over1=new Over(1,1,4,6,2,1,6);
		Over over2=new Over(1,1,4,6,2,1,6);
		over1.totalOverRuns();
		over1.totalScore();
		over2.totalOverRuns();
		over2.totalScore();
		*/
		
		//List<item> B=new ArrayList<item>();
		
		Over[] over=new Over[5];
		
		over[0] = new Over(1,2,2,2,6,1,3);
		over[1] = new Over(2,3,4,0,1,2,1);
		over[2] = new Over(3,6,4,2,1,3,2);
		over[3] = new Over(4,4,4,4,1,2,3);
		over[4] = new Over(5,1,4,1,3,6,1);
		
		Scoreboard s=new Scoreboard();
		
		over[0].totalOverRuns();
		over[0].RunsPerBall(5);
		s.totalScore(over);
		
		
		


	}

}

//Roll Number: 1623
public class Scoreboard {

	
	public int totalScore(Over[] over){
		int totalScore=0;
		for(int i=0;i<over.length;i++){
		totalScore= totalScore + over[i].getFirst() + over[i].getSecond() + over[i].getThird() + over[i].getFourth() + over[i].getFifth() + over[i].getSixth();
		}
		System.out.println("Total Score:"+totalScore);
		return totalScore;	
	}
	
}

//Roll Number: 1623
public class Over {
	int overnumber,first,second,third,fourth,fifth,sixth,totalOverRuns;
	public Over(int overnumber, int first, int second, int third, int fourth, int fifth, int sixth) {
		// TODO Auto-generated constructor stub
		this.overnumber=overnumber;
		this.first=first;
		this.second=second;
		this.third=third;
		this.fourth=fourth;
		this.fifth=fifth;
		this.sixth=sixth;
		
	}
	
	public int totalOverRuns(){
		totalOverRuns=first+ second + third + fourth + fifth + sixth;
		
		System.out.println("Total Runs in an over " +overnumber+ " is "+totalOverRuns);
		return totalOverRuns;
	}

	/*public void totalScore(){
		totalScore=totalScore+totalOverRuns;
		System.out.println("Total Score after over  " +overnumber+ " is "+totalScore);
	}*/
	public int getOvernumber() {
		return overnumber;
	}

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}

	public int getThird() {
		return third;
	}

	public int getFourth() {
		return fourth;
	}

	public int getFifth() {
		return fifth;
	}

	public int getSixth() {
		return sixth;
	}

	public int RunsPerBall(int ballnumber) {
		// TODO Auto-generated method stub
		int runs = 0;
		if(ballnumber==1)
		{
			System.out.println("Ball Number 1 -- Runs Scored: "+getFirst());
			runs=getFirst();
			
		}
		
		if(ballnumber==2)
		{
			System.out.println("Ball Number 2 -- Runs Scored: "+getSecond());
			runs=getSecond();
		}
		if(ballnumber==3)
		{
			System.out.println("Ball Number 3 -- Runs Scored: "+getThird());
			runs=getThird();
		}
		if(ballnumber==4)
		{
			System.out.println("Ball Number 4 -- Runs Scored: "+getFourth());
			runs=getFourth();
		}
		if(ballnumber==5)
		{
			System.out.println("Ball Number 5 -- Runs Scored: "+getFifth());
			runs=getFifth();
		}
		if(ballnumber==6)
		{
			System.out.println("Ball Number 6 -- Runs Scored: "+getSixth());
			runs=getSixth();
		}
		return runs;
		
		
		
	}


		
	


}

public class Singer{
	String name;
	int noOfPerformances;
	double earnings;
	Song favoriteSong;

	public void performForAudience(int noOfPeople){
		noOfPerformances += noOfPeople;
		earnings += noOfPeople * 100;
	}

	public void change(Song c){
		favoriteSong = c;
	}

	public Singer(String n, int p, double e, Song f){
		name = n;
		noOfPerformances = p;
		earnings = e;
		favoriteSong = f;
	}
	
	public String getName(){
		return name;
	}
	
	public int getNoOfPerformances(){
		return noOfPerformances;
	}
	
	public double getEarnings(){
		return earnings;
	}
	
	public Song getFavoriteSong(){
		return favoriteSong;
	}
}

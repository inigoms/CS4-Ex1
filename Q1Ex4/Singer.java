public class Singer{
	private String name;

	private static int totalPerformances;
	private double earnings;
	private Song favoriteSong;

	public void performForAudience(int noOfPeople){
		totalPerformances += 1;
		earnings += noOfPeople * 100;
	}

	public void performForAudience(int noOfPeople, int noOfSingers){
		totalPerformances += 1;
		earnings += (noOfPeople * 100) / noOfSingers;
	}

	public void changeFavSong(Song c){
		favoriteSong = c;
	}

	public Singer(String n, int p, double e, Song f){
		name = n;
		totalPerformances = p;
		earnings = e;
		favoriteSong = f;
	}
	
	public String getName(){
		return name;
	}
	
	public int getTotalPerformances(){
		return totalPerformances;
	}
	
	public double getEarnings(){
		return earnings;
	}
	
	public Song getFavoriteSong(){
		return favoriteSong;
	}
}

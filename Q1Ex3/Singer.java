public class Singer{
	static String name;
	static int noOfPerformances;
	static double earnings;
	static Song favoriteSong;
	static Song changeFavSong;

	public void performForAudience(int noOfPeople){
		noOfPerformances += noOfPeople;
		earnings += noOfPeople * 100;
	}

	public void change(){
		favoriteSong = changeFavSong;
	}

	public Singer(String n, int p, double e, Song f, Song c){
		name = n;
		noOfPerformances = p;
		earnings = e;
		favoriteSong = f;
		changeFavSong = c;
	}
	
	public static String getName(){
		return name;
	}
	
	public static int getNoOfPerformances(){
		return noOfPerformances;
	}
	
	public static double getEarnings(){
		return earnings;
	}
	
	public static Song getFavoriteSong(){
		return favoriteSong;
	}
}

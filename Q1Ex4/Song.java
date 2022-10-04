public class Song{
	private String title;
	private double duration;
	private int yearComposed;
	
	public Song(String t, double d, int y){
		title = t;
		duration = d;
		yearComposed = y;
	}
	
	public String getTitle(){
		return title;
	}
	public double getDuration(){
		return duration;
	}
	public int getYearComposed(){
		return yearComposed;
	}
}

public class Instrument{
	String name;
	double range;
	String type;

	public Instrument(String n, double r, String t){
		name = n;
		range = r;
		type = t;
	}

	public String getIName(){
		return name;
	}
	public double getIRange(){
		return range;
	}
	public String getIType(){
		return type;
	}
}

class Main {
  public static void main(String[] args) {
    String Object1 = "Recorder";
	  double recorderRange = 2.5;
	  String recorderType = "wind";
	  String recorderColor = "beige";
		String Object2 = "Violin";
	  double violinRange = 4.5;  
	  String violinType = "string";
	  String violinColor = "brown and black";
	  String Object3 = "Portable Keyboard";
	  double keyboardRange = 5.5;
	  String keyboardType = "MIDI";
	  String keyboardColor = "gold";
	  boolean compareRange;
	  	if(keyboardRange > violinRange && keyboardRange > recorderRange){
			compareRange = true;
		}
	  	else{
			compareRange = false;
		}
	  boolean compareColor;
	  	if(recorderColor == violinColor && violinColor == keyboardColor){
			compareColor = true;
		}
	  	else{
			compareColor = false;
		}
	  boolean compareType;
	  	if(recorderType != violinType && recorderType != keyboardType && violinType != keyboardType){
			compareType = true;
		}
	  	else{
			compareType = false;
		}
    System.out.println("Object 1: " + Object1);
	  System.out.println("Instrument Type: " + recorderType);
	  System.out.println("Range: " + recorderRange + " octaves");
	  System.out.println("Color: " + recorderColor);
	  System.out.println("");
	  System.out.println("Object 2: " + Object2);
	  System.out.println("Instrument Type: " + violinType);
	  System.out.println("Range: " + violinRange + " octaves");
	  System.out.println("Color: " + violinColor);
	  System.out.println("");
	  System.out.println("Object 3: " + Object3);
	  System.out.println("Instrument Type: " + keyboardType);
	  System.out.println("Range: " + keyboardRange + " octaves");
	  System.out.println("Color: " + keyboardColor);
	  System.out.println("");
	  System.out.println("All of the instruments have different types from one another: " + compareType);
	  System.out.println("The keyboard has a greater range than the other instruments: " + compareRange);
	  System.out.println("All instruments have the same color: " + compareColor);
  }
}

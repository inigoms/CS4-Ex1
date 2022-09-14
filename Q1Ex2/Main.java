import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		boolean cont = true;
		boolean win = false;
		boolean question = true;
		int guessesCounter = 3;
		int min = 1;
		int max = 10;
		int i;
		String choiceString = "";
		outer:
			do{
				if(question){
					System.out.println("Welcome to Higher or Lower! What will you do?");
					System.out.println("-Start game [A]");
					System.out.println("-Change settings [B]");
					System.out.println("-End application [C]");
					Scanner choice = new Scanner(System.in);
					choiceString = choice.nextLine();
				}
				if(choiceString.equals("A")){
					int correctAnswer = (int) Math.floor(Math.random()*max) + min;
					for(i = 1; i <= guessesCounter;){
						System.out.print("You have " + (guessesCounter + 1 - i) + " guesses left. What's the number? ");
						Scanner guess = new Scanner(System.in);
						int guessInt = guess.nextInt();
						i++;
						if(guessInt == correctAnswer){
							win = true;
							System.out.println("Congratulations, you win!");
							System.out.println("Play again? [y/n]");
							Scanner again = new Scanner(System.in);
							String againString = again.nextLine();
							if(againString.equals("y")){
								i = 1;
								correctAnswer = (int) Math.floor(Math.random()*max) + min;
							}
							else if(againString.equals("n")){
								question = true;
								continue outer;
							}
						}
						else if(guessInt < correctAnswer){
							System.out.println("Higher!");
						}
						else if(guessInt > correctAnswer){
							System.out.println("Lower!");
						}
					}
					if(!win){
						System.out.println("Sorry, you lost.");
					}
					System.out.println("Play again? [y/n]");
					Scanner again2 = new Scanner(System.in);
					String againString2 = again2.nextLine();
					if(againString2.equals("y")){
						choiceString.equals("A");
						question = false;
					}
					else if(againString2.equals("n")){
						question = true;
						continue outer;
					}
				}
				else if(choiceString.equals("B")){
					System.out.print("Enter lower limit: ");
					Scanner userMin = new Scanner(System.in);
					min = userMin.nextInt();
					System.out.print("Enter upper limit: ");
					Scanner userMax = new Scanner(System.in);
					max = userMax.nextInt();
					System.out.print("Enter allowed no. of guesses: ");
					Scanner userGuesses = new Scanner(System.in);
					guessesCounter = userGuesses.nextInt();
					continue outer;
				}
				else if(choiceString.equals("C")){
					System.out.println("Thank you for playing!");
					cont = false;
				}
			}while(cont == true);
	  }
	}

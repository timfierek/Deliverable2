import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
	
	public static void main(String[] args) {
		
		String headsOrTailsGuess;
		int numberOfFlips = -1;
		int correctCount = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Guess which will have more: heads or tails? ");
		headsOrTailsGuess = in.nextLine();
		if(!headsOrTailsGuess.equalsIgnoreCase("heads") && !headsOrTailsGuess.equalsIgnoreCase("tails")) {
			System.out.println("Error: invalid heads or tails guess entered!");
			in.close();
			return;
		}
		
		System.out.print("How many time shall we flip a coin? ");
		numberOfFlips = in.nextInt();
		System.out.println();
		in.close();
		
		
		// 1 = heads, 2 = tails from flipCoin()
		int curFlipNum;
		String curFlip;
		
		// Convert flip number to string to compare to guess, increment if correct guess,
		// print coin flip results
		for(int i = 0; i < numberOfFlips; i++) {
			curFlipNum = flipCoin();
			
			if(curFlipNum == 1) {
				curFlip = "heads";
			}
			else {
				curFlip = "tails";
			}
			
			if(curFlip.equalsIgnoreCase(headsOrTailsGuess)) {
				correctCount++;
			}
			
			System.out.println(curFlip);
		}
		
		double percentage = ((double)correctCount / (double)numberOfFlips) * 100;
		
		System.out.print("\nYour guess, " + headsOrTailsGuess + ", came up "
				+ correctCount + " time(s). \nThat's ");
		System.out.printf("%.1f", percentage);
		System.out.println("%.");
	}
	
	/**
	 * flipCoin() returns a random result of a coin flip
	 * 
	 * @return return 1 indicating heads or 2 indicating tails
	 */
	public static int flipCoin() {
		Random rand = new Random();
		boolean flip = rand.nextBoolean();
		
		if(flip) {
			return 1;
		}
		else {
			return 2;
		}
		
	}
	
}

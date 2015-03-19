public class RockPaperScissors
{
	public static void main (String[] args)
	{
		boolean playAgain = true;
		int win=0, lose=0, tie=0;
		while (playAgain == true)
		{
			playAgain = false;
			//Print first words and let player enter choice..
			System.out.print("\n\n\n\n");
			System.out.println("           ===========================================================");
			System.out.println("           |            Welcome to Rock, Paper, Scissors!            |");
			System.out.println("           ===========================================================\n");
			System.out.print("Please make a choice: ");
			String userChoice = Keyboard.readString();
			String userChoiceTLC = userChoice.toLowerCase();
			String compChoiceTLC = "";
			//Check to make sure the user input is valid.
			while (!userChoiceTLC.equals("rock") && !userChoiceTLC.equals("paper") && !userChoiceTLC.equals("scissors")) {
			System.out.println("That is not a valid answer, please try again.");
			System.out.print("Please make a different choice (Rock, Paper, or Scissors): ");
			userChoice = Keyboard.readString();
			userChoiceTLC = userChoice.toLowerCase();
			}
			//Choose a random number for the computer's choice.
			double compChoice = Math.round(Math.random()*2+1);

			//Turn the computer's choice number into Rock, Paper, or Scissors.
			if (compChoice == 1.0) {
				compChoiceTLC = "rock";
				System.out.println("The computer chose: Rock");
			}
			if (compChoice == 2.0) {
				compChoiceTLC = "paper";
				System.out.println("The computer chose: Paper");
			}
			if (compChoice == 3.0) {
				compChoiceTLC = "scissors";
				System.out.println("The computer chose: Scissors");
			}
			//Checks who won.
			if (userChoiceTLC.equals(compChoiceTLC)) {
				System.out.println("It's a tie!\n");
				tie++;
			}
			else if (userChoiceTLC.equals("rock") && compChoiceTLC.equals("paper")) {
				System.out.println("Paper beats Rock, you have lost.\n");
				lose++;
			}
			else if (userChoiceTLC.equals("rock") && compChoiceTLC.equals("scissors")) {
				System.out.println("Rock beats Scissors, you have won!\n");
				win++;
			}


			else if (userChoiceTLC.equals("paper") && compChoiceTLC.equals("scissors")) {
							System.out.println("Scissors beats Paper, you have lost.\n");
							lose++;
			}
			else if (userChoiceTLC.equals("paper") && compChoiceTLC.equals("rock")) {
				System.out.println("Paper beats Rock, you have won!\n");
				win++;
			}


			else if (userChoiceTLC.equals("scissors") && compChoiceTLC.equals("rock")) {
				System.out.println("Rocks beats Scissors, you have lost.\n");
				lose++;
			}
			else if (userChoiceTLC.equals("scissors") && compChoiceTLC.equals("paper")) {
				System.out.println("Scissors beats Paper, you have won!\n");
				win++;
			}

			System.out.println("           ===========================================================");
			System.out.println("           | You have won "+win+" games and lost "+lose+" games and tied "+tie+" games. |");
			System.out.println("           ===========================================================\n");
			System.out.println("                            Do you want to play again?");
			System.out.print("                                       ");
			String ans = Keyboard.readString();
			if (ans.equals("Yes") || ans.equals("yes") || ans.equals("Y") || ans.equals("y"))
				playAgain = true;
			else
			{
				System.out.println("           ===========================================================");
				System.out.println("           |          Thanks for playing, have a great day!          |");
				System.out.println("           ===========================================================\n");
				playAgain = false;
			}
		}

	}
}

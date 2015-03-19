public class CashRegister
{
	public static void main (String[] args)
	{
		double empInput=0, newTotal=0;
		double randomAmount = Math.random()*100+1;
		double rAHund = Math.round(randomAmount * 100.0) / 100.0;
		System.out.print("\nThe total today is: $");
		System.out.printf("%.2f", rAHund);
		System.out.println();
		System.out.print("Please enter the amount that the customer has given you: $");
		empInput = Keyboard.readDouble();
		double changeGiven = empInput-rAHund;
		double changeGivenRounded = Math.round(changeGiven * 100.0) / 100.0;
		if (changeGivenRounded < 0)
		{
			System.out.println();
			System.out.print("Total:  $");
			System.out.printf("%.2f", rAHund);
			System.out.println();
			System.out.print("Given:  $");
			System.out.printf("%.2f", empInput);
			System.out.println();
			double changeNeeded = rAHund-empInput;
			System.out.print("\nYou still owe: $(");
			System.out.printf("%.2f", changeNeeded);
			System.out.print(")\n");
		}
		else if (changeGivenRounded == 0) {
			System.out.println("\nThanks for your business, have a nice day!\n");
		}
		else {
			System.out.println();
			System.out.print("Given:  $");
			System.out.printf("%.2f", empInput);
			System.out.println();
			System.out.print("Total:  $");
			System.out.printf("%.2f", rAHund);
			System.out.println();
			System.out.print("\nYour change is: $");
			System.out.printf("%.2f", changeGivenRounded);
			System.out.println(".\nHave a nice day!\n");
			//System.out.println("changeGiven: "+changeGiven);
			changeGiven=36.41;
			System.out.println(" ***************************");
			System.out.println(" *                         *");
			System.out.println(" *       CASHIER ONLY      *");
			System.out.println(" *                         *");
			System.out.println(" ***************************");
			System.out.println(" *                         *");
			amtChange(changeGivenRounded);
		}
	}

	public static void amtChange(double changeGivenRounded){

		//Twenties
		int amtTwenty=0;
		while (changeGivenRounded >= 20.00)
		{
			amtTwenty++;
			changeGivenRounded -= 20.00;
		}
		if (amtTwenty>0)
		System.out.println(" *        $20:   "+amtTwenty+"         *");
		//Tens
		int amtTen=0;
		while (changeGivenRounded >= 10.00)
		{
			amtTen++;
			changeGivenRounded -= 10.00;
		}
		if (amtTen>0)
		System.out.println(" *        $10:   "+amtTen+"         *");
		//Fives
		int amtFive=0;
		while (changeGivenRounded >= 5.00)
		{
			amtFive++;
			changeGivenRounded -= 5.00;
		}
		if (amtFive>0)
		System.out.println(" *        $5:    "+amtFive+"         *");
		//Ones
		int amtOne=0;
		while (changeGivenRounded >= 1.00)
		{
			amtOne++;
			changeGivenRounded -= 1.00;
		}
		if (amtOne>0)
		System.out.println(" *        $1:    "+amtOne+"         *");
		//Quarters
		int amtQuarter=0;
		while (changeGivenRounded >= .25)
		{
			amtQuarter++;
			changeGivenRounded -= .25;
		}
		if (amtQuarter>0)
		System.out.println(" *        $0.25: "+amtQuarter+"         *");
		//Dimes
		int amtDime=0;
		while (changeGivenRounded >= .10)
		{
			amtDime++;
			changeGivenRounded -= .10;
		}
		if (amtDime>0)
		System.out.println(" *        $0.10: "+amtDime+"         *");
		//Nickels
		int amtNickel=0;
		while (changeGivenRounded >= .05)
		{
			amtNickel++;
			changeGivenRounded -= .05;
		}
		if (amtNickel>0)
		System.out.println(" *        $0.05: "+amtNickel+"         *");
		//Pennies
		int amtPenny=0;
		while (changeGivenRounded >= .01)
		{
			amtPenny++;
			changeGivenRounded -= .01;
		}
		if (amtPenny>0)
		System.out.println(" *        $0.01: "+amtPenny+"         *");
		System.out.println(" *                         *");
		System.out.println(" *                         *");
		System.out.println(" ***************************\n\n");
	}
}

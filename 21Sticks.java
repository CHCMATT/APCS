public class TwentyOneSticks
{
	public static void main (String[] args)
	{
		int numSticks = 21, p1=0, p2=0, p1choice, p2choice;
		double num=0;
		String p1name = "", p2name = "",firstPlayer="";
		System.out.println("Welcome to the Game of Twenty One Sticks!");
		System.out.print("Please enter the first players name: ");
		p1name = Keyboard.readString();
		System.out.print("Please enter the second players name: ");
		p2name = Keyboard.readString();
		//
		//	EASTER EGG TIME
		//
			String loseName="";
		//	If you're playing this with a friend, you can change this so that when they
		//	enter their own name, it always makes them lose. Just a small joke.
		//	If you don't want to include this, you can leave it blank.

		if (p1name.equals(loseName))
		System.out.println("\n\n"+p2name+" has automatically won the game!\n\n");
		else if (p2name.equals(loseName))
		System.out.println("\n\n"+p1name+" has automatically won the game!\n\n");
		else if (!p1name.equals(loseName)&&!p2name.equals(loseName)){
			
		//
		//  END EASTER EGG
		//
			String [] arr = {p1name, p2name};
			num = Math.random()*2;
			firstPlayer= arr[(int)num];
			System.out.println("\n\nIn this game, "+firstPlayer+" is going first!");
			//
			//  PLAYER 1 STARTS FIRST
			//
			if (firstPlayer.equals(p1name))
			{
				while (numSticks>0)
				{
					//
					//  PLAYER 1 START
					//
					if (numSticks>0)
					{
						System.out.println(p1name+", There are now "+numSticks+" sticks.");
						System.out.println("How many sticks do you want to take? (1 or 2).");
						p1choice = Keyboard.readInt();
						while (p1choice!=1&&p1choice!=2)
						{
							System.out.println("You can only take 1 or 2 sticks, try again.");
							System.out.println("How many sticks do you want to take? (1 or 2).");
							p1choice = Keyboard.readInt();
						}
						numSticks=numSticks-p1choice;
					}
					else
					{
						System.out.println(p1name+", You just won the Game of 21 Sticks!");
					}
					//
					//  PLAYER 2 START
					//
					if (numSticks>0)
					{
						System.out.println(p2name+", There are now "+numSticks+" sticks.");
						System.out.println("How many sticks do you want to take? (1 or 2).");
						p2choice = Keyboard.readInt();
						while (p2choice!=1&&p2choice!=2)
						{
							p2choice=0;
							System.out.println("You can only take 1 or 2 sticks, try again.");
							System.out.println("How many sticks do you want to take? (1 or 2).");
							p2choice = Keyboard.readInt();
						}
						numSticks=numSticks-p2choice;
					}
					else
					{
						System.out.println(p2name+", You just won the Game of 21 Sticks!");
					}
				}
			}
			//
			//  PLAYER 2 STARTS FIRST
			//
			else
			{
				while (numSticks>0)
				{
					//
					//  PLAYER 2 START
					//
					if (numSticks>0)
					{
						System.out.println(firstPlayer+", There are now "+numSticks+" sticks.");
						System.out.println("How many sticks do you want to take? (1 or 2).");
						p2choice = Keyboard.readInt();
						while (p2choice!=1&&p2choice!=2)
						{
							System.out.println("You can only take 1 or 2 sticks, try again.");
							System.out.println("How many sticks do you want to take? (1 or 2).");
							p2choice = Keyboard.readInt();
						}
						numSticks=numSticks-p2choice;
					}
					else
					{
						System.out.println(p2name+", You just won the Game of 21 Sticks!");
					}
					//
					//  PLAYER 1 START
					//
					if (numSticks>0)
					{
						System.out.println(p1name+", There are now "+numSticks+" sticks.");
						System.out.println("How many sticks do you want to take? (1 or 2).");
						p1choice = Keyboard.readInt();
						while (p1choice!=1&&p1choice!=2)
						{
							p1choice=0;
							System.out.println("You can only take 1 or 2 sticks, try again.");
							System.out.println("How many sticks do you want to take? (1 or 2).");
							p1choice = Keyboard.readInt();
						}
						numSticks=numSticks-p1choice;
					}
					else
					{
						System.out.println(p1name+", You just won the Game of 21 Sticks!");
					}
				}
			}
		}
	}
}

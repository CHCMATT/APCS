public class TwelveDaysOfChristmas
{
	public static void main (String[] args)
	{
		int dayCount=0;
		for (int x=1;x<=12;x++)
		{
			dayCount=x;
			System.out.println("On the "+dayChanger(dayCount)+" day of Christmas,");
			System.out.println("My true love gave to me:\n"+stuffChanger(dayCount));
		}
	}

	public static String dayChanger(int dayCount)
	{
		if (dayCount==1)
			return "First";
		if (dayCount==2)
			return "Second";
		if (dayCount==3)
			return "Third";
		if (dayCount==4)
			return "Fourth";
		if (dayCount==5)
			return "Fifth";
		if (dayCount==6)
			return "Sixth";
		if (dayCount==7)
			return "Seventh";
		if (dayCount==8)
			return "Eighth";
		if (dayCount==9)
			return "Nineth";
		if (dayCount==10)
			return "Tenth";
		if (dayCount==11)
			return "Eleventh";
		//if (dayCount==12)
			//return "Twelfth";
		else
			return "[ERROR CODE: 404 (Code Not Found)]";
	}

	public static String stuffChanger(int dayCount)
	{
		String first   = "A partridge in a pear tree.";
		String second  = "Two turtle doves,";
		String third   = "Three french hens,";
		String fourth  = "Four calling birds,";
		String fifth   = "Five golden rings,";
		String sixth   = "Six geese-a-laying,";
		String seventh = "Seven swans-a-swimming,";
		String eighth  = "Eight maids-a-milking,";
		String nineth  = "Nine ladies dancing,";
		String tenth   = "Ten lords-a-leaping,";
		String eleventh= "Eleven pipers piping,";
		String twelfth = "Twelve drummers drumming,";

		if (dayCount==1)
			return first+"\n\n";
		if (dayCount==2)
			return second+"\nAnd "+first.toLowerCase()+"\n\n";
		if (dayCount==3)
			return third+"\n"+second+"\nAnd "+first.toLowerCase()+"\n\n";
		if (dayCount==4)
			return fourth+"\n"+third+"\n"+second+"\nAnd "+first.toLowerCase()+"\n\n";
		if (dayCount==5)
			return fifth+"\n"+fourth+"\n"+third+"\n"+second+"\nAnd "+first.toLowerCase()+"\n\n";
		if (dayCount==6)
			return sixth+"\n"+fifth+"\n"+fourth+"\n"+third+"\n"+second+"\nAnd "+first.toLowerCase()+"\n\n";
		if (dayCount==7)
			return seventh+"\n"+sixth+"\n"+fifth+"\n"+fourth+"\n"+third+"\n"+second+"\nAnd "+first.toLowerCase()+"\n\n";
		if (dayCount==8)
			return eighth+"\n"+seventh+"\n"+sixth+"\n"+fifth+"\n"+fourth+"\n"+third+"\n"+second+"\nAnd "+first.toLowerCase()+"\n\n";
		if (dayCount==9)
			return nineth+"\n"+eighth+"\n"+seventh+"\n"+sixth+"\n"+fifth+"\n"+fourth+"\n"+third+"\n"+second+"\nAnd "+first.toLowerCase()+"\n\n";
		if (dayCount==10)
			return tenth+"\n"+nineth+"\n"+eighth+"\n"+seventh+"\n"+sixth+"\n"+fifth+"\n"+fourth+"\n"+third+"\n"+second+"\nAnd "+first.toLowerCase()+"\n\n";
		if (dayCount==11)
			return eleventh+"\n"+tenth+"\n"+nineth+"\n"+eighth+"\n"+seventh+"\n"+sixth+"\n"+fifth+"\n"+fourth+"\n"+third+"\n"+second+"\nAnd "+first.toLowerCase()+"\n\n";
		if (dayCount==12)
			return twelfth+"\n"+eleventh+"\n"+tenth+"\n"+nineth+"\n"+eighth+"\n"+seventh+"\n"+sixth+"\n"+fifth+"\n"+fourth+"\n"+third+"\n"+second+"\nAnd "+first.toLowerCase()+"\n\n";
		else
			return "[ERROR]";
	}
}

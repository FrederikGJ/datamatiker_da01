public class PartWord
{

	public static void main (String [] args)
{
printPartOfWord("København", 1, 4);
}


public static void printPartOfWord(String word, int index, int lPart)
{
	int mak = index + lPart;
	String substr = word.substring(index, mak);
	System.out.println(substr);	
}

}

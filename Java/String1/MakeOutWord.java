/*
 * CodingBat Java Activity "makeOutWord" from String-1 section.
 * codingbat.com
 */

public class MakeOutWord 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "makeOutWord";
	
	/*
	 * INSTRUCTIONS
	 * Given an "out" string length 4, such as "<<>>", and a word, return a new
	 * string where the word is in the middle of the out string, 
	 * e.g. "<<word>>". Note: use str.substring(i, j) to extract the String 
	 * starting at index i and going up to but not including index j.
	 * 
	 * makeOutWord("<<>>", "Yay") -> "<<Yay>>"
	 * makeOutWord("<<>>", "WooHoo") -> "<<WooHoo>>"
	 * makeOutWord("[[]]", "word") -> "[[word]]"
	 */
	public static String makeOutWord(String out, String word)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase("\"<<>>\"", "\"Yay\"", "\"<<Yay>>\"");
		testCase("\"<<>>\"", "\"WooHoo\"", "\"<<WooHoo>>\"");
		testCase("\"[[]]\"", "\"word\"", "\"[[word]]\"");
		testCase("\"HHoo\"", "\"Hello\"", "\"HHHellooo\"");
		testCase("\"abyz\"", "\"YAY\"", "\"abYAYyz\"");
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(String a, String b, String result)
	{
		String r;
		try
		{
			r = ""+ "\"" + makeOutWord(a.substring(1,a.length()-1), b.substring(1,b.length()-1)) + "\"";
			if (r.equals(""+result))
			{
				System.out.print("PASS: ");
			}
			else
			{
				System.out.println("FAIL: ");
				failures++;
			}
		}
		catch (Exception e)
		{
			r = e.getMessage();
			System.out.print("FAIL: ");
			failures++;
		}
		System.out.println(METHOD_NAME+"("+a+", "+b+") -> "+r + ", EXPECTED: "+result);
	}

}


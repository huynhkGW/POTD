/*
 * CodingBat Java Activity "firstTwo" from String-1 section.
 * codingbat.com
 */

public class FirstTwo 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "firstTwo";
	
	/*
	 * INSTRUCTIONS
	 * Given a string, return the string made of its first two chars, so the 
	 * String "Hello" yields "He". If the string is shorter than length 2, 
	 * return whatever there is, so "X" yields "X", and the empty string "" 
	 * yields the empty string "". Note that str.length() returns the length of
	 * a string.
	 * 
	 * firstTwo("Hello") -> "He"
	 * firstTwo("abcdefg") -> "ab"
	 * firstTwo("ab") -> "ab"
	 */
	public static String firstTwo(String str)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase("\"Hello\"", "\"He\"");
		testCase("\"abcdefg\"", "\"ab\"");
		testCase("\"ab\"", "\"ab\"");
		testCase("\"a\"", "\"a\"");
		testCase("\"\"", "\"\"");
		testCase("\"Kitten\"", "\"Ki\"");
		testCase("\"hi\"", "\"hi\"");
		testCase("\"hiya\"", "\"hi\"");
		
		System.out.println();
		System.out.println(failures + " test cases failed.");
	}

	private static void testCase(String a, String result)
	{
		String r;
		try
		{
			r = ""+ "\"" + firstTwo(a.substring(1,a.length()-1)) + "\"";
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
		System.out.println(METHOD_NAME+"("+a+") -> "+r + ", EXPECTED: "+result);
	}

}


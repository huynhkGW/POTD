/*
 * CodingBat Java Activity "firstHalf" from String-1 section.
 * codingbat.com
 */

public class FirstHalf 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "firstHalf";
	
	/*
	 * INSTRUCTIONS
	 * 
	 * Given a string of even length, return the first half. So the string 
	 * "WooHoo" yields "Woo".
	 * 
	 * firstHalf("WooHoo") -> "Woo"
	 * firstHalf("HelloThere") -> "Hello"
	 * firstHalf("abcdef") -> "abc"
	 */
	public static String firstHalf(String str)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase("\"WooHoo\"", "\"Woo\"");
		testCase("\"HelloThere\"", "\"Hello\"");
		testCase("\"abcdef\"", "\"abc\"");
		testCase("\"ab\"", "\"a\"");
		testCase("\"\"", "\"\"");
		testCase("\"0123456789\"", "\"01234\"");
		testCase("\"kitten\"", "\"kit\"");
		
		System.out.println();
		System.out.println(failures + " test cases failed.");
	}

	private static void testCase(String a, String result)
	{
		String r;
		try
		{
			r = ""+ "\"" + firstHalf(a.substring(1,a.length()-1)) + "\"";
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


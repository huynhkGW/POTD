/*
 * CodingBat Java Activity "nonStart" from String-1 section.
 * codingbat.com
 */

public class NonStart 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "nonStart";
	
	/*
	 * INSTRUCTIONS
	 * Given two strings, return their concatenation, except omit the first char of each.
	 * The strings will be at least length 1.
	 * 
	 * nonStart("Hello", "There") -> "ellohere"
	 * nonStart("java", "code") -> "avaode"
	 * nonStart("shotl", "java") -> "hotlava"
	 */
	public static String nonStart(String a, String b)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase("\"Hello\"", "\"There\"", "\"ellohere\"");
		testCase("\"java\"", "\"code\"", "\"avaode\"");
		testCase("\"shotl\"", "\"java\"", "\"hotlava\"");
		testCase("\"ab\"", "\"xy\"", "\"by\"");
		testCase("\"ab\"", "\"x\"", "\"b\"");
		testCase("\"x\"", "\"ac\"", "\"c\"");
		testCase("\"a\"", "\"x\"", "\"\"");
		testCase("\"kit\"", "\"kat\"", "\"itat\"");
		testCase("\"mart\"", "\"dart\"", "\"artart\"");
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(String a, String b, String result)
	{
		String r;
		try
		{
			r = ""+ "\"" + nonStart(a.substring(1,a.length()-1), b.substring(1,b.length()-1)) + "\"";
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


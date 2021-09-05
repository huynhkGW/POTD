/*
 * CodingBat Java Activity "noX" from Recursion-1 section.
 * codingbat.com
 */

public class NoX 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "noX";
	
	/*
	 * INSTRUCTIONS
	 * Given a string, compute recursively a new string where all the 'x' chars 
	 * have been removed.
	 * 
	 * noX("xaxb") -> "ab"
	 * noX("abc") -> "abc"
	 * noX("xx") -> ""
	 */
	public static String noX(String str)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase("\"xaxb\"", "\"ab\"");
		testCase("\"abc\"", "\"abc\"");
		testCase("\"xx\"", "\"\"");
		testCase("\"\"", "\"\"");
		testCase("\"axxbxx\"", "\"ab\"");
		testCase("\"Hellox\"", "\"Hello\"");

		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(String a, String expected)
	{
		String r;
		try
		{
			r = ""+ noX(a);
			if (r.equals(""+ expected))
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
		System.out.println(METHOD_NAME+"("+a+") -> "+r + ", EXPECTED: "+ expected);
	}

}

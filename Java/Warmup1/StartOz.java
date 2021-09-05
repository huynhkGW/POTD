/*
 * CodingBat Java Activity "startOz" from Warmup-1 section.
 * codingbat.com
 */

public class StartOz 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "startOz";
	
	/*
	 * INSTRUCTIONS
	 * Given a string, return a string made of the first 2 chars (if present), 
	 * however include first char only if it is 'o' and include the second only
	 * if it is 'z', so "ozymandias" yields "oz".
	 * 
	 * startOz("ozymandias") -> "oz"
	 * startOz("bzoo") -> "z"
	 * startOz("oxx") -> "o"
	 */
	public static String startOz(String str)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase("\"ozymandias\"", "\"oz\"");
		testCase("\"bzoo\"", "\"z\"");
		testCase("\"oxx\"", "\"o\"");
		testCase("\"oz\"", "\"oz\"");
		testCase("\"ounce\"", "\"o\"");
		testCase("\"o\"", "\"o\"");
		testCase("\"abc\"", "\"\"");
		testCase("\"\"", "\"\"");
		testCase("\"zoo\"", "\"\"");
		testCase("\"aztec\"", "\"z\"");
		testCase("\"zzzz\"", "\"z\"");
		testCase("\"oznic\"", "\"oz\"");
		
		System.out.println();
		System.out.println(failures + " test cases failed.");
	}

	private static void testCase(String a, String result)
	{
		String r;
		try
		{
			r = ""+ "\"" + startOz(a.substring(1,a.length()-1)) + "\"";
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


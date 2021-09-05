/*
 * CodingBat Java Activity "left2" from String-1 section.
 * codingbat.com
 */

public class Left2 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "left2";
	
	/*
	 * INSTRUCTIONS
	 * 
	 * Given a string, return a "rotated left 2" version where the first 2 
	 * chars are moved to the end. The string length will be at least 2.
	 * 
	 * left2("Hello") -> "lloHe"
	 * left2("java") -> "vaja"
	 * left2("Hi") -> "Hi"
	 */
	public static String left2(String str)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase("\"Hello\"", "\"lloHe\"");
		testCase("\"java\"", "\"vaja\"");
		testCase("\"Hi\"", "\"Hi\"");
		testCase("\"code\"", "\"deco\"");
		testCase("\"cat\"", "\"tca\"");
		testCase("\"12345\"", "\"34512\"");
		testCase("\"Chocolate\"", "\"ocolateCh\"");
		testCase("\"bricks\"", "\"icksbr\"");
		
		System.out.println();
		System.out.println(failures + " test cases failed.");
	}

	private static void testCase(String a, String result)
	{
		String r;
		try
		{
			r = ""+ "\"" + left2(a.substring(1,a.length()-1)) + "\"";
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


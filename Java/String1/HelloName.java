/*
 * CodingBat Java Activity "helloName" from String-1 section.
 * codingbat.com
 */

public class HelloName 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "helloName";
	
	/*
	 * INSTRUCTIONS
	 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	 * 
	 * helloName("Bob") -> "Hello Bob!"
	 * helloName("Alice") -> "Hello Alice!"
	 * helloName("X") -> "Hello X!"
	 */
	public static String helloName(String name)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase("\"Bob\"","\"Hello Bob!\"");
		testCase("\"Alice\"", "\"Hello Alice!\"");
		testCase("\"X\"", "\"Hello X!\"");
		testCase("\"Dolly\"", "\"Hello Dolly!\"");
		testCase("\"Alpha\"", "\"Hello Alpha!\"");
		testCase("\"Omega\"", "\"Hello Omega!\"");
		testCase("\"Goodbye\"", "\"Hello Goodbye!\"");
		testCase("\"ho ho ho\"", "\"Hello ho ho ho!\"");
		testCase("\"xyz!\"", "\"Hello xyz!!\"");
		testCase("\"Hello\"", "\"Hello Hello!\"");
		
		System.out.println();
		System.out.println(failures + " test cases failed.");
	}

	private static void testCase(String a, String result)
	{
		String r;
		try
		{
			r = ""+ "\"" + helloName(a.substring(1,a.length()-1)) + "\"";
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


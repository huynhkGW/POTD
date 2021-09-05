/*
 * CodingBat Java Activity "comboString" from String-1 section.
 * codingbat.com
 */

public class ComboString 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "comboString";
	
	/*
	 * INSTRUCTIONS
	 * 
	 * Given 2 strings, a and b, return a string of the form short+long+short, 
	 * with the shorter string on the outside and the longer string on the 
	 * inside. The strings will not be the same length, but they may be empty 
	 * (length 0).
	 * 
	 * comboString("Hello", "hi") -> "hiHellohi"
	 * comboString("hi", "Hello") -> "hiHellohi"
	 * comboString("aaa", "b") -> "baaab"
	 */
	public static String comboString(String a, String b)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase("\"Hello\"", "\"hi\"", "\"hiHellohi\"");
		testCase("\"hi\"", "\"Hello\"", "\"hiHellohi\"");
		testCase("\"aaa\"", "\"b\"", "\"baaab\"");
		testCase("\"b\"", "\"aaa\"", "\"baaab\"");
		testCase("\"aaa\"", "\"\"", "\"aaa\"");
		testCase("\"\"", "\"bb\"", "\"bb\"");
		testCase("\"aaa\"", "\"1234\"", "\"aaa1234aaa\"");
		testCase("\"aaa\"", "\"bb\"", "\"bbaaabb\"");
		testCase("\"a\"", "\"bb\"", "\"abba\"");
		testCase("\"bb\"", "\"a\"", "\"abba\"");
		testCase("\"xyz\"", "\"ab\"", "\"abxyzab\"");
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(String a, String b, String result)
	{
		String r;
		try
		{
			r = ""+ "\"" + comboString(a.substring(1,a.length()-1), b.substring(1,b.length()-1)) + "\"";
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


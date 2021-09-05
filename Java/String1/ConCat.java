/*
 * CodingBat Java Activity "conCat" from String-1 section.
 * codingbat.com
 */

public class ConCat 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "conCat";
	
	/*
	 * INSTRUCTIONS
	 * Given two strings, append them together (known as "concatenation") and 
	 * return the result. However, if the concatenation creates a double-char, 
	 * then omit one of the chars, so "abc" and "cat" yields "abcat".
	 * 
	 * conCat("abc", "cat") -> "abcat"
	 * conCat("dog", "cat") -> "dogcat"
	 * conCat("abc", "") -> "abc"
	 */
	public static String conCat(String a, String b)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase("\"abc\"","\"cat\"", "\"abcat\"");
		testCase("\"dog\"", "\"cat\"", "\"dogcat\"");
		testCase("\"abc\"", "\"\"", "\"abc\"");
		testCase("\"\"", "\"cat\"", "\"cat\"");
		testCase("\"pig\"", "\"g\"", "\"pig\"");
		testCase("\"pig\"", "\"doggy\"", "\"pigdoggy\"");
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(String a, String b, String result)
	{
		String r;
		try
		{
			r = ""+ "\"" + conCat(a.substring(1,a.length()-1), b.substring(1,b.length()-1)) + "\"";
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


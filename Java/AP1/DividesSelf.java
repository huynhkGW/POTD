/*
 * CodingBat Java Activity "dividesSelf" from AP-1 section.
 * codingbat.com
 */

public class DividesSelf 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "dividesSelf";
	
	/*
	 * INSTRUCTIONS
	 * We'll say that a positive int divides itself if every digit in the number 
	 * divides into the number evenly. So for example 128 divides itself since 1, 2, 
	 * and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything 
	 * evenly, so no number with a 0 digit divides itself. Note: use % to get the 
	 * rightmost digit, and / to discard the rightmost digit.
	 * 
	 * dividesSelf(128) -> true
	 * dividesSelf(12) -> true
	 * dividesSelf(120) -> false
	 */
	public static boolean dividesSelf(int n)
	{
		//put your code ONLY here!

	}
	
	public static void main(String[] args)
	{
		testCase(128, true);
		testCase(12, true);
		testCase(120, false);
		testCase(122, true);
		testCase(13, false);
		testCase(32, false);
		testCase(22, true);
		testCase(42, false);
		testCase(212, true);
		testCase(213, false);
		testCase(162, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, boolean result)
	{
		String r;
		try
		{
			r = ""+ dividesSelf(a);
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

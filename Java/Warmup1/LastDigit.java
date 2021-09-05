/**
 * CodingBat Java Activity "lastDigit" from Warmup1.
 * codingbat.com
 */
public class LastDigit
{
	private static int failures = 0;
	private static final String METHOD_NAME = "lastDigit";
	/**
	 * INSTRUCTIONS:
	 * Given two non-negative int values, return true if they have the same last
	 * digit, such as with 27 and 57. Note that the % "mod" operator computes
	 * remainders, so 17 % 10 is 7.
	 * 
	 * lastDigit(7, 17) -> true
	 * lastDigit(6, 17) -> false
	 * lastDigit(3, 113) -> true
	 * 
	 */
	public static boolean lastDigit(int a, int b)
	{
		// ADD YOUR CODE HERE
	}
	
	public static void main(String[] args)
	{
		testCase(7, 17, true);
		testCase(6, 17, false);
		testCase(3, 113, true);
		testCase(114, 113, false);
		testCase(114, 4, true);
		testCase(10, 0, true);
		testCase(11, 0, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}
	
	private static void testCase(int a, int b, boolean result)
	{
		String r;
		try
		{
			r = ""+lastDigit(a, b);
			if (r.equals(""+result))
			{
				System.out.print("PASS: ");
			}
			else
			{
				System.out.print("FAIL: ");
				failures ++;
			}
		}
		catch (Exception e)
		{
			r = e.getMessage();
			System.out.print("FAIL: ");
			failures ++;
		}
		System.out.println(METHOD_NAME+"("+a+", "+b+") -> "+r + ", EXPECTED: "+result);
	}

}

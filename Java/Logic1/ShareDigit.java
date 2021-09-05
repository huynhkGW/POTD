/**
 * CodingBat Java Activity "shareDigit" from Logic1.
 * codingbat.com
 */
public class ShareDigit
{
	private static int failures = 0;
	private static final String METHOD_NAME = "shareDigit";

	/**
	 * INSTRUCTIONS:
	 * Given two ints, each in the range 10..99, return true if there is a 
	 * digit that appears in both numbers, such as the 2 in 12 and 23. (Note: 
	 * division, e.g. n/10, gives the left digit while the % "mod" n%10 gives 
	 * the right digit.)
	 * 
	 * shareDigit(12, 23) -> true
	 * shareDigit(12, 43) -> false
	 * shareDigit(12, 44) -> false
	 * 
	 */
	public static boolean shareDigit(int a, int b)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(12, 23, true);
		testCase(12, 43, false);
		testCase(12, 44, false);
		testCase(23, 12, true);
		testCase(23, 39, true);
		testCase(23, 19, false);
		testCase(30, 90, true);
		testCase(30, 91, false);
		testCase(55, 55, true);
		testCase(55, 44, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, boolean result)
	{
		String r;
		try
		{
			r = ""+shareDigit(a, b);
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

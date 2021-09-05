/**
 * CodingBat Java Activity "posNeg" from Warmup1.
 * codingbat.com
 */
public class PosNeg
{
	private static int failures = 0;
	private static final String METHOD_NAME = "posNeg";
	/**
	 * INSTRUCTIONS:
	 * Given 2 int values, return true if one is negative and one is positive.
	 * Except if the parameter "negative" is true, then return true only if
	 * both are negative.
	 * 
	 * posNeg(1, -1, false) -> true
	 * posNeg(-1, 1, false) -> 5
	 * posNeg(-4, -5, true) -> 8
	 * 
	 */
	public static boolean posNeg(int a, int b, boolean negative)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(1, -1, false, true);
		testCase(-1, 1, false, true);
		testCase(-4, -5, true, true);
		testCase(-4, -5, false, false);
		testCase(-4, 5, false, true);
		testCase(-4, 5, true, false);
		testCase(1, 1, false, false);
		testCase(-1, -1, false, false);
		testCase(1, -1, true, false);
		testCase(-1, 1, true, false);
		testCase(1, 1, true, false);
		testCase(-1, -1, true, true);
		testCase(5, -5, false, true);
		testCase(-6, 6, false, true);
		testCase(-5, -6, false, false);
		testCase(-2, -1, false, false);
		testCase(1, 2, false, false);
		testCase(-5, 6, true, false);
		testCase(-5, -5, true, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, boolean c, boolean result)
	{
		String r;
		try
		{
			r = ""+posNeg(a, b, c);
			if (r.equals(""+result))
			{
				System.out.print("PASS: ");
			}
			else
			{
				System.out.println("FAIL: ");
				failures ++;
			}
		}
		catch (Exception e)
		{
			r = e.getMessage();
			System.out.print("FAIL: ");
			failures ++;
		}
		System.out.println(METHOD_NAME+"("+a+", "+b+", "+c+") -> "+r + ", EXPECTED: "+result);
	}

}

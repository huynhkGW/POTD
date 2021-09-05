/**
 * CodingBat Java Activity "in3050" from Warmup1.
 * codingbat.com
 */
public class In3050
{
	private static int failures = 0;
	private static final String METHOD_NAME = "in3050";

	/**
	 * INSTRUCTIONS:
	 * Given 2 int values, return true if they are both in the range 30..40
	 * inclusive, or they are both in the range 40..50 inclusive.
	 * 
	 * in3050(30, 31) -> true
	 * in3050(30, 41) -> false
	 * in3050(40, 50) -> true
	 * 
	 */
	public static boolean in3050(int a, int b)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(30, 31, true);
		testCase(30, 41, false);
		testCase(40, 50, true);
		testCase(40, 51, false);
		testCase(39, 50, false);
		testCase(50, 39, false);
		testCase(40, 39, true);
		testCase(49, 48, true);
		testCase(50, 40, true);
		testCase(50, 51, false);
		testCase(35, 36, true);
		testCase(35, 45, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, boolean result)
	{
		String r;
		try
		{
			r = ""+in3050(a, b);
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

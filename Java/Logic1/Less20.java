/**
 * CodingBat Java Activity "less20" from Logic1.
 * codingbat.com
 */
public class Less20
{
	private static int failures = 0;
	private static final String METHOD_NAME = "less20";

	/**
	 * INSTRUCTIONS:
	 * Return true if the given non-negative number is 1 or 2 less than 
	 * a multiple of 20. So for example 38 and 39 return true, but 40 returns 
	 * false. See also: Introduction to Mod:
	 * 
	 * https://codingbat.com/doc/practice/mod-introduction.html
	 * 
	 * less20(18) -> true
	 * less20(19) -> true
	 * less20(20) -> false
	 * 
	 */
	public static boolean less20(int n)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(18, true);
		testCase(19, true);
		testCase(20, false);
		testCase(8, false);
		testCase(17, false);
		testCase(23, false);
		testCase(25, false);
		testCase(30, false);
		testCase(31, false);
		testCase(58, true);
		testCase(59, true);
		testCase(60, false);
		testCase(61, false);
		testCase(62, false);
		testCase(1017, false);
		testCase(1018, true);
		testCase(1019, true);
		testCase(1020, false);
		testCase(1021, false);
		testCase(1022, false);
		testCase(1023, false);
		testCase(37, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, boolean result)
	{
		String r;
		try
		{
			r = ""+less20(a);
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
		System.out.println(METHOD_NAME+"("+a+") -> "+r + ", EXPECTED: "+result);
	}

}

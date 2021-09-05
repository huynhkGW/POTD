/**
 * CodingBat Java Activity "more20" from Logic1.
 * codingbat.com
 */
public class More20
{
	private static int failures = 0;
	private static final String METHOD_NAME = "more20";

	/**
	 * INSTRUCTIONS:
	 * Return true if the given non-negative number is 1 or 2 more than 
	 * a multiple of 20. See also: Introduction to Mod:
	 * 
	 * https://codingbat.com/doc/practice/mod-introduction.html
	 * 
	 * more20(20) -> false
	 * more20(21) -> true
	 * more20(22) -> true
	 * 
	 */
	public static boolean more20(int n)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(20, false);
		testCase(21, true);
		testCase(22, true);
		testCase(23, false);
		testCase(25, false);
		testCase(30, false);
		testCase(31, false);
		testCase(59, false);
		testCase(60, false);
		testCase(61, true);
		testCase(62, true);
		testCase(1020, false);
		testCase(1021, true);
		testCase(1000, false);
		testCase(1001, true);
		testCase(50, false);
		testCase(55, false);
		testCase(40, false);
		testCase(41, true);
		testCase(39, false);
		testCase(42, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, boolean result)
	{
		String r;
		try
		{
			r = ""+more20(a);
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

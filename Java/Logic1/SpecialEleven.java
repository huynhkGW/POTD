/**
 * CodingBat Java Activity "specialEleven" from Logic1.
 * codingbat.com
 */
public class SpecialEleven
{
	private static int failures = 0;
	private static final String METHOD_NAME = "specialEleven";

	/**
	 * INSTRUCTIONS:
	 * We'll say a number is special if it is a multiple of 11 or if it is one more 
	 * than a multiple of 11. Return true if the given non-negative number is
	 * special. Use the % "mod" operator -- see Introduction to Mod
	 * 
	 * https://codingbat.com/doc/practice/mod-introduction.html
	 * 
	 * specialEleven(22) -> true
	 * specialEleven(23) -> true
	 * specialEleven(24) -> false
	 * 
	 */
	public static boolean specialEleven(int n)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(22, true);
		testCase(23, true);
		testCase(24, false);
		testCase(21, false);
		testCase(11, true);
		testCase(12, true);
		testCase(10, false);
		testCase(9, false);
		testCase(8, false);
		testCase(0, true);
		testCase(1, true);
		testCase(2, false);
		testCase(121, true);
		testCase(122, true);
		testCase(123, false);
		testCase(46, false);
		testCase(49, false);
		testCase(52, false);
		testCase(54, false);
		testCase(55, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, boolean result)
	{
		String r;
		try
		{
			r = ""+specialEleven(a);
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

/**
 * CodingBat Java Activity "in1To10" from Logic1.
 * codingbat.com
 */
public class In1To10
{
	private static int failures = 0;
	private static final String METHOD_NAME = "in1To10";

	/**
	 * INSTRUCTIONS:
	 * Given a number n, return true if n is in the range 1..10, inclusive.
	 * Unless outsideMode is true, in which case return true if the number
	 * is less or equal to 1, or greater or equal to 10.
	 * 
	 * in1To10(5, false) -> true
	 * in1To10(11, false) -> false
	 * in1To10(11, true) -> true
	 * 
	 */
	public static boolean in1To10(int n, boolean outsideMode)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(5, false, true);
		testCase(11, false, false);
		testCase(11, true, true);
		testCase(10, false, true);
		testCase(10, true, true);
		testCase(9, false, true);
		testCase(9, true, false);
		testCase(1, false, true);
		testCase(1, true, true);
		testCase(0, false, false);
		testCase(0, true, true);
		testCase(-1, false, false);
		testCase(-1, true, true);
		testCase(99, false, false);
		testCase(99, true, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, boolean b, boolean result)
	{
		String r;
		try
		{
			r = ""+in1To10(a, b);
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
			System.out.println("FAIL: ");
			failures ++;
		}
		System.out.println(METHOD_NAME+"("+a+") -> "+r + ", EXPECTED: "+result);
	}

}

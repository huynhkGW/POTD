/**
 * CodingBat Java Activity "lessBy10" from Logic1.
 * codingbat.com
 */
public class LessBy10
{
	private static int failures = 0;
	private static final String METHOD_NAME = "lessBy10";

	/**
	 * INSTRUCTIONS:
	 * Given three int values, a b c, return true if one of them is 10 or more 
	 * less than one of the others.
	 * 
	 * lessBy10(1, 7, 11) -> true
	 * lessBy10(1, 7, 10) -> false
	 * lessBy10(11, 1, 7) -> true
	 * 
	 */
	public static boolean lessBy10(int a, int b, int c)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(1, 7, 11, true);
		testCase(1, 7, 10, false);
		testCase(11, 1, 7, true);
		testCase(10, 7, 1, false);
		testCase(-10, 2, 2, true);
		testCase(2, 11, 11, false);
		testCase(3, 3, 30, true);
		testCase(3, 3, 3, false);
		testCase(10, 1, 11, true);
		testCase(10, 11, 1, true);
		testCase(10, 11, 2, false);
		testCase(3, 30, 3, true);
		testCase(2, 2, -8, true);
		testCase(2, 8, 12, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, int c, boolean result)
	{
		String r;
		try
		{
			r = ""+lessBy10(a, b, c);
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
		System.out.println(METHOD_NAME+"("+a+", "+b+", "+c+") -> "+r + ", EXPECTED: "+result);
	}

}

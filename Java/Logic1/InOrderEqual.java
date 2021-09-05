/**
 * CodingBat Java Activity "inOrderEqual" from Logic1.
 * codingbat.com
 */
public class InOrderEqual
{
	private static int failures = 0;
	private static final String METHOD_NAME = "inOrderEqual";

	/**
	 * INSTRUCTIONS:
	 * Given three ints, a b c, return true if they are in strict increasing 
	 * order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with 
	 * the exception that if "equalOk" is true, equality is allowed, such as 
	 * 5 5 7 or 5 5 5.
	 * 
	 * inOrderEqual(2, 5, 11, false) -> true
	 * inOrderEqual(5, 7, 6, false) -> false
	 * inOrderEqual(5, 5, 7, true) -> true
	 * 
	 */
	public static boolean inOrderEqual(int a, int b, int c, boolean equalOk)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(2, 5, 11, false, true);
		testCase(5, 7, 6, false, false);
		testCase(5, 5, 7, true, true);
		testCase(5, 5, 7, false, false);
		testCase(2, 5, 4, false, false);
		testCase(3, 4, 3, false, false);
		testCase(3, 4, 4, false, false);
		testCase(3, 4, 3, true, false);
		testCase(3, 4, 4, true, true);
		testCase(1, 5, 5, true, true);
		testCase(5, 5, 5, true, true);
		testCase(2, 2, 1, true, false);
		testCase(9, 2, 2, true, false);
		testCase(0, 1, 0, true, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, int c, boolean d, boolean result)
	{
		String r;
		try
		{
			r = ""+inOrderEqual(a, b, c, d);
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
		System.out.println(METHOD_NAME+"("+a+", "+b+", "+c+", "+d+") -> "+r + ", EXPECTED: "+result);
	}

}

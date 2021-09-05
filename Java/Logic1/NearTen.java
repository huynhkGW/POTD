/**
 * CodingBat Java Activity "nearTen" from Logic1.
 * codingbat.com
 */
public class NearTen
{
	private static int failures = 0;
	private static final String METHOD_NAME = "nearTen";

	/**
	 * INSTRUCTIONS:
	 * Given a non-negative number "num", return true if num is within 2 of a 
	 * multiple of 10. Note: (a % b) is the remainder of dividing a by b, so 
	 * (7 % 5) is 2. See also: Introduction to Mod:
	 * 
	 * https://codingbat.com/doc/practice/mod-introduction.html
	 * 
	 * nearTen(12) -> true
	 * nearTen(17) -> false
	 * nearTen(19) -> true
	 * 
	 */
	public static boolean nearTen(int num)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(12, true);
		testCase(17, false);
		testCase(19, true);
		testCase(31, true);
		testCase(6, false);
		testCase(10, true);
		testCase(11, true);
		testCase(21, true);
		testCase(22, true);
		testCase(23, false);
		testCase(54, false);
		testCase(155, false);
		testCase(158, true);
		testCase(3, false);
		testCase(1, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, boolean result)
	{
		String r;
		try
		{
			r = ""+nearTen(a);
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

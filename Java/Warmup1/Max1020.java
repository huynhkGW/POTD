/**
 * CodingBat Java Activity "max1020" from Warmup1.
 * codingbat.com
 */
public class Max1020
{
	private static int failures = 0;
	private static final String METHOD_NAME = "max1020";

	/**
	 * INSTRUCTIONS:
	 * Given 2 positive int values, return the larger value that is in the
	 * range 10..20 inclusive, or return 0 if neither is in that range.
	 * 
	 * max1020(11, 19) -> 19
	 * max1020(19, 11) -> 19
	 * max1020(11, 9) -> 11
	 * 
	 */
	public static int max1020(int a, int b)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(11, 19, 19);
		testCase(19, 11, 19);
		testCase(11, 9, 11);
		testCase(10, 21, 10);
		testCase(21, 10, 10);
		testCase(9, 11, 11);
		testCase(23, 10, 10);
		testCase(20, 10, 20);
		testCase(7, 20, 20);
		testCase(17, 16, 17);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, int result)
	{
		String r;
		try
		{
			r = ""+max1020(a, b);
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

/**
 * CodingBat Java Activity "in1020" from Warmup1.
 * codingbat.com
 */
public class In1020
{
	private static int failures = 0;
	private static final String METHOD_NAME = "in1020";

	/**
	 * INSTRUCTIONS:
	 * Given 2 int values, return true if either of them is in the range 10..20
	 * inclusive.
	 * 
	 * in1020(12, 99) -> true
	 * in1020(21, 12) -> true
	 * in1020(8, 99) -> false
	 * 
	 */
	public static boolean in1020(int a, int b)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(12, 99, true);
		testCase(21, 12, true);
		testCase(8, 99, false);
		testCase(99, 10, true);
		testCase(20, 20, true);
		testCase(21, 21, false);
		testCase(9, 9, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, boolean result)
	{
		String r;
		try
		{
			r = ""+in1020(a, b);
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

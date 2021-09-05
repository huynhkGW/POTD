/**
 * CodingBat Java Activity "loneTeen" from Warmup1.
 * codingbat.com
 */
public class LoneTeen
{
	private static int failures = 0;
	private static final String METHOD_NAME = "loneTeen";

	/**
	 * INSTRUCTIONS:
	 * Given 2 int values, return true if either of them is in the range 10..20
	 * inclusive.
	 * 
	 * loneTeen(13, 99) -> true
	 * loneTeen(21, 19) -> true
	 * loneTeen(13, 13) -> false
	 * 
	 */
	public static boolean loneTeen(int a, int b)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(13, 99, true);
		testCase(21, 19, true);
		testCase(13, 13, false);
		testCase(14, 20, true);
		testCase(20, 15, true);
		testCase(16, 17, false);
		testCase(16, 9, true);
		testCase(16, 18, false);
		testCase(13, 19, false);
		testCase(13, 20, true);
		testCase(6, 18, true);
		testCase(99, 13, true);
		testCase(99, 99, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, boolean result)
	{
		String r;
		try
		{
			r = ""+loneTeen(a, b);
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

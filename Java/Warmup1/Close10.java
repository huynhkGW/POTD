/**
 * CodingBat Java Activity "close10" from Warmup1.
 * codingbat.com
 */
public class Close10
{
	private static int failures = 0;
	private static final String METHOD_NAME = "close10";
	/**
	 * INSTRUCTIONS:
	 * Given 2 int values, return whichever value is nearest to the value 10, or
	 * return 0 in the event of a tie.
	 * 
	 * Note that Math.abs(n) returns the absolute value of a number.
	 *
	 * close10(8, 13) -> 8
	 * close10(13, 8) -> 8
	 * close10(13, 7) -> 0
	 * 
	 */
	public static int close10(int a, int b)
	{
		// ADD YOUR CODE HERE
	}
	
	public static void main(String[] args)
	{
		testCase(8, 13, 8);
		testCase(13, 8, 8);
		testCase(13, 7, 0);
		testCase(7, 13, 0);
		testCase(9, 13, 9);
		testCase(10, 12, 10);
		testCase(11, 10, 10);
		testCase(5, 21, 5);
		testCase(0, 20, 0);
		testCase(10, 10, 0);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}
	
	private static void testCase(int a, int b, int result)
	{
		String r;
		try
		{
			r = ""+close10(a, b);
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

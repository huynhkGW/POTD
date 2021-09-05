/**
 * CodingBat Java Activity "maxMod5" from Logic1.
 * codingbat.com
 */
public class MaxMod5
{
	private static int failures = 0;
	private static final String METHOD_NAME = "maxMod5";
	/**
	 * INSTRUCTIONS:
	 * Given two int values, return whichever value is larger. However if the 
	 * two values have the same remainder when divided by 5, then the return 
	 * the smaller value. However, in all cases, if the two values are the 
	 * same, return 0. Note: the % "mod" operator computes the remainder, e.g.
	 * 7 % 5 is 2.
	 *
	 * maxMod5(2, 3) -> 3
	 * maxMod5(6, 2) -> 6
	 * maxMod5(3, 2) -> 3
	 * 
	 */
	public static int maxMod5(int a, int b)
	{
		// ADD YOUR CODE HERE
	}
	
	public static void main(String[] args)
	{
		testCase(2, 3, 3);
		testCase(6, 2, 6);
		testCase(3, 2, 3);
		testCase(8, 12, 12);
		testCase(7, 12, 7);
		testCase(11, 6, 6);
		testCase(2, 7, 2);
		testCase(7, 7, 0);
		testCase(9, 1, 9);
		testCase(9, 14, 9);
		testCase(1, 2, 2);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}
	
	private static void testCase(int a, int b, int result)
	{
		String r;
		try
		{
			r = ""+maxMod5(a, b);
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

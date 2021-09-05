/**
 * CodingBat Java Activity "twoAsOne" from Logic1.
 * codingbat.com
 */
public class TwoAsOne
{
	private static int failures = 0;
	private static final String METHOD_NAME = "twoAsOne";

	/**
	 * INSTRUCTIONS:
	 * Given three int values, a b c, return true if it is possible to add two 
	 * of the ints to get the third.
	 * 
	 * twoAsOne(1, 2, 3) -> true
	 * twoAsOne(3, 1, 2) -> true
	 * twoAsOne(3, 2, 2) -> false
	 * 
	 */
	public static boolean twoAsOne(int a, int b, int c)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(1, 2, 3, true);
		testCase(3, 1, 2, true);
		testCase(3, 2, 2, false);
		testCase(2, 3, 1, true);
		testCase(5, 3, -2, true);
		testCase(5, 3, -3, false);
		testCase(2, 5, 3, true);
		testCase(9, 5, 5, false);
		testCase(9, 4, 5, true);
		testCase(5, 4, 9, true);
		testCase(3, 3, 0, true);
		testCase(3, 3, 2, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, int c, boolean result)
	{
		String r;
		try
		{
			r = ""+twoAsOne(a, b, c);
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

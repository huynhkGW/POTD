/**
 * CodingBat Java Activity "intMax" from Logic1.
 * codingbat.com
 */
public class IntMax
{
	private static int failures = 0;
	private static final String METHOD_NAME = "intMax";

	/**
	 * INSTRUCTIONS:
	 * Given three int values, a b c, return the largest.
	 * 
	 * intMax(1, 2, 3) -> 3
	 * intMax(1, 3, 2) -> 3
	 * intMax(3, 2, 1) -> 3
	 * 
	 */
	public static int intMax(int a, int b, int c)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(1, 2, 3, 3);
		testCase(1, 3, 2, 3);
		testCase(3, 2, 1, 3);
		testCase(9, 3, 3, 9);
		testCase(3, 9, 3, 9);
		testCase(3, 3, 9, 9);
		testCase(8, 2, 3, 8);
		testCase(-3, -1, -2, -1);
		testCase(6, 2, 5, 6);
		testCase(5, 6, 2, 6);
		testCase(5, 2, 6, 6);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, int c, int result)
	{
		String r;
		try
		{
			r = ""+intMax(a, b, c);
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

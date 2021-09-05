/**
 * CodingBat Java Activity "withoutDoubles" from Logic1.
 * codingbat.com
 */
public class WithoutDoubles
{
	private static int failures = 0;
	private static final String METHOD_NAME = "withoutDoubles";
	/**
	 * INSTRUCTIONS:
	 * Return the sum of two 6-sided dice rolls, each in the range 1..6. 
	 * However, if noDoubles is true, if the two dice show the same value, 
	 * increment one die to the next value, wrapping around to 1 if its value 
	 * was 6.
	 * 
	 * withoutDoubles(2, 3, true) -> 5
	 * withoutDoubles(3, 3, true) -> 7
	 * withoutDoubles(3, 3, false) -> 6
	 * 
	 */
	public static int withoutDoubles(int die1, int die2, boolean noDoubles)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(2, 3, true, 5);
		testCase(3, 3, true, 7);
		testCase(3, 3, false, 6);
		testCase(2, 3, false, 5);
		testCase(5, 4, true, 9);
		testCase(5, 4, false, 9);
		testCase(5, 5, true, 11);
		testCase(5, 5, false, 10);
		testCase(6, 6, true, 7);
		testCase(6, 6, false, 12);
		testCase(1, 6, true, 7);
		testCase(6, 1, false, 7);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, boolean c, int result)
	{
		String r;
		try
		{
			r = ""+withoutDoubles(a, b, c);
			if (r.equals(""+result))
			{
				System.out.print("PASS: ");
			}
			else
			{
				System.out.println("FAIL: ");
				failures ++;
			}
		}
		catch (Exception e)
		{
			r = e.getMessage();
			System.out.print("FAIL: ");
			failures ++;
		}
		System.out.println(METHOD_NAME+"("+a+", "+b+", "+c+") -> "+r + ", EXPECTED: "+result);
	}

}

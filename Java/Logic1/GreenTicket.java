/**
 * CodingBat Java Activity "greenTicket" from Logic1.
 * codingbat.com
 */
public class GreenTicket
{
	private static int failures = 0;
	private static final String METHOD_NAME = "greenTicket";

	/**
	 * INSTRUCTIONS:
	 * Given three int values, a b c, return the largest.  If the numbers are
	 * all different from each other, the result is 0.  If all the numbers are
	 * the same, the result is 20.  If two of the numbers are the same, the
	 * result is 10.
	 * 
	 * greenTicket(1, 2, 3) -> 0
	 * greenTicket(2, 2, 2) -> 20
	 * greenTicket(1, 1, 2) -> 10
	 * 
	 */
	public static int greenTicket(int a, int b, int c)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(1, 2, 3, 0);
		testCase(2, 2, 2, 20);
		testCase(1, 1, 2, 10);
		testCase(2, 1, 1, 10);
		testCase(1, 2, 1, 10);
		testCase(3, 2, 1, 0);
		testCase(0, 0, 0, 20);
		testCase(2, 0, 0, 10);
		testCase(0, 9, 10, 0);
		testCase(0, 10, 0, 10);
		testCase(9, 9, 9, 20);
		testCase(9, 0, 9, 10);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, int c, int result)
	{
		String r;
		try
		{
			r = ""+greenTicket(a, b, c);
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

/**
 * CodingBat Java Activity "diff21" from Logic1.
 * codingbat.com
 */
public class Diff21
{
	private static int failures = 0;
	private static final String METHOD_NAME = "diff21";

	/**
	 * INSTRUCTIONS:
	 * Given an int n, return the absolute difference between n and 21, except 
	 * return double the absolute difference if n is over 21.
	 * 
	 * diff21(19) -> 2
	 * diff21(10) -> 11
	 * diff21(21) -> 0
	 * 
	 */
	public static int diff21(int n)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(19, 2);
		testCase(10, 11);
		testCase(21, 0);
		testCase(22, 2);
		testCase(25, 8);
		testCase(30, 18);
		testCase(0, 21);
		testCase(1, 20);
		testCase(2, 19);
		testCase(-1, 22);
		testCase(-2, 23);
		testCase(50, 58);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int result)
	{
		String r;
		try
		{
			r = ""+diff21(a);
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

/**
 * CodingBat Java Activity "or35" from Warmup1.
 * codingbat.com
 */
public class Or35
{
	private static int failures = 0;
	private static final String METHOD_NAME = "or35";

	/**
	 * INSTRUCTIONS:
	 * Return true if the given non-negative number is a multiple of 3 or a 
	 * multiple of 5. Use the % "mod" operator -- see Introduction to Mod
	 * 
	 * https://codingbat.com/doc/practice/mod-introduction.html
	 * 
	 * or35(3) -> true
	 * or35(5) -> true
	 * or35(8) -> false
	 * 
	 */
	public static boolean or35(int n)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(3, true);
		testCase(10, true);
		testCase(8, false);
		testCase(15, true);
		testCase(5, true);
		testCase(9, true);
		testCase(4, false);
		testCase(7, false);
		testCase(6, true);
		testCase(17, false);
		testCase(18, true);
		testCase(29, false);
		testCase(20, true);
		testCase(21, true);
		testCase(22, false);
		testCase(45, true);
		testCase(99, true);
		testCase(100, true);
		testCase(101, false);
		testCase(121, false);
		testCase(122, false);
		testCase(123, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, boolean result)
	{
		String r;
		try
		{
			r = ""+or35(a);
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

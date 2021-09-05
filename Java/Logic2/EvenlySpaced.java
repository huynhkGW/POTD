/*
 * CodingBat Java Activity "evenlySpaced" from Logic-2 section.
 * codingbat.com
 */

public class EvenlySpaced 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "evenlyBricks";
	
	/*
	 * INSTRUCTIONS
	 * Given three ints, a b c, one of them is small, one is medium and 
	 * one is large. Return true if the three values are evenly spaced, 
	 * so the difference between small and medium is the same as the 
	 * difference between medium and large.
	 * 
	 * evenlySpaced(2, 4, 6) -> true
	 * evenlySpaced(4, 6, 2) -> true
	 * evenlySpaced(4, 6, 3) -> false
	 */
	public static boolean evenlySpaced(int a, int b, int c)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(2, 4, 6, true);
		testCase(4, 6, 2, true);
		testCase(4, 6, 3, false);
		testCase(6, 2, 4, true);
		testCase(6, 2, 8, false);
		testCase(2, 2, 2, true);
		testCase(2, 2, 3, false);
		testCase(9, 10, 11, true);
		testCase(10, 9, 11, true);
		testCase(10, 9, 9, false);
		testCase(2, 4, 4, false);
		testCase(2, 2, 4, false);
		testCase(3, 6, 12, false);
		testCase(12, 3, 6, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, int c, boolean result)
	{
		String r;
		try
		{
			r = ""+ evenlySpaced(a, b, c);
			if (r.equals(""+result))
			{
				System.out.print("PASS: ");
			}
			else
			{
				System.out.println("FAIL: ");
				failures++
			}
		}
		catch (Exception e)
		{
			r = e.getMessage();
			System.out.print("FAIL: ");
			failures++;
		}
		System.out.println(METHOD_NAME+"("+a+", "+b+", "+c+") -> "+r + ", EXPECTED: "+result);
	}

}

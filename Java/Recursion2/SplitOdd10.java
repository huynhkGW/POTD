import java.util.Arrays;

/*
 * CodingBat Java Activity "splitOdd10" from Recursion-2 section.
 * codingbat.com
 */

public class SplitOdd10 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "splitOdd10";
	
	/*
	 * INSTRUCTIONS
	 *Given an array of ints, is it possible to divide the ints into two groups, 
	 *so that the sum of one group is a multiple of 10, and the sum of the other 
	 *group is odd. Every int must be in one group or the other. Write a recursive 
	 *helper method that takes whatever arguments you like, and make the initial 
	 *call to your recursive helper from splitOdd10(). (No loops needed.)
	 *
	 *splitOdd10([5, 5, 5]) -> true
	 *splitOdd10([5, 5, 6]) -> false
	 *splitOdd10([5, 5, 6, 1]) -> true
	 */
	public static boolean splitOdd10(int[] nums)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {5, 5, 5}, true);
		testCase(new int[] {5, 5, 6}, false);
		testCase(new int[] {5, 5, 6, 1}, true);
		testCase(new int[] {6, 5, 5, 1}, true);
		testCase(new int[] {6, 5, 5, 1, 10}, true);
		testCase(new int[] {6, 5, 5, 5, 1}, false);
		testCase(new int[] {1}, true);
		testCase(new int[] {}, false);
		testCase(new int[] {10, 7, 5, 5}, true);
		testCase(new int[] {10, 0, 5, 5}, false);
		testCase(new int[] {10, 7, 5, 5, 2}, true);
		testCase(new int[] {10, 7, 5, 5, 1}, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] a, boolean expected)
	{
		String r;
		try
		{
			r = ""+ (splitOdd10(a));
			if (r.equals(""+ expected))
			{
				System.out.print("PASS: ");
			}
			else
			{
				System.out.println("FAIL: ");
				failures++;
			}
		}
		catch (Exception e)
		{
			r = e.getMessage();
			System.out.print("FAIL: ");
			failures++;
		}
		System.out.println(METHOD_NAME+"("+ Arrays.toString(a) + ") -> "+r + ", EXPECTED: "+ expected);
	
	}

}

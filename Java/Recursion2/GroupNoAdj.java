import java.util.Arrays;

/*
 * CodingBat Java Activity "groupNoAdj" from Recursion-2 section.
 * codingbat.com
 */

public class GroupNoAdj 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "groupNoAdj";
	
	/*
	 * INSTRUCTIONS
	 * Given an array of ints, is it possible to choose a group of some of the 
	 * ints, such that the group sums to the given target with this additional 
	 * constraint: If a value in the array is chosen to be in the group, the 
	 * value immediately following it in the array must not be chosen. (No loops 
	 * needed.)
	 * 
	 * groupNoAdj(0, [2, 5, 10, 4], 12) -> true
	 * groupNoAdj(0, [2, 5, 10, 4], 14) -> false
	 * groupNoAdj(0, [2, 5, 10, 4], 7) -> false
	 */
	public static boolean groupNoAdj(int start, int[] nums, int target)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(0, new int[] {2, 5, 10, 4}, 12, true);
		testCase(0, new int[] {2, 5, 10, 4}, 14, false);
		testCase(0, new int[] {2, 5, 10, 4}, 7, false);
		testCase(0, new int[] {2, 5, 10, 4, 2}, 7, true);
		testCase(0, new int[] {2, 5, 10, 4}, 9, true);
		testCase(0, new int[] {10, 2, 2, 3, 3}, 15, true);
		testCase(0, new int[] {10, 2, 2, 3, 3}, 7, false);
		testCase(0, new int[] {}, 0, true);
		testCase(0, new int[] {1}, 1, true);
		testCase(0, new int[] {9}, 1, false);
		testCase(0, new int[] {9}, 0, true);
		testCase(0, new int[] {5, 10, 4, 1}, 11, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int[] b, int c, boolean expected)
	{
		String r;
		try
		{
			r = ""+ groupNoAdj(a, b, c);
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
		System.out.println(METHOD_NAME+"("+ a + ", " + Arrays.toString(b)+ ", " + c + ") -> "+r + ", EXPECTED: "+ expected);
	}

}

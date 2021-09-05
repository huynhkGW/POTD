import java.util.Arrays;

/*
 * CodingBat Java Activity "groupSumClump" from Recursion-2 section.
 * codingbat.com
 */

public class GroupSumClump 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "groupSumClump";
	
	/*
	 * INSTRUCTIONS
	 *Given an array of ints, is it possible to choose a group of some of the 
	 *ints, such that the group sums to the given target, with this additional 
	 *constraint: if there are numbers in the array that are adjacent and the 
	 *identical value, they must either all be chosen, or none of them chosen. 
	 *For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in 
	 *the middle must be chosen or not, all as a group. (one loop can be used 
	 *to find the extent of the identical values).
	 *
	 *groupSumClump(0, [2, 4, 8], 10) -> true
	 *groupSumClump(0, [1, 2, 4, 8, 1], 14) -> true
	 *groupSumClump(0, [2, 4, 4, 8], 14) -> false
	 */
	public static boolean groupSumClump(int start, int[] nums, int target)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(0, new int[] {2, 4, 8}, 10, true);
		testCase(0, new int[] {1, 2, 4, 8, 1}, 14, true);
		testCase(0, new int[] {2, 4, 4, 8}, 14, false);
		testCase(0, new int[] {8, 2, 2, 1}, 9, true);
		testCase(0, new int[] {8, 2, 2, 1}, 11, false);
		testCase(0, new int[] {1}, 1, true);
		testCase(0, new int[] {9}, 1, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int[] b, int c, boolean expected)
	{
		String r;
		try
		{
			r = ""+ groupSumClump(a, b, c);
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

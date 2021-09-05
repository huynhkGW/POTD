import java.util.Arrays;

/*
 * CodingBat Java Activity "groupSum" from Recursion-2 section.
 * codingbat.com
 */

public class GroupSum 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "groupSum";
	
	/*
	 * INSTRUCTIONS
	 * Given an array of ints, is it possible to choose a group of some of the ints, 
	 * such that the group sums to the given target? This is a classic backtracking 
	 * recursion problem. Once you understand the recursive backtracking strategy in 
	 * this problem, you can use the same pattern for many problems to search a space 
	 * of choices. Rather than looking at the whole array, our convention is to consider 
	 * the part of the array starting at index start and continuing to the end of the 
	 * array. The caller can specify the whole array simply by passing start as 0. No 
	 * loops are needed -- the recursive calls progress down the array.
	 * 
	 * groupSum(0, [2, 4, 8], 10) -> true
	 * groupSum(0, [2, 4, 8], 14) -> true
	 * groupSum(0, [2, 4, 8], 9) -> false
	 */
	public static boolean groupSum(int start, int[] nums, int target)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(0, new int[] {2, 4, 8}, 10, true);
		testCase(0, new int[] {2, 4, 8}, 14, true);
		testCase(0, new int[] {2, 4, 8}, 9, false);
		testCase(0, new int[] {2, 4, 8}, 8, true);
		testCase(1, new int[] {2, 4, 8}, 8, true);
		testCase(1, new int[] {2, 4, 8}, 2, false);
		testCase(0, new int[] {1}, 1, true);
		testCase(0, new int[] {9}, 1, false);
		testCase(1, new int[] {9}, 0, true);
		testCase(0, new int[] {}, 0, true);
		testCase(0, new int[] {10, 2, 2, 5}, 17, true);
		testCase(0, new int[] {10, 2, 2, 5}, 15, true);
		testCase(0, new int[] {10, 2, 2, 5}, 9, true);
		
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int[] b, int c, boolean expected)
	{
		String r;
		try
		{
			r = ""+ groupSum(a, b, c);
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

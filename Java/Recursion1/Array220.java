import java.util.Arrays;

/*
 * CodingBat Java Activity "array220" from Recursion-1 section.
 * codingbat.com
 */

public class Array220 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "array220";
	
	/*
	 * INSTRUCTIONS
	 * Given an array of ints, compute recursively if the array contains 
	 * somewhere a value followed in the array by that value times 10. 
	 * We'll use the convention of considering only the part of the array 
	 * that begins at the given index. In this way, a recursive call can 
	 * pass index+1 to move down the array. The initial call will pass in 
	 * index as 0.
	 * 
	 * array220([1, 2, 20], 0) -> true
	 * array220([3, 30], 0) -> true
	 * array220([3], 0) -> false
	 */
	public static boolean array220(int[] nums, int index)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {1, 2, 20}, 0, true);
		testCase(new int[] {3, 30}, 0, true);
		testCase(new int[] {3}, 0, false);
		testCase(new int[] {}, 0, false);
		testCase(new int[] {3, 3, 30, 4}, 0, true);
		testCase(new int[] {2, 19, 4}, 0, false);
		testCase(new int[] {20, 2, 21}, 0, false);
		testCase(new int[] {20, 2, 21, 210}, 0, true);
		testCase(new int[] {2, 200, 2000}, 0, true);
		testCase(new int[] {0, 0}, 0, true);
		testCase(new int[] {1, 2, 3, 4, 5, 6}, 0, false);
		testCase(new int[] {1, 2, 3, 4, 5, 50, 6}, 0, true);
		testCase(new int[] {1, 2, 3, 4, 5, 51, 6}, 0, false);
		testCase(new int[] {1, 2, 3, 4, 4, 50, 500, 6}, 0, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] a, int b, boolean expected)
	{
		String r;
		try
		{
			r = ""+ array220(a, b);
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
		System.out.println(METHOD_NAME+"("+ Arrays.toString(a)+") -> "+r + ", EXPECTED: "+ expected);
	}

}

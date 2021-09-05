import java.util.Arrays;

/*
 * CodingBat Java Activity "copyEvens" from AP-1 section.
 * codingbat.com
 */

public class CopyEvens 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "copyEvens";
	
	/*
	 * INSTRUCTIONS
	 * Given an array of positive ints, return a new array of length "count" containing 
	 * the first even numbers from the original array. The original array will contain 
	 * at least "count" even numbers.
	 * 
	 * copyEvens([3, 2, 4, 5, 8], 2) -> [2, 4]
	 * copyEvens([3, 2, 4, 5, 8], 3) -> [2, 4, 8]
	 * copyEvens([6, 1, 2, 4, 5, 8], 3) -> [6, 2, 4]
	 */
	public static int[] copyEvens(int[] nums, int count)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {3, 2, 4, 5, 8}, 2, new int[] {2, 4});
		testCase(new int[] {3, 2, 4, 5, 8}, 3, new int[] {2, 4, 8});
		testCase(new int[] {6, 1, 2, 4, 5, 8}, 3, new int[] {6, 2, 4});
		testCase(new int[] {6, 1, 2, 4, 5, 8}, 4, new int[] {6, 2, 4, 8});
		testCase(new int[] {3, 1, 4, 1, 5}, 1, new int[] {4});
		testCase(new int[] {2}, 1, new int[] {2});
		testCase(new int[] {6, 2, 4, 8}, 2, new int[] {6, 2});
		testCase(new int[] {6, 2, 4, 8}, 3, new int[] {6, 2, 4});
		testCase(new int[] {6, 2, 4, 8}, 4, new int[] {6, 2, 4, 8});
		testCase(new int[] {1, 8, 4}, 1, new int[] {8});
		testCase(new int[] {1, 8, 4}, 2, new int[] {8, 4});
		testCase(new int[] {2, 8, 4}, 2, new int[] {2, 8});

		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, int a, int[] result)
	{
		String r;
		String i = Arrays.toString(testValues);
		String out = Arrays.toString(result);
		try
		{
			r = Arrays.toString(copyEvens(testValues, a));
			if (r.equals(out))
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
		System.out.println(METHOD_NAME+"("+i+ ", " + a + ") -> "+ r + ", EXPECTED: "+ out);
	}

}


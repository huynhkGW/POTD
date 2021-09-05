import java.util.Arrays;

/*
 * CodingBat Java Activity "copyEndy" from AP-1 section.
 * codingbat.com
 */

public class CopyEndy 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "copyEndy";
	
	/*
	 * INSTRUCTIONS
	 * We'll say that a positive int n is "endy" if it is in the range 0..10 or 
	 * 90..100 (inclusive). Given an array of positive ints, return a new array 
	 * of length "count" containing the first endy numbers from the original array. 
	 * Decompose out a separate isEndy(int n) method to test if a number is endy. 
	 * The original array will contain at least "count" endy numbers.
	 * 
	 * copyEndy([9, 11, 90, 22, 6], 2) -> [9, 90]
	 * copyEndy([9, 11, 90, 22, 6], 3) -> [9, 90, 6]
	 * copyEndy([12, 1, 1, 13, 0, 20], 2) -> [1, 1]
	 */
	public static int[] copyEndy(int[] nums, int count)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {9, 11, 90, 22, 6}, 2, new int[] {9, 90});
		testCase(new int[] {9, 11, 90, 22, 6}, 3, new int[] {9, 90, 6});
		testCase(new int[] {12, 1, 1, 13, 0, 20}, 2, new int[] {1, 1});
		testCase(new int[] {12, 1, 1, 13, 0, 20}, 3, new int[] {1, 1, 0});
		testCase(new int[] {0}, 1, new int[] {0});
		testCase(new int[] {10, 11, 90}, 2, new int[] {10, 90});
		testCase(new int[] {90, 22, 100}, 2, new int[] {90, 100});
		testCase(new int[] {12, 11, 10, 89, 101, 4}, 1, new int[] {10});
		testCase(new int[] {13, 2, 2, 0}, 2, new int[] {2, 2});
		testCase(new int[] {13, 2, 2, 0}, 3, new int[] {2, 2, 0});
		testCase(new int[] {13, 2, 13, 2, 0, 30}, 2, new int[] {2, 2});
		testCase(new int[] {13, 2, 13, 2, 0, 30}, 3, new int[] {2, 2, 0});

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
			r = Arrays.toString(copyEndy(testValues, a));
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


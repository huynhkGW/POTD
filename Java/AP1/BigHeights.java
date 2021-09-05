import java.util.Arrays;

/*
 * CodingBat Java Activity "bigHeights" from AP-1 section.
 * codingbat.com
 */

public class BigHeights 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "bigHeights";
	
	/*
	 * INSTRUCTIONS
	 * (A variation on the sumHeights problem.) We have an array of heights, 
	 * representing the altitude along a walking trail. Given start/end 
	 * indexes into the array, return the number of "big" steps for a walk 
	 * starting at the start index and ending at the end index. We'll say 
	 * that step is big if it is 5 or more up or down. The start end end 
	 * index will both be valid indexes into the array with start <= end.
	 * 
	 * bigHeights([5, 3, 6, 7, 2], 2, 4) -> 1
	 * bigHeights([5, 3, 6, 7, 2], 0, 1) -> 0
	 * bigHeights([5, 3, 6, 7, 2], 0, 4) -> 1
	 */
	public static int bigHeights(int[] heights, int start, int end)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {5, 3, 6, 7, 2}, 2, 4, 1);
		testCase(new int[] {5, 3, 6, 7, 2}, 0, 1, 0);
		testCase(new int[] {5, 3, 6, 7, 2}, 0, 4, 1);
		testCase(new int[] {5, 3, 6, 7, 3}, 0, 4, 0);
		testCase(new int[] {5, 3, 6, 7, 2}, 1, 1, 0);
		testCase(new int[] {5, 13, 6, 7, 2}, 1, 2, 1);
		testCase(new int[] {5, 13, 6, 7, 2}, 0, 2, 2);
		testCase(new int[] {5, 13, 6, 7, 2}, 1, 4, 2);
		testCase(new int[] {5, 13, 6, 7, 2}, 0, 4, 3);
		testCase(new int[] {5, 13, 6, 7, 2}, 0, 3, 2);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3, 0);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8, 1);
		testCase(new int[] {1, 2, 3, 14, 5, 4, 3, 2, 10}, 0, 3, 1);
		testCase(new int[] {1, 2, 3, 14, 5, 4, 3, 2, 10}, 7, 8, 1);
		testCase(new int[] {1, 2, 3, 14, 5, 4, 3, 2, 10}, 3, 8, 2);
		testCase(new int[] {1, 2, 3, 14, 5, 4, 3, 2, 10}, 2, 8, 3);

		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, int a, int b, int result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+bigHeights(testValues, a, b);
			if (r.equals("" +result))
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
		System.out.println(METHOD_NAME+"("+i+ ", " + a + ", " + b + ") -> "+r + ", EXPECTED: "+ result);
	}

}


import java.util.Arrays;

/*
 * CodingBat Java Activity "sumHeights" from AP-1 section.
 * codingbat.com
 */

public class SumHeights 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "sumHeights";
	
	/*
	 * INSTRUCTIONS
	 * We have an array of heights, representing the altitude along a 
	 * walking trail. Given start/end indexes into the array, return 
	 * the sum of the changes for a walk beginning at the start index 
	 * and ending at the end index. For example, with the heights 
	 * {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6. 
	 * The start end end index will both be valid indexes into the array 
	 * with start <= end.
	 * 
	 * sumHeights([5, 3, 6, 7, 2], 2, 4) -> 6
	 * sumHeights([5, 3, 6, 7, 2], 0, 1) -> 2
	 * sumHeights([5, 3, 6, 7, 2], 0, 4) -> 11
	 */
	public static int sumHeights(int[] heights, int start, int end)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {5, 3, 6, 7, 2}, 2, 4, 6);
		testCase(new int[] {5, 3, 6, 7, 2}, 0, 1, 2);
		testCase(new int[] {5, 3, 6, 7, 2}, 0, 4, 11);
		testCase(new int[] {5, 3, 6, 7, 2}, 1, 1, 0);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3, 3);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8, 11);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 7, 8, 8);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 8, 8, 0);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 2, 2, 0);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 3, 6, 3);
		testCase(new int[] {10, 8, 7, 7, 7, 6, 7}, 1, 4, 1);
		testCase(new int[] {10, 8, 7, 7, 7, 6, 7}, 1, 5, 2);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testHeights, int start, int end, int result)
	{
		String r;
		String i = Arrays.toString(testHeights);
		try
		{
			r = ""+sumHeights(testHeights, start, end);
			if (r.equals(""+result))
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
		System.out.println(METHOD_NAME+"("+i+ ", " + start + ", " + end + ") -> "+r + ", EXPECTED: "+result);
	}

}


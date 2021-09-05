import java.util.Arrays;

/*
 * CodingBat Java Activity "centeredAverage" from Array-2 section.
 * codingbat.com
 */

public class CenteredAverage 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "centeredAverage";
	
	/*
	 * INSTRUCTIONS
	 * Return the "centered" average of an array of ints, which we'll 
	 * say is the mean average of the values, except ignoring the largest 
	 * and smallest values in the array. If there are multiple copies of 
	 * the smallest value, ignore just one copy, and likewise for the largest 
	 * value. Use int division to produce the final average. You may assume 
	 * that the array is length 3 or more.
	 * 
	 * centeredAverage([1, 2, 3, 4, 100]) -> 3
	 * centeredAverage([1, 1, 5, 5, 10, 8, 7]) -> 5
	 * centeredAverage([-10, -4, -2, -4, -2, 0]) -> -3
	 */
	public static int centeredAverage(int[] nums)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {1, 2, 3, 4, 100}, 3);
		testCase(new int[] {1, 1, 5, 5, 10, 8, 7}, 5);
		testCase(new int[] {-10, -4, -2, -4, -2, 0}, -3);
		testCase(new int[] {5, 3, 4, 6, 2}, 4);
		testCase(new int[] {5, 3, 4, 0, 100}, 4);
		testCase(new int[] {100, 0, 5, 3, 4}, 4);
		testCase(new int[] {4, 0, 100}, 4);
		testCase(new int[] {0, 2, 3, 4, 100}, 3);
		testCase(new int[] {1, 1, 100}, 1);
		testCase(new int[] {7, 7, 7}, 7);
		testCase(new int[] {1, 7, 8}, 7);
		testCase(new int[] {1, 1, 99, 99}, 50);
		testCase(new int[] {1000, 0, 1, 99}, 50);
		testCase(new int[] {4, 4, 4, 4, 5}, 4);
		testCase(new int[] {4, 4, 4, 1, 5}, 4);
		testCase(new int[] {6, 4, 8, 12, 3}, 6);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, int result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+centeredAverage(testValues);
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
		System.out.println(METHOD_NAME+"("+i+") -> "+r + ", EXPECTED: "+result);
	}

}


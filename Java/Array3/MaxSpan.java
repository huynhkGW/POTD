import java.util.Arrays;

/*
 * CodingBat Java Activity "maxSpan" from Array-3 section.
 * codingbat.com
 */

public class MaxSpan 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "maxSpan";
	/*
	 * INSTRUCTIONS
	 * Consider the leftmost and righmost appearances of some value in an array. 
	 * We'll say that the "span" is the number of elements between the two inclusive. 
	 * A single value has a span of 1. Returns the largest span found in the given 
	 * array. (Efficiency is not a priority.)
	 * 
	 * maxSpan([1, 2, 1, 1, 3]) -> 4
	 * maxSpan([1, 4, 2, 1, 4, 1, 4]) -> 6
	 * maxSpan([1, 4, 2, 1, 4, 4, 4]) -> 6
	 */
	
	public static int maxSpan(int[] nums)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args) 
	{
		testCase(new int[] {1, 2, 1, 1, 3}, 4);
		testCase(new int[] {1, 4, 2, 1, 4, 1, 4}, 6);
		testCase(new int[] {1, 4, 2, 1, 4, 4, 4}, 6);
		testCase(new int[] {3, 3, 3}, 3);
		testCase(new int[] {3, 9, 3}, 3);
		testCase(new int[] {3, 9, 9}, 2);
		testCase(new int[] {3, 9}, 1);
		testCase(new int[] {3, 3}, 2);
		testCase(new int[] {}, 0);
		testCase(new int[] {1}, 1);

		System.out.println();
		System.out.println(failures + " failed test cases.");
	}
	
	public static void testCase(int[] testValue, int expected)
	{
		String r;
		String a = Arrays.toString(testValue);
		try
		{
			r = "" + (maxSpan(testValue));
			if (r.equals("" + expected))
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
		System.out.println(METHOD_NAME+"(" + a + ") -> "+r + ", EXPECTED: "+ expected);
	}
}
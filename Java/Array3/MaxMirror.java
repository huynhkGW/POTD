import java.util.Arrays;

/*
 * CodingBat Java Activity "maxMirror" from Array-3 section.
 * codingbat.com
 */

public class MaxMirror 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "maxMirror";
	/*
	 * INSTRUCTIONS
	 * We'll say that a "mirror" section in an array is a group of contiguous elements such 
	 * that somewhere in the array, the same group appears in reverse order. For example, 
	 * the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). 
	 * Return the size of the largest mirror section found in the given array.
	 * 
	 * maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) -> 3
	 * maxMirror([1, 2, 1, 4]) -> 3
	 * maxMirror([7, 1, 2, 9, 7, 2, 1]) -> 2
	 */
	public static int maxMirror(int[] nums)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args) 
	{
		testCase(new int[] {1, 2, 3, 8, 9, 3, 2, 1}, 3);
		testCase(new int[] {1, 2, 1, 4}, 3);
		testCase(new int[] {7, 1, 2, 9, 7, 2, 1}, 2);
		testCase(new int[] {21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}, 4);
		testCase(new int[] {1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25}, 4);
		testCase(new int[] {1, 2, 3, 2, 1}, 5);
		testCase(new int[] {1, 2, 3, 3, 8}, 2);
		testCase(new int[] {1, 1, 1}, 3);
		testCase(new int[] {1}, 1);
		testCase(new int[] {}, 0);
		testCase(new int[] {9, 1, 1, 4, 2, 1, 1, 1}, 3);
		testCase(new int[] {5, 9, 9, 4, 5, 4, 9, 9, 2}, 7);
		testCase(new int[] {5, 9, 9, 6, 5, 4, 9, 9, 2}, 2);
		testCase(new int[] {5, 9, 1, 6, 5, 4, 1, 9, 5}, 3);
	}
	
	public static void testCase(int[] testValue, int expected)
	{
		String r;
		String a = Arrays.toString(testValue);
		try
		{
			r = "" + (maxMirror(testValue));
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
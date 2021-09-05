import java.util.Arrays;

/*
 * CodingBat Java Activity "countClumps" from Array-3 section.
 * codingbat.com
 */

public class CountClumps 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "countClumps";
	/*
	 * INSTRUCTIONS
	 * Say that a "clump" in an array is a series of 2 or more adjacent elements 
	 * of the same value. Return the number of clumps in the given array.
	 * 
	 * countClumps([1, 2, 2, 3, 4, 4]) -> 2
	 * countClumps([1, 1, 2, 1, 1]) -> 2
	 * countClumps([1, 1, 1, 1, 1]) -> 1
	 */
	public static int countClumps(int[] nums)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args) 
	{
		testCase(new int[] {1, 2, 2, 3, 4, 4}, 2);
		testCase(new int[] {1, 1, 2, 1, 1}, 2);
		testCase(new int[] {1, 1, 1, 1, 1}, 1);
		testCase(new int[] {1, 2, 3}, 0);
		testCase(new int[] {2, 2, 1, 1, 1, 2, 1, 1, 2, 2}, 4);
		testCase(new int[] {0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}, 4);
		testCase(new int[] {0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}, 5);
		testCase(new int[] {0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}, 5);
		testCase(new int[] {}, 0);
	}
	
	public static void testCase(int[] testValue, int expected)
	{
		String r;
		String a = Arrays.toString(testValue);
		try
		{
			r = "" + (countClumps(testValue));
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
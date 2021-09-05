import java.util.Arrays;

/*
 * CodingBat Java Activity "canBalance" from Array-3 section.
 * codingbat.com
 */

public class CanBalance 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "canBalance";
	/*
	 * INSTRUCTIONS
	 * Given a non-empty array, return true if there is a place to split the 
	 * array so that the sum of the numbers on one side is equal to the sum of 
	 * the numbers on the other side.
	 * 
	 * canBalance([1, 1, 1, 2, 1]) -> true
	 * canBalance([2, 1, 1, 2, 1]) -> false
	 * canBalance([10, 10]) -> true
	 */
	
	public static boolean canBalance(int[] nums)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args) 
	{
		testCase(new int[] {1, 1, 1, 2, 1}, true);
		testCase(new int[] {2, 1, 1, 2, 1}, false);
		testCase(new int[] {10, 10}, true);
		testCase(new int[] {10, 0, 1, -1, 10}, true);
		testCase(new int[] {1, 1, 1, 1, 4}, true);
		testCase(new int[] {2, 1, 1, 1, 4}, false);
		testCase(new int[] {2, 3, 4, 1, 2}, false);
		testCase(new int[] {1, 2, 3, 1, 0, 2, 3}, true);
		testCase(new int[] {1, 2, 3, 1, 0, 1, 3}, false);
		testCase(new int[] {1}, false);

		System.out.println();
		System.out.println(failures + " failed test cases.");
	}
	
	public static void testCase(int[] testValue, boolean expected)
	{
		String r;
		String a = Arrays.toString(testValue);
		try
		{
			r = "" + (canBalance(testValue));
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
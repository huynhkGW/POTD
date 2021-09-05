import java.util.Arrays;

/*
 * CodingBat Java Activity "sum67" from Array-2 section.
 * codingbat.com
 */

public class Sum67 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "sum67";
	
	/*
	 * INSTRUCTIONS
	 * Return the sum of the numbers in the array, except ignore sections of numbers 
	 * starting with a 6 and extending to the next 7 (every 6 will be followed by at 
	 * least one 7). Return 0 for no numbers.
	 * 
	 * sum67([1, 2, 2]) -> 5
	 * sum67([1, 2, 2, 6, 99, 99, 7]) -> 5
	 * sum67([1, 1, 6, 7, 2]) -> 4
	 */
	public static int sum67(int[] nums)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {1, 2, 2}, 5);
		testCase(new int[] {1, 2, 2, 6, 99, 99, 7}, 5);
		testCase(new int[] {1, 1, 6, 7, 2}, 4);
		testCase(new int[] {1, 6, 2, 2, 7, 1, 6, 99, 99, 7}, 2);
		testCase(new int[] {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}, 2);
		testCase(new int[] {2, 7, 6, 2, 6, 7, 2, 7}, 18);
		testCase(new int[] {2, 7, 6, 2, 6, 2, 7}, 9);
		testCase(new int[] {1, 6, 7, 7}, 8);
		testCase(new int[] {6, 7, 1, 6, 7, 7}, 8);
		testCase(new int[] {6, 8, 1, 6, 7}, 0);
		testCase(new int[] {}, 0);
		testCase(new int[] {6, 7, 11}, 11);
		testCase(new int[] {11, 6, 7, 11}, 22);
		testCase(new int[] {2, 2, 6, 7, 7}, 11);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, int result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+sum67(testValues);
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


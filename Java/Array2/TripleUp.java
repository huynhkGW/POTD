import java.util.Arrays;

/*
 * CodingBat Java Activity "tripleUp" from Array-2 section.
 * codingbat.com
 */

public class TripleUp 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "tripleUp";
	
	/*
	 * INSTRUCTIONS
	 * Return true if the array contains, somewhere, three increasing adjacent 
	 * numbers like .... 4, 5, 6, ... or 23, 24, 25.
	 * 
	 * tripleUp([1, 4, 5, 6, 2]) -> true
	 * tripleUp([1, 2, 3]) -> true
	 * tripleUp([1, 2, 4]) -> false
	 */
	public static boolean tripleUp(int[] nums)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {1, 4, 5, 6, 2}, true);
		testCase(new int[] {1, 2, 3}, true);
		testCase(new int[] {1, 2, 4}, false);
		testCase(new int[] {1, 2, 4, 5, 7, 6, 5, 6, 7, 6}, true);
		testCase(new int[] {1, 2, 4, 5, 7, 6, 5, 7, 7, 6}, false);
		testCase(new int[] {1, 2}, false);
		testCase(new int[] {1}, false);
		testCase(new int[] {}, false);
		testCase(new int[] {10, 9, 8, -100, -99, -98, 100}, true);
		testCase(new int[] {10, 9, 8, -100, -99, 99, 100}, false);
		testCase(new int[] {-100, -99, -99, 100, 101, 102}, true);
		testCase(new int[] {2, 3, 5, 6, 8, 9, 2, 3}, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, Boolean result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+tripleUp(testValues);
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


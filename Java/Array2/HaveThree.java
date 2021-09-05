import java.util.Arrays;

/*
 * CodingBat Java Activity "haveThree" from Array-2 section.
 * codingbat.com
 */

public class HaveThree 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "haveThree";
	
	/*
	 * INSTRUCTIONS
	 * Given an array of ints, return true if the value 3 appears in the array 
	 * exactly 3 times, and no 3's are next to each other.
	 * 
	 * haveThree([3, 1, 3, 1, 3]) -> true
	 * haveThree([3, 1, 3, 3]) -> false
	 * haveThree([3, 4, 3, 3, 4]) -> false
	 */
	public static boolean haveThree(int[] nums)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {3, 1, 3, 1, 3}, true);
		testCase(new int[] {3, 1, 3, 3}, false);
		testCase(new int[] {3, 4, 3, 3, 4}, false);
		testCase(new int[] {1, 3, 1, 3, 1, 2}, false);
		testCase(new int[] {1, 3, 1, 3, 1, 3}, true);
		testCase(new int[] {1, 3, 3, 1, 3}, false);
		testCase(new int[] {1, 3, 1, 3, 1, 3, 4, 3}, false);
		testCase(new int[] {3, 4, 3, 4, 3, 4, 4}, true);
		testCase(new int[] {3, 3, 3}, false);
		testCase(new int[] {3}, false);
		testCase(new int[] {1}, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, Boolean result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+haveThree(testValues);
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


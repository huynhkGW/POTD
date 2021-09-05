import java.util.Arrays;

/*
 * CodingBat Java Activity "scores100" from AP-1 section.
 * codingbat.com
 */

public class Scores100 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "scores100";
	
	/*
	 * INSTRUCTIONS
	 * Given an array of scores, return true if there are scores of 100 next to each other in the array.  
	 * The array will be length 2 or more.
	 * 
	 * scores100([1, 100, 100]) -> true
	 * scores100([1, 100, 99, 100]) -> false
	 * scores100([100, 1, 100, 100]) -> true
	 */
	public static boolean scores100(int[] scores)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {1, 100, 100}, true);
		testCase(new int[] {1, 100, 99, 100}, false);
		testCase(new int[] {100, 1, 100, 100}, true);
		testCase(new int[] {100, 1, 100, 1}, false);
		testCase(new int[] {1, 2, 3, 4, 5}, false);
		testCase(new int[] {1, 2, 100, 4, 5}, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, boolean result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+scores100(testValues);
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


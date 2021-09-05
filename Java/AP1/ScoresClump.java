import java.util.Arrays;

/*
 * CodingBat Java Activity "scoresClump" from AP-1 section.
 * codingbat.com
 */

public class ScoresClump 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "scoresClump";
	
	/*
	 * INSTRUCTIONS
	 * Given an array of scores sorted in increasing order, return true if the array contains 
	 * 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or 
	 * {3, 5, 5}.
	 * 
	 * scoresClump([3, 4, 5]) -> true
	 * scoresClump([3, 4, 6]) -> false
	 * scoresClump([1, 3, 5, 5]) -> true
	 */
	public static boolean scoresClump(int[] scores)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {3, 4, 5}, true);
		testCase(new int[] {3, 4, 6}, false);
		testCase(new int[] {1, 3, 5, 5}, true);
		testCase(new int[] {2, 4, 5, 6}, true);
		testCase(new int[] {2, 4, 5, 7}, false);
		testCase(new int[] {2, 4, 4, 7}, true);
		testCase(new int[] {3, 3, 6, 7, 9}, false);
		testCase(new int[] {3, 3, 7, 7, 9}, true);
		testCase(new int[] {4, 5, 8}, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, boolean result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+scoresClump(testValues);
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

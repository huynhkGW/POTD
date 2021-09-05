import java.util.Arrays;

/*
 * CodingBat Java Activity "scoresIncreasing" from AP-1 section.
 * codingbat.com
 */

public class ScoresIncreasing 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "scoresIncreasing";
	
	/*
	 * INSTRUCTIONS
	 * Given an array of scores, return true if each score is equal or greater than the one before.  
	 * The array will be length 2 or more.
	 * 
	 * scoresIncreasing([1, 3, 4]) -> true
	 * scoresIncreasing([1, 3, 2]) -> false
	 * scoresIncreasing([1, 1, 4]) -> true
	 */
	public static boolean scoresIncreasing(int[] scores)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {1, 3, 4}, true);
		testCase(new int[] {1, 3, 2}, false);
		testCase(new int[] {1, 1, 4}, true);
		testCase(new int[] {1, 1, 2, 4, 4, 7}, true);
		testCase(new int[] {1, 1, 2, 4, 3, 7}, false);
		testCase(new int[] {-5, 4, 11}, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, boolean result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+scoresIncreasing(testValues);
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

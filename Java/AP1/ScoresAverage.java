import java.util.Arrays;

/*
 * CodingBat Java Activity "scoresAverage" from AP-1 section.
 * codingbat.com
 */

public class ScoresAverage 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "scoresAverage";
	
	/*
	 * INSTRUCTIONS
	 * Given an array of scores, compute the int average of the first half and the second half, 
	 * and return whichever is larger. We'll say that the second half begins at index length/2. 
	 * The array length will be at least 2. To practice decomposition, write a separate helper method
	 * int average(int[] scores, int start, int end) { which computes the average of the elements 
	 * between indexes start..end. Call your helper method twice to implement scoresAverage(). 
	 * Write your helper method after your scoresAverage() method in the JavaBat text area. Normally 
	 * you would compute averages with doubles, but here we use ints so the expected results are exact.
	 * 
	 * scoresAverage([2, 2, 4, 4]) -> 4
	 * scoresAverage([4, 4, 4, 2, 2, 2]) -> 4
	 * scoresAverage([3, 4, 5, 1, 2, 3]) -> 4
	 */
	public static int scoresAverage(int[] scores)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {2, 2, 4, 4}, 4);
		testCase(new int[] {4, 4, 4, 2, 2, 2}, 4);
		testCase(new int[] {3, 4, 5, 1, 2, 3}, 4);
		testCase(new int[] {5, 6}, 6);
		testCase(new int[] {5, 4}, 5);
		testCase(new int[] {5, 4, 5, 6, 2, 1, 2, 3}, 5);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, int result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+scoresAverage(testValues);
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

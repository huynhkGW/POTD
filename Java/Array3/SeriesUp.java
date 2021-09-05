import java.util.Arrays;

/*
 * CodingBat Java Activity "seriesUp" from Array-3 section.
 * codingbat.com
 */

public class SeriesUp 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "seriesUp";
	/*
	 * INSTRUCTIONS
	 *Given n>=0, create an array with the pattern 
	 *{1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). 
	 *Note that the length of the array will be 1 + 2 + 3 ... + n, which is known 
	 *to sum to exactly n*(n + 1)/2.
	 *
	 *seriesUp(3) -> [1, 1, 2, 1, 2, 3]
	 *seriesUp(4) -> [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
	 *seriesUp(2) -> [1, 1, 2]
	 */
	public static int[] seriesUp(int n)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args) 
	{
		testCase(3, new int[] {1, 1, 2, 1, 2, 3});
		testCase(4, new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4});
		testCase(2, new int[] {1, 1, 2});
		testCase(1, new int[] {1});
		testCase(0, new int[] {});
		testCase(6, new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6});
	}
	
	public static void testCase(int testValue, int[] expected)
	{
		String r;
		String a = Arrays.toString(expected);
		try
		{
			r = Arrays.toString(seriesUp(testValue));
			if (r.equals("" + a))
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
		System.out.println(METHOD_NAME+"(" + testValue + ") -> "+r + ", EXPECTED: "+ a);
	}
}
import java.util.Arrays;

/*
 * CodingBat Java Activity "squareUp" from Array-3 section.
 * codingbat.com
 */

public class SquareUp 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "squareUp";
	/*
	 * INSTRUCTIONS
	 *Given n>=0, create an array length n*n with the following pattern, shown 
	 *here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
	 *
	 *squareUp(3) -> [0, 0, 1, 0, 2, 1, 3, 2, 1]
	 *squareUp(2) -> [0, 1, 2, 1]
	 *squareUp(4) -> [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
	 */
	public static int[] squareUp(int n)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args) 
	{
		testCase(3, new int[] {0, 0, 1, 0, 2, 1, 3, 2, 1});
		testCase(2, new int[] {0, 1, 2, 1});
		testCase(4, new int[] {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1});
		testCase(1, new int[] {1});
		testCase(0, new int[] {});
		testCase(6, new int[] {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0, 4, 3, 2, 1, 0, 5, 4, 3, 2, 1, 6, 5, 4, 3, 2, 1});

	}
	
	public static void testCase(int testValue, int[] expected)
	{
		String r;
		String a = Arrays.toString(expected);
		try
		{
			r = Arrays.toString(squareUp(testValue));
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
import java.util.Arrays;

/*
 * CodingBat Java Activity "countEvens" from Array-2 section.
 * codingbat.com
 */

public class CountEvens 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "countEvens";
	
	/*
	 * INSTRUCTIONS
	 * Return the number of even ints in the given array. Note: the % "mod" operator computes the
	 * remainder, e.g. 5 % 2 is 1.
	 * 
	 * countEvens([2, 1, 2, 3, 4]) -> 3
	 * countEvens([2, 2, 0]) -> 3
	 * countEvens([1, 3, 5]) -> 0
	 */
	public static int countEvens(int[] nums)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {2, 1, 2, 3, 4}, 3);
		testCase(new int[] {2, 2, 0}, 3);
		testCase(new int[] {1, 3, 5}, 0);
		testCase(new int[] {}, 0);
		testCase(new int[] {11, 9, 0, 1}, 1);
		testCase(new int[] {2, 11, 9, 0}, 2);
		testCase(new int[] {2}, 1);
		testCase(new int[] {2, 5, 12}, 2);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, int result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+countEvens(testValues);
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


import java.util.Arrays;

/*
 * CodingBat Java Activity "zeroMax" from Array-2 section.
 * codingbat.com
 */

public class ZeroMax 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "zeroMax";
	
	/*
	 * INSTRUCTIONS
	 * Return a version of the given array where each zero value in the array 
	 * is replaced by the largest odd value to the right of the zero in the 
	 * array. If there is no odd value to the right of the zero, leave the 
	 * zero as a zero.
	 * 
	 * zeroMax([0, 5, 0, 3]) -> [5, 5, 3, 3]
	 * zeroMax([0, 4, 0, 3]) -> [3, 4, 3, 3]
	 * zeroMax([0, 1, 0]) -> [1, 1, 0]
	 */
	public static int[] zeroMax(int[] nums)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {0, 5, 0, 3}, new int[] {5, 5, 3, 3});
		testCase(new int[] {0, 4, 0, 3}, new int[] {3, 4, 3, 3});
		testCase(new int[] {0, 1, 0}, new int[] {1, 1, 0});
		testCase(new int[] {0, 1, 5}, new int[] {5, 1, 5});
		testCase(new int[] {0, 2, 0}, new int[] {0, 2, 0});
		testCase(new int[] {1}, new int[] {1});
		testCase(new int[] {0}, new int[] {0});
		testCase(new int[] {}, new int[] {});
		testCase(new int[] {7, 0, 4, 3, 0, 2}, new int[] {7, 3, 4, 3, 0, 2});
		testCase(new int[] {7, 0, 4, 3, 0, 1}, new int[] {7, 3, 4, 3, 1, 1});
		testCase(new int[] {7, 0, 4, 3, 0, 0}, new int[] {7, 3, 4, 3, 0, 0});
		testCase(new int[] {7, 0, 1, 0, 0, 7}, new int[] {7, 7, 1, 7, 7, 7});
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, int[] result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+Arrays.toString(zeroMax(testValues));
			if (r.equals(""+Arrays.toString(result)))
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
		System.out.println(METHOD_NAME+"("+i+") -> "+r + ", EXPECTED: "+Arrays.toString(result));
	}

}


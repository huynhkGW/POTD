import java.util.Arrays;

/*
 * CodingBat Java Activity "fix45" from Array-3 section.
 * codingbat.com
 */

public class Fix45 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "fix45";
	
	/*
	 * INSTRUCTIONS
	 * (This is a slightly harder version of the fix34 problem.) 
	 * Return an array that contains exactly the same numbers as the given array, but rearranged 
	 * so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. 
	 * The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. 
	 * In this version, 5's may appear anywhere in the original array.
	 * 
	 * fix45([5, 4, 9, 4, 9, 5]) -> [9, 4, 5, 4, 5, 9]
	 * fix45([1, 4, 1, 5]) -> [1, 4, 5, 1]
	 * fix45([1, 4, 1, 5, 5, 4, 1]) -> [1, 4, 5, 1, 1, 4, 5]
	 */
	public static int[] fix45(int[] nums)
	{
		//put your code ONLY here!
	}
	
	public static void testCase(int[] testValues, int[] expected)
	{
		String r;
		String i = Arrays.toString(testValues);
		String e = Arrays.toString(expected);
		try
		{
			int [] result = fix45(testValues);
			r = Arrays.toString(result);
			if (r.equals(e))
			{
				System.out.print("PASS: ");
			}
			else
			{
				System.out.println("FAIL: ");
				failures ++;
			}
		}
		catch (Exception ex)
		{
			System.out.print("FAIL: ");
			r = ex.getMessage();
			failures ++;
		}
		System.out.println(METHOD_NAME+"("+i+") -> " + r + ", Expected: " + e);
	}
	
	public static void main(String[] args) 
	{
		testCase(new int[] {5, 4, 9, 4, 9, 5}, new int[] {9, 4, 5, 4, 5, 9});
		testCase(new int[] {1, 4, 1, 5}, new int[] {1, 4, 5, 1});
		testCase(new int[] {1, 4, 1, 5, 5, 4, 1}, new int[] {1, 4, 5, 1, 1, 4, 5});
		testCase(new int[] {4, 9, 4, 9, 5, 5, 4, 9, 5}, new int[] {4, 5, 4, 5, 9, 9, 4, 5, 9});
		testCase(new int[] {5, 5, 4, 1, 4, 1}, new int[] {1, 1, 4, 5, 4, 5});
		testCase(new int[] {4, 2, 2, 5}, new int[] {4, 5, 2, 2});
		testCase(new int[] {4, 2, 4, 2, 5, 5}, new int[] {4, 5, 4, 5, 2, 2});
		testCase(new int[] {4, 2, 4, 5, 5}, new int[] {4, 5, 4, 5, 2});
		testCase(new int[] {1, 1, 1}, new int[] {1, 1, 1});
		testCase(new int[] {4, 5}, new int[] {4, 5});
		testCase(new int[] {5, 4, 1}, new int[] {1, 4, 5});
		testCase(new int[] {}, new int[] {});
		testCase(new int[] {5, 4, 5, 4, 1}, new int[] {1, 4, 5, 4, 5});
		testCase(new int[] {4, 5, 4, 1, 5}, new int[] {4, 5, 4, 5, 1});
		testCase(new int[] {3, 4, 5}, new int[] {3, 4, 5});
		testCase(new int[] {4, 1, 5}, new int[] {4, 5, 1});
		testCase(new int[] {5, 4, 1}, new int[] {1, 4, 5});
		testCase(new int[] {2, 4, 2, 5}, new int[] {2, 4, 5, 2});
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}
}

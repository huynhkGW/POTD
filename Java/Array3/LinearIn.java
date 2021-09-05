import java.util.Arrays;

/*
 * CodingBat Java Activity "linearIn" from Array-3 section.
 * codingbat.com
 */

public class LinearIn 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "linearIn";
	/*
	 * INSTRUCTIONS
	 * Given two arrays of ints sorted in increasing order, outer and inner, return true if all 
	 * of the numbers in inner appear in outer. The best solution makes only a single "linear" 
	 * pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
	 * 
	 * linearIn([1, 2, 4, 6], [2, 4]) -> true
	 * linearIn([1, 2, 4, 6], [2, 3, 4]) > false
	 * linearIn([1, 2, 4, 4, 6], [2, 4]) > true
	 */
	public static boolean linearIn(int[] outer, int[] inner)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args) 
	{
		testCase(new int[] {1, 2, 4, 6}, new int[] {2, 4}, true);
		testCase(new int[] {1, 2, 4, 6}, new int[] {2, 3, 4}, false);
		testCase(new int[] {1, 2, 4, 4, 6}, new int[] {2, 4}, true);
		testCase(new int[] {2, 2, 4, 4, 6, 6}, new int[] {2, 4}, true);
		testCase(new int[] {2, 2, 2, 2, 2}, new int[] {2, 2}, true);
		testCase(new int[] {2, 2, 2, 2, 2}, new int[] {2, 4}, false);
		testCase(new int[] {2, 2, 2, 2, 4}, new int[] {2, 4}, true);
		testCase(new int[] {1, 2, 3}, new int[] {2}, true);
		testCase(new int[] {1, 2, 3}, new int[] {-1}, false);
		testCase(new int[] {1, 2, 3}, new int[] {}, true);
		testCase(new int[] {-1, 0, 3, 3, 3, 10, 12}, new int[] {-1, 0, 3, 12}, true);
		testCase(new int[] {-1, 0, 3, 3, 3, 10, 12}, new int[] {0, 3, 12, 14}, false);
		testCase(new int[] {-1, 0, 3, 3, 3, 10, 12}, new int[] {-1, 10, 11}, false);
	}
	
	public static void testCase(int[] testValues1, int[] testValues2, boolean expected)
	{
		String r;
		String a = Arrays.toString(testValues1);
		String b = Arrays.toString(testValues2);
		try
		{
			r = ""+linearIn(testValues1, testValues2);
			if (r.equals("" +expected))
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
		System.out.println(METHOD_NAME+"(" + a + ", " + b + ") -> "+r + ", EXPECTED: "+ expected);
	}
}
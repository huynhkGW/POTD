import java.util.Arrays;

/*
 * CodingBat Java Activity "matchUP" from AP-1 section.
 * codingbat.com
 */

public class MatchUp 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "matchUp";
	
	/*
	 * INSTRUCTIONS
	 * Given 2 arrays that are the same length containing strings, compare 
	 * the 1st string in one array to the 1st string in the other array, 
	 * the 2nd to the 2nd and so on. Count the number of times that the 2 
	 * strings are non-empty and start with the same char. The strings may 
	 * be any length, including 0.
	 * 
	 * matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) -> 1
	 * matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) -> 2
	 * matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) -> 1
	 */
	public static int matchUp(String[] a, String[] b)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new String[] {"aa", "bb", "cc"}, new String[] {"aaa", "xx", "bb"}, 1);
		testCase(new String[] {"aa", "bb", "cc"}, new String[] {"aaa", "b", "bb"}, 2);
		testCase(new String[] {"aa", "bb", "cc"}, new String[] {"", "", "ccc"}, 1);
		testCase(new String[] {"", "", "ccc"}, new String[] {"aa", "bb", "cc"}, 1);
		testCase(new String[] {"", "", ""}, new String[] {"", "bb", "cc"}, 0);
		testCase(new String[] {"aa", "bb", "cc"}, new String[] {"", "", ""}, 0);
		testCase(new String[] {"aa", "", "ccc"}, new String[] {"", "bb", "cc"}, 1);
		testCase(new String[] {"x", "y", "z"}, new String[] {"y", "z", "x"}, 0);
		testCase(new String[] {"", "y", "z"}, new String[] {"", "y", "x"}, 1);
		testCase(new String[] {"x", "y", "z"}, new String[] {"xx", "yyy", "zzz"}, 3);
		testCase(new String[] {"x", "y", "z"}, new String[] {"xx", "yyy", ""}, 2);
		testCase(new String[] {"b", "x", "y", "z"}, new String[] {"a", "xx", "yyy", "zzz"}, 3);
		testCase(new String[] {"aaa", "bb", "c"}, new String[] {"aaa", "xx", "bb"}, 1);

		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(String[] testValuesA, String[] testValuesB, int result)
	{
		String r;
		String iA = Arrays.toString(testValuesA);
		String iB = Arrays.toString(testValuesB);
		try
		{
			r = "" + matchUp(testValuesA, testValuesB);
			if (r.equals("" + result))
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
		System.out.println(METHOD_NAME + "("+ iA + ", " + iB + ") -> "+ r + ", EXPECTED: "+ result);
	}

}


import java.util.ArrayList;
import java.util.Arrays;

/*
 * CodingBat Java Activity "wordsWithoutList" from AP-1 section.
 * codingbat.com
 */

public class WordsWithoutList 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "wordsWithoutList";
	
	/*
	 * INSTRUCTIONS
	 * Given an array of strings, return a new List (e.g. an ArrayList) where all the strings 
	 * of the given length are omitted. See wordsWithout() below which is more difficult 
	 * because it uses arrays.
	 * 
	 * wordsWithoutList(["a", "bb", "b", "ccc"], 1) -> ["bb", "ccc"]
	 * wordsWithoutList(["a", "bb", "b", "ccc"], 3) -> ["a", "bb", "b"]
	 * wordsWithoutList(["a", "bb", "b", "ccc"], 4) -> ["a", "bb", "b", "ccc"]
	 */
	public static ArrayList<String> wordsWithoutList(String[] words, int len)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new String[] {"\"a\"", "\"bb\"", "\"b\"", "\"ccc\""}, 1, new String[]{"\"bb\"", "\"ccc\""});
		testCase(new String[] {"\"a\"", "\"bb\"", "\"b\"", "\"ccc\""}, 3, new String[]{"\"a\"", "\"bb\"", "\"b\""});
		testCase(new String[] {"\"a\"", "\"bb\"", "\"b\"", "\"ccc\""}, 4, new String[]{"\"a\"", "\"bb\"", "\"b\"", "\"ccc\""});
		testCase(new String[] {"\"xx\"", "\"yyy\"", "\"x\"", "\"yy\"", "\"z\""}, 1, new String[]{"\"xx\"", "\"yyy\"", "\"yy\""});
		testCase(new String[] {"\"xx\"", "\"yyy\"", "\"x\"", "\"yy\"", "\"z\""}, 2, new String[]{"\"yyy\"", "\"x\"", "\"z\""});
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(String[] testValues, int len, String[] result)
	{
		String r;
		ArrayList<String> middle;
		String i = Arrays.toString(testValues);
		try
		{
			middle = wordsWithoutList(testValues, len+2);
			r = Arrays.toString(middle.toArray());
			if (r.equals(Arrays.toString(result)))
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

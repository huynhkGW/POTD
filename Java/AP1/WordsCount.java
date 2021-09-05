import java.util.Arrays;

/*
 * CodingBat Java Activity "wordsCount" from AP-1 section.
 * codingbat.com
 */

public class WordsCount 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "wordsCount";
	
	/*
	 * INSTRUCTIONS
	 * Given an array of strings, return the count of the number of strings with the given length.
	 * 
	 * wordsCount(["a", "bb", "b", "ccc"], 1) -> 2
	 * wordsCount(["a", "bb", "b", "ccc"], 3) -> 1
	 * wordsCount(["a", "bb", "b", "ccc"], 4) -> 0
	 */
	public static int wordsCount(String[] words, int len)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new String[] {"\"a\"", "\"bb\"", "\"b\"", "\"ccc\""}, 1, 2);
		testCase(new String[] {"\"a\"", "\"bb\"", "\"b\"", "\"ccc\""}, 3, 1);
		testCase(new String[] {"\"a\"", "\"bb\"", "\"b\"", "\"ccc\""}, 4, 0);
		testCase(new String[] {"\"xx\"", "\"yyy\"", "\"x\"", "\"yy\"", "\"z\""}, 1, 2);
		testCase(new String[] {"\"xx\"", "\"yyy\"", "\"x\"", "\"yy\"", "\"z\""}, 2, 2);
		testCase(new String[] {"\"xx\"", "\"yyy\"", "\"x\"", "\"yy\"", "\"z\""}, 3, 1);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(String[] testValues, int len, int result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+ wordsCount(testValues, len+2);
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

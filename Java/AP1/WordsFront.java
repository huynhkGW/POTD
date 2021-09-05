import java.util.Arrays;

/*
 * CodingBat Java Activity "wordsFront" from AP-1 section.
 * codingbat.com
 */

public class WordsFront 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "wordsFront";
	
	/*
	 * INSTRUCTIONS
	 * Given an array of strings, return a new array containing the first N strings. 
	 * N will be in the range 1..length.
	 * 
	 * wordsFront(["a", "b", "c", "d"], 1) -> ["a"]
	 * wordsFront(["a", "b", "c", "d"], 2) -> ["a", "b"]
	 * wordsFront(["a", "b", "c", "d"], 3) -> ["a", "b", "c"]
	 */
	public static String[] wordsFront(String[] words, int n)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(new String[] {"\"a\"", "\"b\"", "\"c\"", "\"d\""}, 1, new String[]{"\"a\""});
		testCase(new String[] {"\"a\"", "\"b\"", "\"c\"", "\"d\""}, 2, new String[]{"\"a\"", "\"b\""});
		testCase(new String[] {"\"a\"", "\"b\"", "\"c\"", "\"d\""}, 3, new String[]{"\"a\"", "\"b\"", "\"c\""});
		testCase(new String[] {"\"a\"", "\"b\"", "\"c\"", "\"d\""}, 4, new String[]{"\"a\"", "\"b\"", "\"c\"", "\"d\""});
		testCase(new String[] {"\"Hi\"", "\"There\""}, 1, new String[]{"\"Hi\""});
		testCase(new String[] {"\"Hi\"", "\"There\""}, 2, new String[]{"\"Hi\"", "\"There\""});
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(String[] testValues, int len, String[] result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = Arrays.toString(wordsFront(testValues, len));
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

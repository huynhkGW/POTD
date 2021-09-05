/*
 * CodingBat Java Activity "countHi" from Recursion-1 section.
 * codingbat.com
 */

public class CountHi 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "countHi";
	
	/*
	 * INSTRUCTIONS
	 * Given a string, compute recursively (no loops) the number of times 
	 * lowercase "hi" appears in the string.
	 * 
	 * countHi("xxhixx") -> 1
	 * countHi("xhixhix") -> 2
	 * countHi("hi") -> 1
	 */
	public static int countHi(String str)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase("\"xxhixx\"", 1);
		testCase("\"xhixhix\"", 2);
		testCase("\"hi\"", 1);
		testCase("\"hihih\"", 2);
		testCase("\"h\"", 0);
		testCase("\"\"", 0);
		testCase("\"ihihihihih\"", 4);
		testCase("\"ihihihihihi\"", 5);
		testCase("\"hiAAhi12hi\"", 3);
		testCase("\"xhixhxihihhhih\"", 3);
		testCase("\"ship\"", 1);

		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(String a, int expected)
	{
		String r;
		try
		{
			r = ""+ countHi(a);
			if (r.equals(""+ expected))
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
		System.out.println(METHOD_NAME+"("+a+") -> "+r + ", EXPECTED: "+ expected);
	}

}

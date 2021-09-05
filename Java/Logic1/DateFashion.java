/**
 * CodingBat Java Activity "dateFashion" from Logic1.
 * codingbat.com
 */
public class DateFashion
{
	private static int failures = 0;
	private static final String METHOD_NAME = "dateFashion";

	/**
	 * INSTRUCTIONS:
	 * You and your date are trying to get a table at a restaurant. The 
	 * parameter "you" is the stylishness of your clothes, in the range 0..10, 
	 * and "date" is the stylishness of your date's clothes. The result getting
	 * the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If
	 * either of you is very stylish, 8 or more, then the result is 2 (yes).
	 * With the exception that if either of you has style of 2 or less, then
	 * the result is 0 (no). Otherwise the result is 1 (maybe).
	 * 
	 * dateFashion(5, 10) -> 2
	 * dateFashion(5, 2) -> 0
	 * dateFashion(5, 5) -> 1
	 * 
	 */
	public static int dateFashion(int you, int date)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(5, 10, 2);
		testCase(5, 2, 0);
		testCase(5, 5, 1);
		testCase(3, 3, 1);
		testCase(10, 2, 0);
		testCase(2, 9, 0);
		testCase(9, 9, 2);
		testCase(10, 5, 2);
		testCase(2, 2, 0);
		testCase(3, 7, 1);
		testCase(2, 7, 0);
		testCase(6, 2, 0);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, int result)
	{
		String r;
		try
		{
			r = ""+dateFashion(a, b);
			if (r.equals(""+result))
			{
				System.out.print("PASS: ");
			}
			else
			{
				System.out.print("FAIL: ");
				failures ++;
			}
		}
		catch (Exception e)
		{
			r = e.getMessage();
			System.out.print("FAIL: ");
			failures ++;
		}
		System.out.println(METHOD_NAME+"("+a+", "+b+") -> "+r + ", EXPECTED: "+result);
	}

}

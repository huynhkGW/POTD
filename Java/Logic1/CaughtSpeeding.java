/**
 * CodingBat Java Activity "caughtSpeeding" from Logic1.
 * codingbat.com
 */
public class CaughtSpeeding
{
	private static int failures = 0;
	private static final String METHOD_NAME = "caughtSpeeding";
	/**
	 * INSTRUCTIONS:
	 * You are driving a little too fast, and a police officer stops you. Write
	 *  code to compute the result, encoded as an int value: 0=no ticket, 
	 *  1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. 
	 *  If speed is between 61 and 80 inclusive, the result is 1. If speed is 
	 *  81 or more, the result is 2. Unless it is your birthday -- on that day,
	 *  your speed can be 5 higher in all cases.
	 * 
	 * caughtSpeeding(60, false) -> 0
	 * caughtSpeeding(65, false) -> 1
	 * caughtSpeeding(65, true) -> 0
	 * 
	 */
	public static int caughtSpeeding(int speed, boolean isBirthday)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(60, false, 0);
		testCase(65, false, 1);
		testCase(65, true, 0);
		testCase(80, false, 1);
		testCase(85, false, 2);
		testCase(85, true, 1);
		testCase(70, false, 1);
		testCase(75, false, 1);
		testCase(75, true, 1);
		testCase(40, false, 0);
		testCase(40, true, 0);
		testCase(90, false, 2);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, boolean b, int result)
	{
		String r;
		try
		{
			r = ""+caughtSpeeding(a, b);
			if (r.equals(""+result))
			{
				System.out.print("PASS: ");
			}
			else
			{
				System.out.println("FAIL: ");
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

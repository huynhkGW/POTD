/*
 * CodingBat Java Activity "hasOne" from AP-1 section.
 * codingbat.com
 */

public class HasOne 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "hasOne";
	
	/*
	 * INSTRUCTIONS
	 * Given a positive int n, return true if it contains a 1 digit. 
	 * Note: use % to get the rightmost digit, and / to discard the rightmost digit.
	 * 
	 * hasOne(10) -> true
	 * hasOne(22) -> false
	 * hasOne(220) -> false
	 */
	public static boolean hasOne(int n)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(10, true);
		testCase(22, false);
		testCase(220, false);
		testCase(212, true);
		testCase(1, true);
		testCase(9, false);
		testCase(211112, true);
		testCase(121121, true);
		testCase(222222, false);
		testCase(56156, true);
		testCase(56556, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, boolean result)
	{
		String r;
		try
		{
			r = ""+ hasOne(a);
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
		System.out.println(METHOD_NAME+"("+a+") -> "+r + ", EXPECTED: "+result);
	}

}

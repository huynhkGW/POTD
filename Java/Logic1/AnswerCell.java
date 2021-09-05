/*
 * CodingBat Java Activity "answerCell" from Logic-1 section.
 * codingbat.com
 */

public class AnswerCell 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "answerCell";
	
	/*
	 * INSTRUCTIONS
	 * Your cell phone rings. Return true if you should answer it. Normally you
	 * answer, except in the morning you only answer if it is your mom calling.
	 * In all cases, if you are asleep, you do not answer.
	 * 
	 * answerCell(false, false, false) -> true
	 * answerCell(false, false, true) -> false
	 * answerCell(true, false, false) -> false
	 */
	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(false, false, false, true);
		testCase(false, false, true, false);
		testCase(true, false, false, false);
		testCase(true, true, false, true);
		testCase(false, true, false, true);
		testCase(true, true, true, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(boolean a, boolean b, boolean c, boolean result)
	{
		String r;
		try
		{
			r = ""+ answerCell(a, b, c);
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
		System.out.println(METHOD_NAME+"("+a+", "+b+", "+c+") -> "+r + ", EXPECTED: "+result);
	}

}

/**
 * CodingBat Java Activity "alarmClock" from Logic1.
 * codingbat.com
 */
public class AlarmClock
{
	private static int failures = 0;
	private static final String METHOD_NAME = "alarmClock";

	/**
	 * INSTRUCTIONS:
	 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a 
	 * boolean indicating if we are on vacation, return a string of the form 
	 * "7:00" indicating when the alarm clock should ring. Weekdays, the alarm 
	 * should be "7:00" and on the weekend it should be "10:00". Unless we are 
	 * on vacation -- then on weekdays it should be "10:00" and weekends it 
	 * should be "off".
	 * 
	 * alarmClock(1, false) -> "7:00"
	 * alarmClock(5, false) -> "7:00"
	 * alarmClock(0, false) -> "10:00"
	 * 
	 */
	public static String alarmClock(int day, boolean vacation)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(1, false, "7:00");
		testCase(5, false, "7:00");
		testCase(0, false, "10:00");
		testCase(6, false, "10:00");
		testCase(0, true, "off");
		testCase(6, true, "off");
		testCase(1, true, "10:00");
		testCase(3, true, "10:00");
		testCase(5, true, "10:00");
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, boolean b, String result)
	{
		String r;
		try
		{
			r = ""+alarmClock(a, b);
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
		System.out.println(METHOD_NAME+"("+a+", \""+b+"\") -> \""+r + "\", EXPECTED: \""+result+"\"");
	}

}

/*
 * CodingBat Java Activity "makeBricks" from Logic-2 section.
 * codingbat.com
 */

public class MakeBricks 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "makeBricks";
	
	/*
	 * INSTRUCTIONS
	 * We want to make a row of bricks that is goal inches long. We have a number of small bricks 
	 * (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal 
	 * by choosing from the given bricks. This is a little harder than it looks and can be done 
	 * without any loops.
	 * 
	 * makeBricks(3, 1, 8) -> true
	 * makeBricks(3, 1, 9) -> false
	 * makeBricks(3, 2, 10) -> true
	 */
	public static boolean makeBricks(int small, int big, int goal)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase(3, 1, 8, true);
		testCase(3, 1, 9, false);
		testCase(3, 2, 10, true);
		testCase(3, 2, 8, true);
		testCase(3, 2, 9, false);
		testCase(6, 1, 11, true);
		testCase(6, 0, 11, false);
		testCase(1, 4, 11, true);
		testCase(0, 3, 10, true);
		testCase(1, 4, 12, false);
		testCase(3, 1, 7, true);
		testCase(1, 1, 7, false);
		testCase(2, 1, 7, true);
		testCase(7, 1, 11, true);
		testCase(7, 1, 8, true);
		testCase(7, 1, 13, false);
		testCase(43, 1, 46, true);
		testCase(40, 1, 46, false);
		testCase(40, 2, 47, true);
		testCase(40, 2, 50, true);
		testCase(40, 2, 52, false);
		testCase(22, 2, 33, false);
		testCase(0, 2, 10, true);
		testCase(1000000, 1000, 1000100, true);
		testCase(2, 1000000, 100003, false);
		testCase(20, 0, 19, true);
		testCase(20, 0, 21, false);
		testCase(20, 4, 51, false);
		testCase(20, 4, 39, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, int c, boolean result)
	{
		String r;
		try
		{
			r = ""+ makeBricks(a, b, c);
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

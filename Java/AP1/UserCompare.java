import java.util.Arrays;

/*
 * CodingBat Java Activity "userCompare" from AP-1 section.
 * codingbat.com
 */

public class UserCompare 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "userCompare";
	
	/*
	 * INSTRUCTIONS
	 * We have data for two users, A and B, each with a String name and an int id. The goal 
	 * is to order the users such as for sorting. Return -1 if A comes before B, 1 if A comes 
	 * after B, and 0 if they are the same. Order first by the string names, and then by the 
	 * id numbers if the names are the same. Note: with Strings str1.compareTo(str2) returns 
	 * an int value which is negative/0/positive to indicate how str1 is ordered to str2 (the 
	 * value is not limited to -1/0/1). (On the AP, there would be two User objects, but here 
	 * the code simply takes the two strings and two ints directly. The code logic is the same.)
	 * 
	 * userCompare("bb", 1, "zz", 2) -> -1
	 * userCompare("bb", 1, "aa", 2) -> 1
	 * userCompare("bb", 1, "bb", 1) -> 0
	 */
	
	public static int wordsCount(String aName, int aId, String bName, int bId)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase("\"bb\"", 1, "\"zz\"", 2, -1);
		testCase("\"bb\"", 1, "\"aa\"", 2, 1);
		testCase("\"bb\"", 1, "\"bb\"", 1, 0);
		testCase("\"bb\"", 5, "\"bb\"", 1, 1);
		testCase("\"bb\"", 5, "\"bb\"", 10, -1);
		testCase("\"adam\"", 1, "\"bob\"", 2, -1);
		testCase("\"bob\"", 1, "\"bob\"", 2, -1);
		testCase("\"bzb\"", 1, "\"bob\"", 2, 1);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(String aName, int aId, String bName, int bId, int result)
	{
		String r;
		//String i = Arrays.toString(testValues);
		try
		{
			r = ""+ wordsCount(aName, aId, bName, bId);
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
		System.out.println(METHOD_NAME+"("+ aName + ", " + aId + ", " + bName + ", " + bId +") -> "+r + ", EXPECTED: "+result);
	}

}

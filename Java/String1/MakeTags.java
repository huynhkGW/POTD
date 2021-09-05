/*
 * CodingBat Java Activity "makeTags" from String-1 section.
 * codingbat.com
 */

public class MakeTags 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "makeTags";
	
	/*
	 * INSTRUCTIONS
	 * 
	 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as
	 * italic text. In this example, the "i" tag makes <i> and </i> which 
	 * surround the word "Yay". Given tag and word strings, create the HTML 
	 * string with tags around the word, e.g. "<i>Yay</i>".
	 * 
	 * makeTags("i", "Yay") -> "<i>Yay</i>"
	 * makeTags("i", "Hello") -> "<i>Hello</i>"
	 * makeTags("cite", "Yay") -> "<cite>Yay</cite>"
	 */
	public static String makeTags(String tag, String word)
	{
		//put your code ONLY here!
	}
	
	public static void main(String[] args)
	{
		testCase("\"i\"", "\"Yay\"", "\"<i>Yay</i>\"");
		testCase("\"i\"", "\"Hello\"", "\"<i>Hello</i>\"");
		testCase("\"cite\"", "\"Yay\"", "\"<cite>Yay</cite>\"");
		testCase("\"address\"", "\"here\"", "\"<address>here</address>\"");
		testCase("\"body\"", "\"Heart\"", "\"<body>Heart</body>\"");
		testCase("\"i\"", "\"i\"", "\"<i>i</i>\"");
		testCase("\"i\"", "\"\"", "\"<i></i>\"");
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(String a, String b, String result)
	{
		String r;
		try
		{
			r = ""+ "\"" + makeTags(a.substring(1,a.length()-1), b.substring(1,b.length()-1)) + "\"";
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
		System.out.println(METHOD_NAME+"("+a+", "+b+") -> "+r + ", EXPECTED: "+result);
	}

}


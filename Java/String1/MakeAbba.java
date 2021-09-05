/**
 * CodingBat Java Activity "makeAbba" from String1.
 * codingbat.com
 */
public class MakeAbba
{
	private static int failures = 0;
	private static final String METHOD_NAME = "makeAbba";

	/**
	 * INSTRUCTIONS:
	 * Given two strings, a and b, return the result of putting them together 
	 * in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 * 
	 * makeAbba("Hi", "Bye") -> 19
	 * makeAbba("Yo", "Alice") -> "YoAliceAliceYo"
	 * makeAbba("What", "Up") -> "WhatUpUpWhat"
	 * 
	 */
	public static String makeAbba(String a, String b)
	{
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase("Hi", "Bye", "HiByeByeHi");
		testCase("Yo", "Alice", "YoAliceAliceYo");
		testCase("What", "Up", "WhatUpUpWhat");
		testCase("aaa", "bbb", "aaabbbbbbaaa");
		testCase("x", "y", "xyyx");
		testCase("x", "", "xx");
		testCase("", "y", "yy");
		testCase("Bo", "Ya", "BoYaYaBo");
		testCase("Ya", "Ya", "YaYaYaYa");
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(String a, String b, String result)
	{
		String r;
		try
		{
			r = ""+makeAbba(a, b);
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
		System.out.println(METHOD_NAME+"(\""+a+"\", \""+b+"\") -> \""+r + "\", EXPECTED: \""+result+"\"");
	}

}

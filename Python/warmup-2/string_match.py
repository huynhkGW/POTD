'''
CodingBat Python Activity "string_match" from warmup-2.
codingbat.com
'''

failures = 0

def string_match(a, b):
    '''
Given 2 strings, a and b,
return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


string_match('xxcaazz', 'xxbaaz') → 3
string_match('abc', 'abc') → 2
string_match('abc', 'axc') → 0
'''
    pass #Replace pass with your code to implement this function





def catchFailures(testCase, result):
    global failures
    
    try:
        assert eval(testCase) == result, "Test Case Failed: "+testCase+ " → "+str(result)
    except Exception as e:
        failures += 1
        print(e)
            


def test():
    global failures
    
    catchFailures('string_match("xxcaazz", "xxbaaz")', 3)
    catchFailures('string_match("abc", "abc")', 2)
    catchFailures('string_match("abc", "axc")', 0)
    catchFailures('string_match("hello", "he")', 1)
    catchFailures('string_match("he", "hello")', 1)
    catchFailures('string_match("h", "hello")', 0)
    catchFailures('string_match("", "hello")', 0)
    catchFailures('string_match("aabbccdd", "abbbxxd")', 1)
    catchFailures('string_match("aaxxaaxx", "iaxxai")', 3)
    catchFailures('string_match("iaxxai", "aaxxaaxx")', 3)
    
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

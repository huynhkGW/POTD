'''
CodingBat Python Activity "front3" from warmup-1.
codingbat.com
'''

failures = 0

def front3(strIn):
    '''
Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there.
Return a new string which is 3 copies of the front.

front3('Java') → 'JavJavJav'
front3('Chocolate') → 'ChoChoCho'
front3('abc') → 'abcabcabc'
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
    
    catchFailures('front3("Java")', 'JavJavJav')
    catchFailures('front3("Chocolate")', 'ChoChoCho')
    catchFailures('front3("abc")', 'abcabcabc')
    catchFailures('front3("abcXYZ")', 'abcabcabc')
    catchFailures('front3("ab")', 'ababab')
    catchFailures('front3("a")', 'aaa')
    catchFailures('front3("")', '')
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

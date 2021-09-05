'''
CodingBat Python Activity "not_string" from warmup-1.
codingbat.com
'''

failures = 0

def not_string(strIn):
    '''
Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged.


not_string('candy') → 'not candy'
not_string('x') → 'not x'
not_string('not bad') → 'not bad'
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
    
    catchFailures('not_string("candy")', 'not candy')
    catchFailures('not_string("x")', 'not x')
    catchFailures('not_string("not bad")', 'not bad')
    catchFailures('not_string("bad")', 'not bad')
    catchFailures('not_string("not")', 'not')
    catchFailures('not_string("is not")', 'not is not')
    catchFailures('not_string("no")', 'not no')
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

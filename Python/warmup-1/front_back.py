'''
CodingBat Python Activity "front_back" from warmup-1.
codingbat.com
'''

failures = 0

def front_back(strIn):
    '''
Given a string, return a new string where the first and last chars have been exchanged.


front_back('code') → 'eodc'
front_back('a') → 'a'
front_back('ab') → 'ba'

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
    
    catchFailures('front_back("code")', 'eodc')
    catchFailures('front_back("a")', 'a')
    catchFailures('front_back("ab")', 'ba')
    catchFailures('front_back("abc")', 'cba')
    catchFailures('front_back("")', '')
    catchFailures('front_back("Chocolate")', 'ehocolatC')
    catchFailures('front_back("aavJ")', 'Java')
    catchFailures('front_back("hello")', 'oellh')
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

'''
CodingBat Python Activity "last2" from warmup-2.
codingbat.com
'''

failures = 0

def last2(strIn):
    '''
Given a string, return the count of the number of times that
a substring length 2 appears in the string
and also as the last 2 chars of the string,
so "hixxxhi" yields 1 (we won't count the end substring).


last2('hixxhi') → 1
last2('xaxxaxaxx') → 1
last2('axxxaaxx') → 2
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
    
    catchFailures('last2("hixxhi")', 1)
    catchFailures('last2("xaxxaxaxx")', 1)
    catchFailures('last2("axxxaaxx")', 2)
    catchFailures('last2("xxaxxaxxaxx")', 3)
    catchFailures('last2("xaxaxaxx")', 0)
    catchFailures('last2("xxxx")', 2)
    catchFailures('last2("13121312")', 1)
    catchFailures('last2("11212")', 1)
    catchFailures('last2("13121311")', 0)
    catchFailures('last2("1717171")', 2)
    catchFailures('last2("hi")', 0)
    catchFailures('last2("h")', 0)
    catchFailures('last2("")', 0)
    
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

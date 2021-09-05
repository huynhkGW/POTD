'''
CodingBat Python Activity "diff21" from warmup-1.
codingbat.com
'''

failures = 0

def diff21(n):
    '''
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.

Note: https://en.wikipedia.org/wiki/Absolute_difference#:~:text=The%20absolute%20difference%20of%20two,corresponding%20to%20x%20and%20y.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
diff21(22) → 2
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
    
    catchFailures('diff21(19)', 2)
    catchFailures('diff21(10)', 11)
    catchFailures('diff21(21)', 0)
    catchFailures('diff21(22)', 2)
    catchFailures('diff21(25)', 8)
    catchFailures('diff21(30)', 18)
    catchFailures('diff21(0)', 21)
    catchFailures('diff21(1)', 20)
    catchFailures('diff21(2)', 19)
    catchFailures('diff21(-1)', 22)
    catchFailures('diff21(-2)', 23)
    catchFailures('diff21(50)', 58)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

'''
CodingBat Python Activity "pos_neg" from warmup-1.
codingbat.com
'''

failures = 0

def pos_neg(a, b, negative):
    '''
Given 2 int values, return True if one is negative and one is positive.
Except if the parameter "negative" is True, then return True only if both are negative.


pos_neg(1, -1, False) → True
pos_neg(-1, 1, False) → True
pos_neg(-4, -5, True) → True
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
    
    catchFailures('pos_neg(1, -1, False)', True)
    catchFailures('pos_neg(-1, 1, False)', True)
    catchFailures('pos_neg(-4, -5, True)', True)
    catchFailures('pos_neg(-4, -5, False)', False)
    catchFailures('pos_neg(-4, 5, False)', True)
    catchFailures('pos_neg(-4, 5, True)', False)
    catchFailures('pos_neg(1, 1, False)', False)
    catchFailures('pos_neg(-1, -1, False)', False)
    catchFailures('pos_neg(1, -1, True)', False)
    catchFailures('pos_neg(-1, 1, True)', False)
    catchFailures('pos_neg(1, 1, True)', False)
    catchFailures('pos_neg(-1, -1, True)', True)
    catchFailures('pos_neg(5, -5, False)', True)
    catchFailures('pos_neg(-6, 6, False)', True)
    catchFailures('pos_neg(-5, -6, False)', False)
    catchFailures('pos_neg(-2, -1, False)', False)
    catchFailures('pos_neg(1, 2, False)', False)
    catchFailures('pos_neg(-5, 6, True)', False)
    catchFailures('pos_neg(-5, -5, True)', True)
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

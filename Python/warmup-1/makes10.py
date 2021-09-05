'''
CodingBat Python Activity "makes10" from warmup-1.
codingbat.com
'''

failures = 0

def makes10(a, b):
    '''
Given 2 ints, a and b, return True if one if them is 10 or if their sum is 10.


makes10(9, 10) → True
makes10(9, 9) → False
makes10(1, 9) → True
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
    
    catchFailures('makes10(9, 10)', True)
    catchFailures('makes10(9, 9)', False)
    catchFailures('makes10(1, 9)', True)
    catchFailures('makes10(10, 1)', True)
    catchFailures('makes10(10, 10)', True)
    catchFailures('makes10(8, 2)', True)
    catchFailures('makes10(8, 3)', False)
    catchFailures('makes10(10, 42)', True)
    catchFailures('makes10(12, -2)', True)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

'''
CodingBat Python Activity "near_hundred" from warmup-1.
codingbat.com
'''

failures = 0

def near_hundred(n):
    '''
Given an int n, return True if it is within 10 of 100 or 200.
Note: abs(num) computes the absolute value of a number.


near_hundred(93) → True
near_hundred(90) → True
near_hundred(89) → False
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
    
    catchFailures('near_hundred(93)', True)
    catchFailures('near_hundred(90)', True)
    catchFailures('near_hundred(89)', False)
    catchFailures('near_hundred(110)', True)
    catchFailures('near_hundred(111)', False)
    catchFailures('near_hundred(121)', False)
    catchFailures('near_hundred(-101)', False)
    catchFailures('near_hundred(-209)', False)
    catchFailures('near_hundred(190)', True)
    catchFailures('near_hundred(209)', True)
    catchFailures('near_hundred(0)', False)
    catchFailures('near_hundred(5)', False)
    catchFailures('near_hundred(-50)', False)
    catchFailures('near_hundred(191)', True)
    catchFailures('near_hundred(189)', False)
    catchFailures('near_hundred(200)', True)
    catchFailures('near_hundred(210)', True)
    catchFailures('near_hundred(211)', False)
    catchFailures('near_hundred(290)', False)
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

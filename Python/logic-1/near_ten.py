'''
CodingBat Python Activity "near_ten" from logic-1.
codingbat.com
'''

failures = 0

def near_ten(num):
    '''
Given a non-negative number "num", return True if num is within 2 of a multiple of 10.
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.

near_ten(12) → True
near_ten(17) → False
near_ten(19) → True
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
    
    catchFailures("near_ten(12)", True)
    catchFailures("near_ten(17)", False)
    catchFailures("near_ten(19)", True)
    catchFailures("near_ten(31)", True)
    catchFailures("near_ten(6)", False)
    catchFailures("near_ten(10)", True)
    catchFailures("near_ten(11)", True)
    catchFailures("near_ten(21)", True)
    catchFailures("near_ten(22)", True)
    catchFailures("near_ten(23)", False)
    catchFailures("near_ten(54)", False)
    catchFailures("near_ten(155)", False)
    catchFailures("near_ten(158)", True)
    catchFailures("near_ten(3)", False)
    catchFailures("near_ten(1)", True)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

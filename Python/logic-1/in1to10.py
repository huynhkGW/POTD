'''
CodingBat Python Activity "in1to10" from logic-1.
codingbat.com
'''

failures = 0

def in1to10(n, outside_mode):
    '''
Given a number n, return True if n is in the range 1..10, inclusive.
Unless outside_mode is True, in which case return True if the number is less or equal to 1,
or greater or equal to 10.


in1to10(5, False) → True
in1to10(11, False) → False
in1to10(11, True) → True
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
    
    catchFailures("in1to10(5, False)", True)
    catchFailures("in1to10(11, False)", False)
    catchFailures("in1to10(11, True)", True)
    catchFailures("in1to10(10, False)", True)
    catchFailures("in1to10(10, True)", True)
    catchFailures("in1to10(9, False)", True)
    catchFailures("in1to10(9, True)", False)
    catchFailures("in1to10(1, False)", True)
    catchFailures("in1to10(1, True)", True)
    catchFailures("in1to10(0, False)", False)
    catchFailures("in1to10(0, True)", True)
    catchFailures("in1to10(-1, False)", False)
    catchFailures("in1to10(-1, True)", True)
    catchFailures("in1to10(99, False)", False)
    catchFailures("in1to10(-99, True)", True)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

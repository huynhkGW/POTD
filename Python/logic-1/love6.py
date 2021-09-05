'''
CodingBat Python Activity "love6" from logic-1.
codingbat.com
'''

failures = 0

def love6(a, b):
    '''

The number 6 is a truly great number.
Given two int values, a and b, return True if either one is 6.
Or if their sum or difference is 6.
Note: the function abs(num) computes the absolute value of a number (ie, makes the number positive if negative).

love6(6, 4) → True
love6(4, 5) → False
love6(1, 5) → True
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
    
    catchFailures("love6(6, 4)", True)
    catchFailures("love6(4, 5)", False)
    catchFailures("love6(1, 5)", True)
    catchFailures("love6(1, 6)", True)
    catchFailures("love6(1, 8)", False)
    catchFailures("love6(1, 7)", True)
    catchFailures("love6(7, 5)", False)
    catchFailures("love6(8, 2)", True)
    catchFailures("love6(6, 6)", True)
    catchFailures("love6(-6, 2)", False)
    catchFailures("love6(-4, -10)", True)
    catchFailures("love6(-7, 1)", False)
    catchFailures("love6(7, -1)", True)
    catchFailures("love6(-6, 12)", True)
    catchFailures("love6(-2, -4)", False)
    catchFailures("love6(7, 1)", True)
    catchFailures("love6(0, 9)", False)
    catchFailures("love6(8, 3)", False)
    catchFailures("love6(3, 3)", True)
    catchFailures("love6(3, 4)", False)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

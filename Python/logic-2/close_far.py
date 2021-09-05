'''
CodingBat Python Activity "close_far" from logic-2.
codingbat.com
'''

failures = 0

def close_far(a, b, c):
    '''
Given three ints, a b c, return True if one of b or c is "close" (differing from a by at most 1),
while the other is "far", differing from both other values by 2 or more.
Note: abs(num) computes the absolute value of a number. (ie, removes any negative signs from a number)


close_far(1, 2, 10) → True
close_far(1, 2, 3) → False
close_far(4, 1, 3) → True
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
    
    #test cases go here
    catchFailures("close_far(1, 2, 10)", True)
    catchFailures("close_far(1, 2, 3)", False)
    catchFailures("close_far(4, 1, 3)", True)
    catchFailures("close_far(4, 5, 3)", False)
    catchFailures("close_far(4, 3, 5)", False)
    catchFailures("close_far(-1, 10, 0)", True)
    catchFailures("close_far(0, -1, 10)", True)
    catchFailures("close_far(10, 10, 8)", True)
    catchFailures("close_far(10, 8, 9)", False)
    catchFailures("close_far(8, 9, 10)", False)
    catchFailures("close_far(8, 9, 7)", False)
    catchFailures("close_far(8, 6, 9)", True)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

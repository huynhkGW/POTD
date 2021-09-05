'''
CodingBat Python Activity "lone_sum" from logic-2.
codingbat.com
'''

failures = 0

def lone_sum(a, b, c):
    '''
Given 3 int values, a b c, return their sum.
However, if one of the values is the same as another of the values, it does not count towards the sum.


lone_sum(1, 2, 3) → 6
lone_sum(3, 2, 3) → 2
lone_sum(3, 3, 3) → 0
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
    catchFailures("lone_sum(1, 2, 3)", 6)
    catchFailures("lone_sum(3, 2, 3)", 2)
    catchFailures("lone_sum(3, 3, 3)", 0)
    catchFailures("lone_sum(9, 2, 2)", 9)
    catchFailures("lone_sum(2, 2, 9)", 9)
    catchFailures("lone_sum(2, 9, 2)", 9)
    catchFailures("lone_sum(2, 9, 3)", 14)
    catchFailures("lone_sum(4, 2, 3)", 9)
    catchFailures("lone_sum(1, 3, 1)", 3)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

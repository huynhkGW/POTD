'''
CodingBat Python Activity "no_teen_sum" from logic-2.
codingbat.com
'''

failures = 0

def no_teen_sum(a, b. c):
    '''
Given 3 int values, a b c, return their sum.
However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens.
Write a separate helper "def fix_teen(n):"that takes in an int value and returns that value fixed for the teen rule.
In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
Define the helper below and at the same indent level as the main no_teen_sum().


no_teen_sum(1, 2, 3) → 6
no_teen_sum(2, 13, 1) → 3
no_teen_sum(2, 1, 14) → 3
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
    catchFailures("no_teen_sum(1, 2, 3)", 6)
    catchFailures("no_teen_sum(2, 13, 1)", 3)
    catchFailures("no_teen_sum(2, 1, 14)", 3)
    catchFailures("no_teen_sum(2, 1, 15)", 18)
    catchFailures("no_teen_sum(2, 1, 16)", 19)
    catchFailures("no_teen_sum(2, 1, 17)", 3)
    catchFailures("no_teen_sum(17, 1, 2)", 3)
    catchFailures("no_teen_sum(2, 15, 2)", 19)
    catchFailures("no_teen_sum(16, 17, 18)", 16)
    catchFailures("no_teen_sum(17, 18, 19)", 0)
    catchFailures("no_teen_sum(15, 16, 1)", 32)
    catchFailures("no_teen_sum(15, 15, 19)", 30)
    catchFailures("no_teen_sum(15, 19, 16)", 31)
    catchFailures("no_teen_sum(5, 17, 18)", 5)
    catchFailures("no_teen_sum(17, 18, 16)", 16)
    catchFailures("no_teen_sum(17, 19, 18)", 0)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

'''
CodingBat Python Activity "sorta_sum" from logic-1.
codingbat.com
'''

failures = 0

def sorta_sum(a, b):
    '''
Given 2 ints, a and b, return their sum.
However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.


sorta_sum(3, 4) → 7
sorta_sum(9, 4) → 20
sorta_sum(10, 11) → 21
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
    
    catchFailures("sorta_sum(3, 4)", 7)
    catchFailures("sorta_sum(9, 4)", 20)
    catchFailures("sorta_sum(10, 11)", 21)
    catchFailures("sorta_sum(12, -3)", 9)
    catchFailures("sorta_sum(-3, 12)", 9)
    catchFailures("sorta_sum(4, 5)", 9)
    catchFailures("sorta_sum(4, 6)", 20)
    catchFailures("sorta_sum(14, 7)", 21)
    catchFailures("sorta_sum(14, 6)", 20)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

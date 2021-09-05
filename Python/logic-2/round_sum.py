'''
CodingBat Python Activity "round_sum" from logic-2.
codingbat.com
'''

failures = 0

def round_sum(a, b, c):
    '''
For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "def round10(num):" and call it 3 times. Write the helper entirely below and at the same indent level as round_sum().


round_sum(16, 17, 18) → 60
round_sum(12, 13, 14) → 30
round_sum(6, 4, 4) → 10
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
    catchFailures("round_sum(16, 17, 18)", 60)
    catchFailures("round_sum(12, 13, 14)", 30)
    catchFailures("round_sum(6, 4, 4)", 10)
    catchFailures("round_sum(4, 6, 5)", 20)
    catchFailures("round_sum(4, 4, 6)", 10)
    catchFailures("round_sum(9, 4, 4)", 10)
    catchFailures("round_sum(0, 0, 1)", 0)
    catchFailures("round_sum(0, 9, 0)", 10)
    catchFailures("round_sum(10, 10, 19)", 40)
    catchFailures("round_sum(20, 30, 40)", 90)
    catchFailures("round_sum(45, 21, 30)", 100)
    catchFailures("round_sum(23, 11, 26)", 60)
    catchFailures("round_sum(23, 24, 25)", 70)
    catchFailures("round_sum(25, 24, 25)", 80)
    catchFailures("round_sum(23, 24, 29)", 70)
    catchFailures("round_sum(11, 24, 36)", 70)
    catchFailures("round_sum(24, 36, 32)", 90)
    catchFailures("round_sum(14, 12, 26)", 50)
    catchFailures("round_sum(12, 10, 24)", 40)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

'''
CodingBat Python Activity "lucky_sum" from logic-2.
codingbat.com
'''

failures = 0

def lucky_sum(a, b, c):
    '''

Given 3 int values, a b c, return their sum.
However, if one of the values is 13 then it does not count towards the sum and values to its right do not count.
So for example, if b is 13, then both b and c do not count.


lucky_sum(1, 2, 3) → 6
lucky_sum(1, 2, 13) → 3
lucky_sum(1, 13, 3) → 1
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
    catchFailures("lucky_sum(1, 2, 3)", 6)
    catchFailures("lucky_sum(1, 2, 13)", 3)
    catchFailures("lucky_sum(1, 13, 3)", 1)
    catchFailures("lucky_sum(1, 13, 13)", 1)
    catchFailures("lucky_sum(6, 5, 2)", 13)
    catchFailures("lucky_sum(13, 2, 3)", 0)
    catchFailures("lucky_sum(13, 2, 13)", 0)
    catchFailures("lucky_sum(13, 13, 2)", 0)
    catchFailures("lucky_sum(9, 4, 13)", 13)
    catchFailures("lucky_sum(8, 13, 2)", 8)
    catchFailures("lucky_sum(7, 2, 1)", 10)
    catchFailures("lucky_sum(3, 3, 13)", 6)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

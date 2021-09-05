'''
CodingBat Python Activity "count_evens" from list-2.
codingbat.com
'''

failures = 0

def big_diff(nums):
    '''
Given an array length 1 or more of ints,
return the difference between the largest and smallest values in the array.
Note: the built-in min(v1, v2, ...) and max(v1, v2, ...) functions return the smaller or larger of two values.


big_diff([10, 3, 5, 6]) → 7
big_diff([7, 2, 10, 9]) → 8
big_diff([2, 10, 7, 2]) → 8
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
    
    catchFailures('big_diff([10, 3, 5, 6])', 7)
    catchFailures('big_diff([7, 2, 10, 9])', 8)
    catchFailures('big_diff([2, 10, 7, 2])', 8)
    catchFailures('big_diff([2, 10])', 8)
    catchFailures('big_diff([10, 2])', 8)
    catchFailures('big_diff([10, 0])', 10)
    catchFailures('big_diff([2, 3])', 1)
    catchFailures('big_diff([2, 2])', 0)
    catchFailures('big_diff([2])', 0)
    catchFailures('big_diff([5, 1, 6, 1, 9, 9])', 8)
    catchFailures('big_diff([7, 6, 8, 5])', 3)
    catchFailures('big_diff([7, 7, 6, 8, 5, 5, 6])', 3)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

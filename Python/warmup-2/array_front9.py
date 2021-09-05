'''
CodingBat Python Activity "array_front9" from warmup-2.
codingbat.com
'''

failures = 0

def array_front9(nums):
    '''
Given an array of ints, return True if one of the first 4 elements in the array is a 9.
The array length may be less than 4.


array_front9([1, 2, 9, 3, 4]) → True
array_front9([1, 2, 3, 4, 9]) → False
array_front9([1, 2, 3, 4, 5]) → False
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
    
    catchFailures('array_front9([1, 2, 9, 3, 4])', True)
    catchFailures('array_front9([1, 2, 3, 4, 9])', False)
    catchFailures('array_front9([1, 2, 3, 4, 5])', False)
    catchFailures('array_front9([9, 2, 3])', True)
    catchFailures('array_front9([1, 9, 9])', True)
    catchFailures('array_front9([1, 2, 3])', False)
    catchFailures('array_front9([1, 9])', True)
    catchFailures('array_front9([5, 5])', False)
    catchFailures('array_front9([2])', False)
    catchFailures('array_front9([9])', True)
    catchFailures('array_front9([])', False)
    catchFailures('array_front9([3, 9, 2, 3, 3])', True)
    
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

'''
CodingBat Python Activity "array_count9" from warmup-2.
codingbat.com
'''

failures = 0

def array_count9(nums):
    '''
Given an array of ints, return the number of 9's in the array.


array_count9([1, 2, 9]) → 1
array_count9([1, 9, 9]) → 2
array_count9([1, 9, 9, 3, 9]) → 3
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
    
    catchFailures('array_count9([1, 2, 9])', 1)
    catchFailures('array_count9([1, 9, 9])', 2)
    catchFailures('array_count9([1, 9, 9, 3, 9])', 3)
    catchFailures('array_count9([1, 2, 3])', 0)
    catchFailures('array_count9([])', 0)
    catchFailures('array_count9([4, 2, 4, 3, 1])', 0)
    catchFailures('array_count9([9, 2, 4, 3, 1])', 1)
    
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

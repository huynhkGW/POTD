'''
CodingBat Python Activity "array123" from warmup-2.
codingbat.com
'''

failures = 0

def array123(nums):
    '''
Given an array of ints,
return True if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → True
array123([1, 1, 2, 4, 1]) → False
array123([1, 1, 2, 1, 2, 3]) → True
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
    
    catchFailures('array123([1, 1, 2, 3, 1])', True)
    catchFailures('array123([1, 1, 2, 4, 1])', False)
    catchFailures('array123([1, 1, 2, 1, 2, 3])', True)
    catchFailures('array123([1, 1, 2, 1, 2, 1])', False)
    catchFailures('array123([1, 2, 3, 1, 2, 3])', True)
    catchFailures('array123([1, 2, 3])', True)
    catchFailures('array123([1, 1, 1])', False)
    catchFailures('array123([1, 2])', False)
    catchFailures('array123([1])', False)
    catchFailures('array123([])', False)
    
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

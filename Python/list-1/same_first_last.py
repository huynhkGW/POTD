'''
CodingBat Python Activity "same_first_last" from list-1.
codingbat.com
'''

failures = 0

def same_first_last(nums1):
    '''Given an array of ints, return True if the array is length 1 or more,
    and the first element and the last element are equal.


    same_first_last([1, 2, 3]) → False
    same_first_last([1, 2, 3, 1]) → True
    same_first_last([1, 2, 1]) → True
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
    catchFailures('same_first_last([1, 2, 3])', False)
    catchFailures('same_first_last([1, 2, 3, 1])', True)
    catchFailures('same_first_last([1, 2, 1])', True)
    catchFailures('same_first_last([7])', True)
    catchFailures('same_first_last([])', False)
    catchFailures('same_first_last([1, 2, 3, 4, 5, 1])', True)
    catchFailures('same_first_last([1, 2, 3, 4, 5, 13])', False)
    catchFailures('same_first_last([13, 2, 3, 4, 5, 13])', True)
    catchFailures('same_first_last([7, 7])', True) 
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()
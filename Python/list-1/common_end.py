'''
CodingBat Python Activity "common_end" from list-1.
codingbat.com
'''

failures = 0

def commonEnd(nums1, nums2):
    '''Given 2 arrays of ints, a and b, return True if they have the same first element or
    they have the same last element. Both arrays will be length 1 or more.


    common_end([1, 2, 3], [7, 3]) → True
    common_end([1, 2, 3], [7, 3, 2]) → False
    common_end([1, 2, 3], [1, 3]) → True
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
    catchFailures('commonEnd([1, 2, 3], [7, 3])', True)
    catchFailures('commonEnd([1, 2, 3], [7, 3, 2])', False)
    catchFailures('commonEnd([1, 2, 3], [1, 3])', True)
    catchFailures('commonEnd([1, 2, 3], [1])', True)
    catchFailures('commonEnd([1, 2, 3], [2])', False)    
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()
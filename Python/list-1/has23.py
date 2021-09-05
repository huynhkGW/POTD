'''
CodingBat Python Activity "has23" from list-1.
codingbat.com
'''

failures = 0

def has23(nums1):
    '''
Given an int array length 2, return True if it contains a 2 or a 3.


has23([2, 5]) → True
has23([4, 3]) → True
has23([4, 5]) → False
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
    catchFailures('has23([2, 5])', True)
    catchFailures('has23([4, 3])', True)
    catchFailures('has23([4, 5])', False)
    catchFailures('has23([2, 2])', True)
    catchFailures('has23([3, 2])', True)
    catchFailures('has23([3, 3])', True)
    catchFailures('has23([7, 7])', False)
    catchFailures('has23([3, 9])', True)
    catchFailures('has23([9, 5])', False)
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()
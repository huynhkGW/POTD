'''
CodingBat Python Activity "has22" from list-2.
codingbat.com
'''

failures = 0

def has22(nums):
    '''
Given an array of ints, return True if the array contains a 2 next to a 2 somewhere.


has22([1, 2, 2]) → True
has22([1, 2, 1, 2]) → False
has22([2, 1, 2]) → False
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
    
    catchFailures('has22([1, 2, 2])', True)
    catchFailures('has22([1, 2, 1, 2])', False)
    catchFailures('has22([2, 1, 2])', False)
    catchFailures('has22([2, 2, 1, 2])', True)
    catchFailures('has22([1, 3, 2])', False)
    catchFailures('has22([1, 3, 2, 2])', True)
    catchFailures('has22([2, 3, 2, 2])', True)
    catchFailures('has22([4, 2, 4, 2, 2, 5])', True)
    catchFailures('has22([1, 2])', False)
    catchFailures('has22([2, 2])', True)
    catchFailures('has22([2])', False)
    catchFailures('has22([])', False)
    catchFailures('has22([3, 3, 2, 2])', True)
    catchFailures('has22([5, 2, 5, 2])', False)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

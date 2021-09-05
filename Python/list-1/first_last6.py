'''
CodingBat Python Activity "firstLast6" from list-1.
codingbat.com
'''

failures = 0

def firstLast6(nums):
    '''Given an array of ints, return True if 6 appears as either the first or last element in the array.
    The array will be length 1 or more.

    first_last6([1, 2, 6]) → True
    first_last6([6, 1, 2, 3]) → True
    first_last6([13, 6, 1, 2, 3]) → False
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
    
    catchFailures('firstLast6([1, 2, 6])', True)
    catchFailures('firstLast6([6, 1, 2, 3])', True)
    catchFailures('firstLast6([13, 6, 1, 2, 3])', False)
    catchFailures('firstLast6([13, 6, 1, 2, 6])', True)
    catchFailures('firstLast6([3, 2, 1])', False)
    catchFailures('firstLast6([3, 6, 1])', False)
    catchFailures('firstLast6([3, 6])', True)
    catchFailures('firstLast6([6])', True)
    catchFailures('firstLast6([3])', False)
    catchFailures('firstLast6([5, 6])', True)
    catchFailures('firstLast6([5, 5])', False)
    catchFailures('firstLast6([1, 2, 3, 4, 6])', True)
    catchFailures('firstLast6([1, 2, 3, 4])', False)
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()
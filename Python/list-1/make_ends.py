'''
CodingBat Python Activity "make_ends" from list-1.
codingbat.com
'''

failures = 0

def make_ends(nums1):
    '''
Given an array of ints, return a new array length 2 containing the first and last elements
from the original array. The original array will be length 1 or more.


make_ends([1, 2, 3]) → [1, 3]
make_ends([1, 2, 3, 4]) → [1, 4]
make_ends([7, 4, 6, 2]) → [7, 2]
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
    catchFailures('make_ends([1, 2, 3])', [1, 3])
    catchFailures('make_ends([1, 2, 3, 4])', [1, 4])
    catchFailures('make_ends([7, 4, 6, 2])', [7, 2])
    catchFailures('make_ends([1, 2, 2, 2, 2, 2, 2, 3])', [1, 3])
    catchFailures('make_ends([7, 4])', [7, 4])
    catchFailures('make_ends([7])', [7, 7])
    catchFailures('make_ends([5, 2, 9])', [5, 9])
    catchFailures('make_ends([2, 3, 4, 1])', [2, 1])
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()
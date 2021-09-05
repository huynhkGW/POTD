'''
CodingBat Python Activity "max_end3" from list-1.
codingbat.com
'''

failures = 0

def max_end3(nums):
    '''
Given an array of ints length 3, figure out which is larger,
the first or last element in the array, and set all the other elements to be that value.
Return the changed array.


max_end3([1, 2, 3]) → [3, 3, 3]
max_end3([11, 5, 9]) → [11, 11, 11]
max_end3([2, 11, 3]) → [3, 3, 3]
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
    catchFailures('max_end3([1, 2, 3])', [3, 3, 3])
    catchFailures('max_end3([11, 5, 9])', [11, 11, 11])
    catchFailures('max_end3([2, 11, 3])', [3, 3, 3])
    catchFailures('max_end3([11, 3, 3])', [11, 11, 11])
    catchFailures('max_end3([3, 11, 11])', [11, 11, 11])
    catchFailures('max_end3([2, 2, 2])', [2, 2, 2])
    catchFailures('max_end3([2, 11, 2])', [2, 2, 2])
    catchFailures('max_end3([0, 0, 1])', [1, 1, 1])
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()
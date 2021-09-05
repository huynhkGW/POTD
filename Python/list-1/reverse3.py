'''
CodingBat Python Activity "reverse3" from list-1.
codingbat.com
'''

failures = 0

def reverse3(nums):
    '''
Given an array of ints length 3,
return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
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
    catchFailures('reverse3([1, 2, 3])', [3, 2, 1])
    catchFailures('reverse3([5, 11, 9])', [9, 11, 5])
    catchFailures('reverse3([7, 0, 0])', [0, 0, 7])
    catchFailures('reverse3([2, 1, 2])', [2, 1, 2])
    catchFailures('reverse3([1, 2, 1])', [1, 2, 1])
    catchFailures('reverse3([2, 11, 3])', [3, 11, 2])
    catchFailures('reverse3([0, 6, 5])', [5, 6, 0])
    catchFailures('reverse3([7, 2, 3])', [3, 2, 7])
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()
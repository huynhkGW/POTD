'''
CodingBat Python Activity "sum3" from list-1.
codingbat.com
'''

failures = 0

def sum3(nums):
    '''
Given an array of ints length 3, return the sum of all the elements.


sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
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
    catchFailures('sum3([1, 2, 3])', 6)
    catchFailures('sum3([5, 11, 2])', 18)
    catchFailures('sum3([7, 0, 0])', 7)
    catchFailures('sum3([1, 2, 1])', 4)
    catchFailures('sum3([1, 1, 1])', 3)
    catchFailures('sum3([2, 7, 2])', 11)    
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()
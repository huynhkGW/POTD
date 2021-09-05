'''
CodingBat Python Activity "sum2" from list-1.
codingbat.com
'''

failures = 0

def sum2(nums):
    '''
Given an array of ints, return the sum of the first 2 elements in the array.
If the array length is less than 2, just sum up the elements that exist,
returning 0 if the array is length 0.


sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
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
    catchFailures('sum2([1, 2, 3])', 3)
    catchFailures('sum2([1, 1])', 2)
    catchFailures('sum2([1, 1, 1, 1])', 2)
    catchFailures('sum2([1, 2])', 3)
    catchFailures('sum2([1])', 1)
    catchFailures('sum2([])', 0)
    catchFailures('sum2([4, 5, 6])', 9)
    catchFailures('sum2([4])', 4)
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()
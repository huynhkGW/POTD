'''
CodingBat Python Activity "count_evens" from list-2.
codingbat.com
'''

failures = 0

def count_evens(nums):
    '''
Return the number of even ints in the given array.
Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.


count_evens([2, 1, 2, 3, 4]) → 3
count_evens([2, 2, 0]) → 3
count_evens([1, 3, 5]) → 0
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
    
    catchFailures('count_evens([2, 1, 2, 3, 4])', 3)
    catchFailures('count_evens([2, 2, 0])', 3)
    catchFailures('count_evens([1, 3, 5])', 0)
    catchFailures('count_evens([])', 0)
    catchFailures('count_evens([11, 9, 0, 1])', 1)
    catchFailures('count_evens([2, 11, 9, 0])', 2)
    catchFailures('count_evens([2])', 1)
    catchFailures('count_evens([2, 5, 12])', 2)
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

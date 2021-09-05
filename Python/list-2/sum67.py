'''
CodingBat Python Activity "sum67" from list-2.
codingbat.com
'''

failures = 0

def sum67(nums):
    '''
Return the sum of the numbers in the array,
except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
Return 0 for no numbers.


sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
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
    
    catchFailures('sum67([1, 2, 2])', 5)
    catchFailures('sum67([1, 2, 2, 6, 99, 99, 7])', 5)
    catchFailures('sum67([1, 1, 6, 7, 2])', 4)
    catchFailures('sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7])', 2)
    catchFailures('sum67([1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7])', 2)
    catchFailures('sum67([2, 7, 6, 2, 6, 7, 2, 7])', 18)
    catchFailures('sum67([2, 7, 6, 2, 6, 2, 7])', 9)
    catchFailures('sum67([1, 6, 7, 7])', 8)
    catchFailures('sum67([6, 7, 1, 6, 7, 7])', 8)
    catchFailures('sum67([6, 8, 1, 6, 7])', 0)
    catchFailures('sum67([])', 0)
    catchFailures('sum67([6, 7, 11])', 11)
    catchFailures('sum67([11, 6, 7, 11])', 22)
    catchFailures('sum67([2, 2, 6, 7, 7])', 11)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

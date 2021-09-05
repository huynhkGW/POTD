'''
CodingBat Python Activity "middle_way" from list-1.
codingbat.com
'''

failures = 0

def middle_way(nums1, nums2):
    '''
Given 2 int arrays, a and b, each length 3,
return a new array length 2 containing their middle elements.


middle_way([1, 2, 3], [4, 5, 6]) → [2, 5]
middle_way([7, 7, 7], [3, 8, 0]) → [7, 8]
middle_way([5, 2, 9], [1, 4, 5]) → [2, 4]
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
    catchFailures('middle_way([1, 2, 3], [4, 5, 6])', [2, 5])
    catchFailures('middle_way([7, 7, 7], [3, 8, 0])', [7, 8])
    catchFailures('middle_way([5, 2, 9], [1, 4, 5])', [2, 4])
    catchFailures('middle_way([1, 9, 7], [4, 8, 8])', [9, 8])
    catchFailures('middle_way([1, 2, 3], [3, 1, 4])', [2, 1])
    catchFailures('middle_way([1, 2, 3], [4, 1, 1])', [2, 1])
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()
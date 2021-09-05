'''
CodingBat Python Activity "rotate_left3" from list-1.
codingbat.com
'''

failures = 0

def rotate_left3(nums):
    '''
Given an array of ints length 3,
return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


rotate_left3([1, 2, 3]) → [2, 3, 1]
rotate_left3([5, 11, 9]) → [11, 9, 5]
rotate_left3([7, 0, 0]) → [0, 0, 7]
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
    catchFailures('rotate_left3([1, 2, 3])', [2, 3, 1])
    catchFailures('rotate_left3([5, 11, 9])', [11, 9, 5])
    catchFailures('rotate_left3([7, 0, 0])', [0, 0, 7])
    catchFailures('rotate_left3([1, 2, 1])', [2, 1, 1])
    catchFailures('rotate_left3([0, 0, 1])', [0, 1, 0])   
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()
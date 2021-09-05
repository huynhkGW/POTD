'''
CodingBat Python Activity "" from xxxx.
codingbat.com
'''

failures = 0

def xxxxx(nums):
    '''

    '''
    pass





def catchFailures(testCase, result):
    global failures
    
    try:
        assert eval(testCase) == result, "Test Case Failed: "+testCase+ " → "+str(result)
    except Exception as e:
        failures += 1
        print(e)
            


def test():
    global failures
    
    #catchFailures('function', result)  #Use google sheet to generate easily
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

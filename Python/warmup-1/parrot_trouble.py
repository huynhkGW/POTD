'''
CodingBat Python Activity "parrot_trouble" from warmup-1.
codingbat.com
'''

failures = 0

def parrot_trouble(talking, hour):
    '''
We have a loud talking parrot.
The "hour" parameter is the current hour time in the range 0..23.
We are in trouble if the parrot is talking and the hour is before 7 or after 20.
Return True if we are in trouble.


parrot_trouble(True, 6) → True
parrot_trouble(True, 7) → False
parrot_trouble(False, 6) → False
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
    
    catchFailures('parrot_trouble(True, 6)', True)
    catchFailures('parrot_trouble(True, 7)', False)
    catchFailures('parrot_trouble(False, 6)', False)
    catchFailures('parrot_trouble(True, 21)', True)
    catchFailures('parrot_trouble(False, 21)', False)
    catchFailures('parrot_trouble(False, 20)', False)
    catchFailures('parrot_trouble(True, 23)', True)
    catchFailures('parrot_trouble(False, 23)', False)
    catchFailures('parrot_trouble(True, 20)', False)
    catchFailures('parrot_trouble(False, 12)', False)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

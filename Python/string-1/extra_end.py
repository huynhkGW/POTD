'''
CodingBat Python Activity "extra_end" from string-1.
codingbat.com
'''

failures = 0

def extra_end(str):
    '''
Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.


extra_end('Hello') → 'lololo'
extra_end('ab') → 'ababab'
extra_end('Hi') → 'HiHiHi'
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
    
    catchFailures("extra_end('Hello')", 'lololo')
    catchFailures("extra_end('ab')", 'ababab')
    catchFailures("extra_end('Hi')", 'HiHiHi')
    catchFailures("extra_end('Candy')", 'dydydy')
    catchFailures("extra_end('Code')", 'dedede')

        
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

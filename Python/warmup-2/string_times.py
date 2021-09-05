'''
CodingBat Python Activity "string_times" from warmup-2.
codingbat.com
'''

failures = 0

def string_times(strIn, n):
    '''
Given a string and a non-negative int n,
return a larger string that is n copies of the original string.


string_times('Hi', 2) → 'HiHi'
string_times('Hi', 3) → 'HiHiHi'
string_times('Hi', 1) → 'Hi'
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
    
    catchFailures('string_times("Hi", 2)', 'HiHi')
    catchFailures('string_times("Hi", 3)', 'HiHiHi')
    catchFailures('string_times("Hi", 1)', 'Hi')
    catchFailures('string_times("Hi", 0)', '')
    catchFailures('string_times("Hi", 5)', 'HiHiHiHiHi')
    catchFailures('string_times("Oh Boy!", 2)', 'Oh Boy!Oh Boy!')
    catchFailures('string_times("x", 4)', 'xxxx')
    catchFailures('string_times("", 4)', '')
    catchFailures('string_times("code", 2)', 'codecode')
    catchFailures('string_times("code", 3)', 'codecodecode')
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

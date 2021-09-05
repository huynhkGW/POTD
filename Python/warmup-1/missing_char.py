'''
CodingBat Python Activity "missing_char" from warmup-1.
codingbat.com
'''

failures = 0

def missing_char(strIn, n):
    '''

Given a non-empty string and an int n,
return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string
(i.e. n will be in the range 0..len(str)-1 inclusive).


missing_char('kitten', 1) → 'ktten'
missing_char('kitten', 0) → 'itten'
missing_char('kitten', 4) → 'kittn'
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
    
    catchFailures('missing_char("kitten", 1)', 'ktten')
    catchFailures('missing_char("kitten", 0)', 'itten')
    catchFailures('missing_char("kitten", 4)', 'kittn')
    catchFailures('missing_char("Hi", 0)', 'i')
    catchFailures('missing_char("Hi", 1)', 'H')
    catchFailures('missing_char("code", 0)', 'ode')
    catchFailures('missing_char("code", 1)', 'cde')
    catchFailures('missing_char("code", 2)', 'coe')
    catchFailures('missing_char("code", 3)', 'cod')
    catchFailures('missing_char("chocolate", 8)', 'chocolat')
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

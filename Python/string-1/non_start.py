'''
CodingBat Python Activity "non_start" from string-1.
codingbat.com
'''

failures = 0

def non_start(a, b):
    '''
Given 2 strings, return their concatenation, except omit the first char of each.
The strings will be at least length 1.


non_start('Hello', 'There') → 'ellohere'
non_start('java', 'code') → 'avaode'
non_start('shotl', 'java') → 'hotlava'
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
    
    catchFailures("non_start('Hello', 'There')", 'ellohere')
    catchFailures("non_start('java', 'code')", 'avaode')
    catchFailures("non_start('shotl', 'java')", 'hotlava')
    catchFailures("non_start('ab', 'xy')", 'by')
    catchFailures("non_start('ab', 'x')", 'b')
    catchFailures("non_start('x', 'ac')", 'c')
    catchFailures("non_start('a', 'x')", '')
    catchFailures("non_start('kit', 'kat')", 'itat')
    catchFailures("non_start('mart', 'dart')", 'artart')

        
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

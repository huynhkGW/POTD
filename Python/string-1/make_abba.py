'''
CodingBat Python Activity "make_abba" from string-1.
codingbat.com
'''

failures = 0

def make_abba(a, b):
    '''
Given two strings, a and b, return the result of putting them together in the order abba,
e.g. "Hi" and "Bye" returns "HiByeByeHi".


make_abba('Hi', 'Bye') → 'HiByeByeHi'
make_abba('Yo', 'Alice') → 'YoAliceAliceYo'
make_abba('What', 'Up') → 'WhatUpUpWhat'
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
    
    catchFailures("make_abba('Hi', 'Bye')", 'HiByeByeHi')
    catchFailures("make_abba('Yo', 'Alice')", 'YoAliceAliceYo')
    catchFailures("make_abba('What', 'Up')", 'WhatUpUpWhat')
    catchFailures("make_abba('aaa', 'bbb')", 'aaabbbbbbaaa')
    catchFailures("make_abba('x', 'y')", 'xyyx')
    catchFailures("make_abba('x', '')", 'xx')
    catchFailures("make_abba('', 'y')", 'yy')
    catchFailures("make_abba('Bo', 'Ya')", 'BoYaYaBo')
    catchFailures("make_abba('Ya', 'Ya')", 'YaYaYaYa')

        
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

'''
CodingBat Python Activity "left2" from string-1.
codingbat.com
'''

failures = 0

def left2(str):
    '''
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
The string length will be at least 2.


left2('Hello') → 'lloHe'
left2('java') → 'vaja'
left2('Hi') → 'Hi'
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
    
    catchFailures("left2('Hello')", 'lloHe')
    catchFailures("left2('java')", 'vaja')
    catchFailures("left2('Hi')", 'Hi')
    catchFailures("left2('code')", 'deco')
    catchFailures("left2('cat')", 'tca')
    catchFailures("left2('12345')", '34512')
    catchFailures("left2('Chocolate')", 'ocolateCh')
    catchFailures("left2('bricks')", 'icksbr')

        
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

'''
CodingBat Python Activity "first_half" from string-1.
codingbat.com
'''

failures = 0

def first_half(str):
    '''
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


first_half('WooHoo') → 'Woo'
first_half('HelloThere') → 'Hello'
first_half('abcdef') → 'abc'
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
    
    catchFailures("first_half('WooHoo')", 'Woo')
    catchFailures("first_half('HelloThere')", 'Hello')
    catchFailures("first_half('abcdef')", 'abc')
    catchFailures("first_half('ab')", 'a')
    catchFailures("first_half('')", '')
    catchFailures("first_half('0123456789')", '01234')
    catchFailures("first_half('kitten')", 'kit')

        
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

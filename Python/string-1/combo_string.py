'''
CodingBat Python Activity "combo_string" from string-1.
codingbat.com
'''

failures = 0

def combo_string(a, b):
    '''

Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).


combo_string('Hello', 'hi') → 'hiHellohi'
combo_string('hi', 'Hello') → 'hiHellohi'
combo_string('aaa', 'b') → 'baaab'
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
    
    catchFailures("combo_string('Hello', 'hi')", 'hiHellohi')
    catchFailures("combo_string('hi', 'Hello')", 'hiHellohi')
    catchFailures("combo_string('aaa', 'b')", 'baaab')
    catchFailures("combo_string('b', 'aaa')", 'baaab')
    catchFailures("combo_string('aaa', '')", 'aaa')
    catchFailures("combo_string('', 'bb')", 'bb')
    catchFailures("combo_string('aaa', '1234')", 'aaa1234aaa')
    catchFailures("combo_string('aaa', 'bb')", 'bbaaabb')
    catchFailures("combo_string('a', 'bb')", 'abba')
    catchFailures("combo_string('bb', 'a')", 'abba')
    catchFailures("combo_string('xyz', 'ab')", 'abxyzab')

        
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

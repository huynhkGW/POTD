'''
CodingBat Python Activity "first_two" from string-1.
codingbat.com
'''

failures = 0

def first_two(str):
    '''
Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".

first_two('Hello') → 'He'
first_two('abcdefg') → 'ab'
first_two('ab') → 'ab'
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
    
    catchFailures("first_two('Hello')", 'He')
    catchFailures("first_two('abcdefg')", 'ab')
    catchFailures("first_two('ab')", 'ab')
    catchFailures("first_two('a')", 'a')
    catchFailures("first_two('')", '')
    catchFailures("first_two('Kitten')", 'Ki')
    catchFailures("first_two('hi')", 'hi')
    catchFailures("first_two('hiya')", 'hi')

        
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

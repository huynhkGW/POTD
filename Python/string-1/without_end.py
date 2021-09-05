'''
CodingBat Python Activity "without_end" from string-1.
codingbat.com
'''

failures = 0

def without_end(str):
    '''
Given a string, return a version without the first and last char, so "Hello" yields "ell".
The string length will be at least 2.


without_end('Hello') → 'ell'
without_end('java') → 'av'
without_end('coding') → 'odin'
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
    
    catchFailures("without_end('Hello')", 'ell')
    catchFailures("without_end('java')", 'av')
    catchFailures("without_end('coding')", 'odin')
    catchFailures("without_end('code')", 'od')
    catchFailures("without_end('ab')", '')
    catchFailures("without_end('Chocolate!')", 'hocolate')
    catchFailures("without_end('kitten')", 'itte')
    catchFailures("without_end('woohoo')", 'ooho')

        
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

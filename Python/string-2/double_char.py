'''
CodingBat Python Activity "double_char" from string-2.
codingbat.com
'''

failures = 0

def double_char(str):
    '''

Given a string, return a string where for every char in the original, there are two chars.

double_char('The') → 'TThhee'
double_char('AAbb') → 'AAAAbbbb'
double_char('Hi-There') → 'HHii--TThheerree'
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
    catchFailures("double_char('The')", 'TThhee')
    catchFailures("double_char('AAbb')", 'AAAAbbbb')
    catchFailures("double_char('Hi-There')", 'HHii--TThheerree')
    catchFailures("double_char('Word!')", 'WWoorrdd!!')
    catchFailures("double_char('!!')", '!!!!')
    catchFailures("double_char('')", '')
    catchFailures("double_char('a')", 'aa')
    catchFailures("double_char('.')", '..')
    catchFailures("double_char('aa')", 'aaaa')

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

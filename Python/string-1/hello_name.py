'''
CodingBat Python Activity "hello_name" from string-1.
codingbat.com
'''

failures = 0

def hello_name(name):
    '''
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


hello_name('Bob') → 'Hello Bob!'
hello_name('Alice') → 'Hello Alice!'
hello_name('X') → 'Hello X!'
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
    
    catchFailures("hello_name('Bob')", 'Hello Bob!')
    catchFailures("hello_name('Alice')", 'Hello Alice!')
    catchFailures("hello_name('X')", 'Hello X!')
    catchFailures("hello_name('Dolly')", 'Hello Dolly!')
    catchFailures("hello_name('Alpha')", 'Hello Alpha!')
    catchFailures("hello_name('Omega')", 'Hello Omega!')
    catchFailures("hello_name('Goodbye')", 'Hello Goodbye!')
    catchFailures("hello_name('ho ho ho')", 'Hello ho ho ho!')
    catchFailures("hello_name('xyz!')", 'Hello xyz!!')
    catchFailures("hello_name('Hello')", 'Hello Hello!')

        
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

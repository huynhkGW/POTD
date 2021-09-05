'''
CodingBat Python Activity "string_bits" from warmup-2.
codingbat.com
'''

failures = 0

def string_bits(strIn):
    '''
Given a string, return a new string made of every other char starting with the first,
so "Hello" yields "Hlo".


string_bits('Hello') → 'Hlo'
string_bits('Hi') → 'H'
string_bits('Heeololeo') → 'Hello'
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
    
    catchFailures('string_bits("Hello")', 'Hlo')
    catchFailures('string_bits("Hi")', 'H')
    catchFailures('string_bits("Heeololeo")', 'Hello')
    catchFailures('string_bits("HiHiHi")', 'HHH')
    catchFailures('string_bits("")', '')
    catchFailures('string_bits("Greetings")', 'Getns')
    catchFailures('string_bits("Chocoate")', 'Coot')
    catchFailures('string_bits("pi")', 'p')
    catchFailures('string_bits("Hello Kitten")', 'HloKte')
    catchFailures('string_bits("hxaxpxpxy")', 'happy')
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

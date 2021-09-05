'''
CodingBat Python Activity "string_splosion" from warmup-2.
codingbat.com
'''

failures = 0

def string_splosion(strIn):
    '''
Given a non-empty string like "Code" return a string like "CCoCodCode".


string_splosion('Code') → 'CCoCodCode'
string_splosion('abc') → 'aababc'
string_splosion('ab') → 'aab'
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
    
    catchFailures('string_splosion("Code")', 'CCoCodCode')
    catchFailures('string_splosion("abc")', 'aababc')
    catchFailures('string_splosion("ab")', 'aab')
    catchFailures('string_splosion("x")', 'x')
    catchFailures('string_splosion("fade")', 'ffafadfade')
    catchFailures('string_splosion("There")', 'TThTheTherThere')
    catchFailures('string_splosion("Kitten")', 'KKiKitKittKitteKitten')
    catchFailures('string_splosion("Bye")', 'BByBye')
    catchFailures('string_splosion("Good")', 'GGoGooGood')
    catchFailures('string_splosion("Bad")', 'BBaBad')
    
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

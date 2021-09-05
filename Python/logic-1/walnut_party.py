'''
Based on CodingBat Python Activity "cigar_party" from logic-1.
codingbat.com
'''

failures = 0

def walnut_party(walnuts, is_weekend):
    '''
When squirrels get together for a party, they like to have walnuts.
A squirrel party is successful when the number of walnuts is between 40 and 60, inclusive.
Unless it is the weekend, in which case there is no upper bound on the number of walnuts.
Return True if the party with the given values is successful, or False otherwise.


walnut_party(30, False) → False
walnut_party(50, False) → True
walnut_party(70, True) → True
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
    
    catchFailures("walnut_party(30, False)", False)
    catchFailures("walnut_party(50, False)", True)
    catchFailures("walnut_party(70, True)", True)
    catchFailures("walnut_party(30, True)", False)
    catchFailures("walnut_party(50, True)", True)
    catchFailures("walnut_party(60, False)", True)
    catchFailures("walnut_party(61, False)", False)
    catchFailures("walnut_party(40, False)", True)
    catchFailures("walnut_party(39, False)", False)
    catchFailures("walnut_party(40, True)", True)
    catchFailures("walnut_party(39, True)", False)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

'''
CodingBat Python Activity "date_fashion" from logic-1.
codingbat.com
'''

failures = 0

def date_fashion(you, date):
    '''
You and your date are trying to get a table at a restaurant.
The parameter "you" is the stylishness of your clothes, in the range 0..10,
and "date" is the stylishness of your date's clothes.
The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
If either of you is very stylish, 8 or more, then the result is 2 (yes).
With the exception that if either of you has style of 2 or less, then the result is 0 (no).
Otherwise the result is 1 (maybe).


date_fashion(5, 10) → 2
date_fashion(5, 2) → 0
date_fashion(5, 5) → 1
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
    
    catchFailures("date_fashion(5, 10)", 2)
    catchFailures("date_fashion(5, 2)", 0)
    catchFailures("date_fashion(5, 5)", 1)
    catchFailures("date_fashion(3, 3)", 1)
    catchFailures("date_fashion(10, 2)", 0)
    catchFailures("date_fashion(2, 9)", 0)
    catchFailures("date_fashion(9, 9)", 2)
    catchFailures("date_fashion(10, 5)", 2)
    catchFailures("date_fashion(2, 2)", 0)
    catchFailures("date_fashion(3, 7)", 1)
    catchFailures("date_fashion(2, 7)", 0)
    catchFailures("date_fashion(6, 2)", 0)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

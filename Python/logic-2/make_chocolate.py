'''
CodingBat Python Activity "make_chocolate" from logic-2.
codingbat.com
'''

failures = 0

def make_chocolate(small, big, goal):
    '''
We want make a package of goal kilos of chocolate.
We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars.
Return -1 if it can't be done.


make_chocolate(4, 1, 9) → 4
make_chocolate(4, 1, 10) → -1
make_chocolate(4, 1, 7) → 2
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
    
    #test cases go here
    catchFailures("make_chocolate(4, 1, 9)", 4)
    catchFailures("make_chocolate(4, 1, 10)", -1)
    catchFailures("make_chocolate(4, 1, 7)", 2)
    catchFailures("make_chocolate(6, 2, 7)", 2)
    catchFailures("make_chocolate(4, 1, 5)", 0)
    catchFailures("make_chocolate(4, 1, 4)", 4)
    catchFailures("make_chocolate(5, 4, 9)", 4)
    catchFailures("make_chocolate(9, 3, 18)", 3)
    catchFailures("make_chocolate(3, 1, 9)", -1)
    catchFailures("make_chocolate(1, 2, 7)", -1)
    catchFailures("make_chocolate(1, 2, 6)", 1)
    catchFailures("make_chocolate(1, 2, 5)", 0)
    catchFailures("make_chocolate(6, 1, 10)", 5)
    catchFailures("make_chocolate(6, 1, 11)", 6)
    catchFailures("make_chocolate(6, 1, 12)", -1)
    catchFailures("make_chocolate(6, 1, 13)", -1)
    catchFailures("make_chocolate(6, 2, 10)", 0)
    catchFailures("make_chocolate(6, 2, 11)", 1)
    catchFailures("make_chocolate(6, 2, 12)", 2)
    catchFailures("make_chocolate(60, 100, 550)", 50)
    catchFailures("make_chocolate(1000, 1000000, 5000006)", 6)
    catchFailures("make_chocolate(7, 1, 12)", 7)
    catchFailures("make_chocolate(7, 1, 13)", -1)
    catchFailures("make_chocolate(7, 2, 13)", 3)
    
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

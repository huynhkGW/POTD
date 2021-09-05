'''
CodingBat Python Activity "squirrel_play" from logic-1.
codingbat.com
'''

failures = 0

def squirrel_play(temp, is_summer):
    '''
The squirrels in Palo Alto spend most of the day playing.
In particular, they play if the temperature is between 60 and 90 (inclusive).
Unless it is summer, then the upper limit is 100 instead of 90.
Given an int temperature and a boolean is_summer, return True if the squirrels play and False otherwise.


squirrel_play(70, False) → True
squirrel_play(95, False) → False
squirrel_play(95, True) → True
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
    
    catchFailures("squirrel_play(70, False)", True)
    catchFailures("squirrel_play(95, False)", False)
    catchFailures("squirrel_play(95, True)", True)
    catchFailures("squirrel_play(90, False)", True)
    catchFailures("squirrel_play(90, True)", True)
    catchFailures("squirrel_play(50, False)", False)
    catchFailures("squirrel_play(50, True)", False)
    catchFailures("squirrel_play(100, False)", False)
    catchFailures("squirrel_play(100, True)", True)
    catchFailures("squirrel_play(105, True)", False)
    catchFailures("squirrel_play(59, False)", False)
    catchFailures("squirrel_play(59, True)", False)
    catchFailures("squirrel_play(60, False)", True)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()


'''
CodingBat Python Activity "make_bricks" from logic-2.
codingbat.com
'''

failures = 0

def make_bricks(small, big, goal):
    '''
We want to make a row of bricks that is goal inches long.
We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return True if it is possible to make the goal by choosing from the given bricks.

This is a little harder than it looks and can be done without any loops.
See also https://codingbat.com/doc/practice/makebricks-introduction.html


make_bricks(3, 1, 8) → True
make_bricks(3, 1, 9) → False
make_bricks(3, 2, 10) → True
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
    catchFailures("make_bricks(3, 1, 8)", True)
    catchFailures("make_bricks(3, 1, 9)", False)
    catchFailures("make_bricks(3, 2, 10)", True)
    catchFailures("make_bricks(3, 2, 8)", True)
    catchFailures("make_bricks(3, 2, 9)", False)
    catchFailures("make_bricks(6, 1, 11)", True)
    catchFailures("make_bricks(6, 0, 11)", False)
    catchFailures("make_bricks(1, 4, 11)", True)
    catchFailures("make_bricks(0, 3, 10)", True)
    catchFailures("make_bricks(1, 4, 12)", False)
    catchFailures("make_bricks(3, 1, 7)", True)
    catchFailures("make_bricks(1, 1, 7)", False)
    catchFailures("make_bricks(2, 1, 7)", True)
    catchFailures("make_bricks(7, 1, 11)", True)
    catchFailures("make_bricks(7, 1, 8)", True)
    catchFailures("make_bricks(7, 1, 13)", False)
    catchFailures("make_bricks(43, 1, 46)", True)
    catchFailures("make_bricks(40, 1, 46)", False)
    catchFailures("make_bricks(40, 2, 47)", True)
    catchFailures("make_bricks(40, 2, 50)", True)
    catchFailures("make_bricks(40, 2, 52)", False)
    catchFailures("make_bricks(22, 2, 33)", False)
    catchFailures("make_bricks(0, 2, 10)", True)
    catchFailures("make_bricks(1000000, 1000, 1000100)", True)
    catchFailures("make_bricks(2, 1000000, 100003)", False)
    catchFailures("make_bricks(20, 0, 19)", True)
    catchFailures("make_bricks(20, 0, 21)", False)
    catchFailures("make_bricks(20, 4, 51)", False)
    catchFailures("make_bricks(20, 4, 39)", True)

    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

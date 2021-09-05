'''
CodingBat Python Activity "cat_dog" from string-2.
codingbat.com
'''

failures = 0

def cat_dog(str):
    '''
Return True if the string "cat" and "dog" appear the same number of times in the given string.

cat_dog('catdog') → True
cat_dog('catcat') → False
cat_dog('1cat1cadodog') → True
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
    
    catchFailures("cat_dog('catdog')", True)
    catchFailures("cat_dog('catcat')", False)
    catchFailures("cat_dog('1cat1cadodog')", True)
    catchFailures("cat_dog('catxxdogxxxdog')", False)
    catchFailures("cat_dog('catxdogxdogxcat')", True)
    catchFailures("cat_dog('catxdogxdogxca')", False)
    catchFailures("cat_dog('dogdogcat')", False)
    catchFailures("cat_dog('dogogcat')", True)
    catchFailures("cat_dog('dog')", False)
    catchFailures("cat_dog('cat')", False)
    catchFailures("cat_dog('ca')", True)
    catchFailures("cat_dog('c')", True)
    catchFailures("cat_dog('')", True) 

        
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

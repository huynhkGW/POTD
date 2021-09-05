'''
CodingBat Python Activity "end_other" from string-2.
codingbat.com
'''

failures = 0

def end_other(a, b):
    '''
Given two strings, return True if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: s.lower() returns the lowercase version of a string.


end_other('Hiabc', 'abc') → True
end_other('AbC', 'HiaBc') → True
end_other('abc', 'abXabc') → True
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
    
    catchFailures("end_other('Hiabc', 'abc')", True)
    catchFailures("end_other('AbC', 'HiaBc')", True)
    catchFailures("end_other('abc', 'abXabc')", True)
    catchFailures("end_other('Hiabc', 'abcd')", False)
    catchFailures("end_other('Hiabc', 'bc')", True)
    catchFailures("end_other('Hiabcx', 'bc')", False)
    catchFailures("end_other('abc', 'abc')", True)
    catchFailures("end_other('xyz', '12xyz')", True)
    catchFailures("end_other('yz', '12xz')", False)
    catchFailures("end_other('Z', '12xz')", True)
    catchFailures("end_other('12', '12')", True)
    catchFailures("end_other('abcXYZ', 'abcDEF')", False)
    catchFailures("end_other('ab', 'ab12')", False)
    catchFailures("end_other('ab', '12ab')", True)

        
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

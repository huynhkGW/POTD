'''
CodingBat Python Activity "make_out_word" from string-1.
codingbat.com
'''

failures = 0

def make_out_word(out, word):
    '''
Given an "out" string length 4, such as "<<>>", and a word,
return a new string where the word is in the middle of the out string, e.g. "<<word>>".

make_out_word('<<>>', 'Yay') → '<<Yay>>'
make_out_word('<<>>', 'WooHoo') → '<<WooHoo>>'
make_out_word('[[]]', 'word') → '[[word]]'
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
    
    catchFailures("make_out_word('<<>>', 'Yay')", '<<Yay>>')
    catchFailures("make_out_word('<<>>', 'WooHoo')", '<<WooHoo>>')
    catchFailures("make_out_word('[[]]', 'word')", '[[word]]')
    catchFailures("make_out_word('HHoo', 'Hello')", 'HHHellooo')
    catchFailures("make_out_word('abyz', 'YAY')", 'abYAYyz') 

        
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

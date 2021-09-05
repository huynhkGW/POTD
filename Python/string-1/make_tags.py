'''
CodingBat Python Activity "make_tags" from string-1.
codingbat.com
'''

failures = 0

def make_tags(tag, word):
    '''
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".


make_tags('i', 'Yay') → '<i>Yay</i>'
make_tags('i', 'Hello') → '<i>Hello</i>'
make_tags('cite', 'Yay') → '<cite>Yay</cite>'
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
    
    catchFailures("make_tags('i', 'Yay')", '<i>Yay</i>')
    catchFailures("make_tags('i', 'Hello')", '<i>Hello</i>')
    catchFailures("make_tags('cite', 'Yay')", '<cite>Yay</cite>')
    catchFailures("make_tags('address', 'here')", '<address>here</address>')
    catchFailures("make_tags('body', 'Heart')", '<body>Heart</body>')
    catchFailures("make_tags('i', 'i')", '<i>i</i>')
    catchFailures("make_tags('i', '')", '<i></i>')

        
    if failures > 0:
        print("\r\n "+ str(failures) + " failed test case(s)   :(")
    else:
        print("Good job -- problem solved!")


test()

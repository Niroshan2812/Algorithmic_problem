#Write a Python function called reverse_string that takes a string as input and returns a new string with the characters in reverse order. 
#For example, if the input string is "hello, world", the output string should be "dlrow ,olleh".

def reverse_string(inputd):
    length = len(inputd)
    new_string = ""
    for i in range(length-1, -1, -1):
        new_string += inputd[i]
    return new_string
        
    

print(reverse_string("Hello"))
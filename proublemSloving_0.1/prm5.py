#Write a program that takes a list of strings as input and returns a new list containing only the strings that have length greater than 5 characters. 
#The order of the elements in the new list should be the same as the order of the long strings in the original list.
#For example, if the input list is ["apple", "cat", "dog", "banana", "elephant"], the program should return the list ["banana", "elephant"]

userInput = input("enter String using comma ")
newStringArray = []
for i in userInput.split(','):
    if len(i)>5:
        newStringArray.append(i)
print(newStringArray)
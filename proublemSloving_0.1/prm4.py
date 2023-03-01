# Proublem 
# Write a program that takes a list of integers as input and returns a new list that contains only the even numbers from the original list. 
#The order of the elements in the new list should be the same as the order of the even numbers in the original list.

#For example, if the input list is [2, 5, 3, 8, 10, 12], the program should return the list [2, 8, 10, 12].




# Get a user input 
input_str = input("Enter a list of integers separated by commas: ")
# Check wether input is number 
int_list = [int(num) for num in input_str.split(",")]


print('original list : ', int_list)


evenintList = []

#using for loop check whether each number in a list is even number or not and if it is even number it will store in newIntList array 
for i in int_list:
    if i%2 ==0:
        evenintList.append(i)
print('even numbers list  : ', evenintList)

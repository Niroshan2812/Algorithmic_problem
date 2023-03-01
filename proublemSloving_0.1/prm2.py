#Write a program that takes a list of numbers and returns the sum of all the even numbers in the list.

#For example, if the input list is [2, 5, 3, 8, 10, 12], the output should be 32 (since 2 + 8 + 10 + 12 = 32).

numbers= [2, 5, 3, 8, 10, 12]
num = 0
for i in numbers:
    if i%2 == 0 :
        num +=i
        
print (num)
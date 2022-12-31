def bsearch(list, val):
   list_size = len(list) - 1
   idx0 = 0
   idxn = list_size
    # Find the middle most value
   while idx0 <= idxn:
      midval = (idx0 + idxn)// 2
      if list[midval] == val:
         return midval
    # Compare the value the middle most value
   if val > list[midval]:
      idx0 = midval + 1
   else:
      idxn = midval - 1
   if idx0 > idxn:
      return None
# Initialize the sorted list
list = [2,7,19,34,53,72]

# Print the search result
print(bsearch(list,72))
print(bsearch(list,11))



#Big-Theta Notation
def fistSimpleFizzBuzz():
    number = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
              30]
    for num in number:
        if num %15==0:
            print(num, 'fizzz Buzz')
        elif num % 3 ==0:
            print(num,' Fizz')
        elif num % 5 ==0:
             print(num, ' Buzz')
        else:
            print(num)


bsearch([1, 2, 3, 4, 5, 6, 7, 8, 9, 10],5)


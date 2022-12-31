
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


fistSimpleFizzBuzz()


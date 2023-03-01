# Write a program that takes a string as input and outputs the most common character in the string.
# If there are multiple characters that appear the same number of times, your program should output any one of them.
# For example, if the input string is "hello world", the program should output the letter "l", since it appears three times in the string.


def find_most_common_char(input_str):
    # Step 1: Create dictionary of character counts
    char_counts = {}
    for char in input_str:
        if char not in char_counts:
            char_counts[char] = 0

    # Step 2: Update character counts
    for char in input_str:
        char_counts[char] += 1

    # Step 3: Find character(s) with highest count
    max_count = 0
    most_common_chars = []
    for char, count in char_counts.items():
        if count > max_count:
            max_count = count
            most_common_chars = [char]
        elif count == max_count:
            most_common_chars.append(char)

    # Step 4: Return most common character
    return most_common_chars[0]



input_str = input("Please enter a string: ")
# for validate user inout is string or not 
if isinstance(input_str, str):
   print(find_most_common_char(input_str))
    
else:
    print("Input is not a string.")


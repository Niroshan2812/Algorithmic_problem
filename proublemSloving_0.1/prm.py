##
#Problem: You have a rectangular garden that measures 8 feet by 12 feet. 
# You want to add a border of flowers around the entire garden that is 1 foot wide.
#  How many flowers do you need to buy if each flower needs to be planted 6 inches apart from the next one?
# (1 feet = 12 inch)



# Define the dimensions of the garden
garden_length = 8  # in feet
garden_width = 12  # in feet

# Define the dimensions of the border
border_width = 1  # in feet
flower_spacing = 0.5  # in feet

# Calculate the new dimensions of the garden with the border
new_garden_length = garden_length + 2*border_width
new_garden_width = garden_width + 2*border_width

# Calculate the area of the garden and the area of the new garden
garden_area = garden_length * garden_width
new_garden_area = new_garden_length * new_garden_width

# Calculate the area of the border
border_area = new_garden_area - garden_area

# Calculate the length of one side of the border
border_length = garden_length + 2*border_width

# Calculate the number of flowers needed for one side of the border
flowers_per_side = int(border_length/flower_spacing) + 1

# Calculate the total number of flowers needed
total_flowers = 4*flowers_per_side

# Print the result
print("You will need to buy", total_flowers, "flowers to plant a border of flowers around your garden.")

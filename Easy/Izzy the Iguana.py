list = input().split()

points = 0
for item in list:
    if item == "Mango":
        points += 9
    elif item == "Lettuce":
        points += 5
    elif item == "Carrot":
        points += 4

    # Python 3.10.0 introduces "switch"
    """
    match item:
        case "Mango":
            points += 9
        case "Lettuce":
            points += 5
        case "Carrot":
            points += 4
        #case "Cheeseburger":
        #    points += 0{}
    """

if points >= 10:
    print("Come on Down!")
else:
    print("Time to wait")
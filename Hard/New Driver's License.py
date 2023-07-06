my_name = input()
agents = int(input())
four_names = input().split()
time = 0

# match statement not recognised
if agents >= 5:
    time = 20
elif agents == 4:
    time = 40
    for name in four_names:
        if my_name < name:
            time = 20
            break
elif agents == 3:
    time = 20
    four_names.sort()
    if my_name > four_names[2]:
        time = 40
elif agents == 2:
    time = 20
    four_names.sort()
    if my_name > four_names[1]:
        time = 40
elif agents == 1:
    time = 20
    for name in four_names:
        if my_name > name:
            time += 20
else:
    print("Invalid number of agents")
    
print(time)
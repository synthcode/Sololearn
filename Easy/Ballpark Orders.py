order = input().split()
total = 0

for item in order:
    if item in ('Nachos', 'Pizza'):
        total += 6
    elif item == 'Cheeseburger':
        total += 10
    elif item == 'Water':
        total += 4
    else: # Coke or other
        total += 5
        
total *= 1 + 0.07
print("%.2f" % total)
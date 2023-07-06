total = int(input())
myBasket = int(input())
friendBasket = int(input())

if myBasket + friendBasket < total:
    print("Keep Hunting")
else:
    print("Candy Time")
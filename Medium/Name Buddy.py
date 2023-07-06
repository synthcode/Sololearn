names = input().split()
myName = input()

match = False
for name in names:
    if name[0] == myName[0]:
        match = True
        break

if match:
    print("Compare notes")
else:
    print("No such luck")
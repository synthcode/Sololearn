zipCode = input()

validZip = False
if len(zipCode) == 5:
    try:
        number = int(validZip)
        validZip = True
    except:
        pass

if validZip:
    print("true")
else:
    print("false")
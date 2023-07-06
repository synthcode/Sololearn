text = input()

dict = {}
for ch in text:
    if dict.get(ch) is None:
        dict[ch] = 1
    else:
        dict[ch] += 1

isogram = True
for ch in dict.keys():
    if dict[ch] >= 2:
        isogram = False
        break

print("true") if isogram else print("false")
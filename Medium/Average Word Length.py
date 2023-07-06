import math

string = input()
# print(string)
string = string.translate({ord(c): None for c in ".,;:!?"})
# print(string)
words = string.split()

count = 0
lengthTotal = 0
for word in words:
    count += 1
    lengthTotal += len(word)

print(math.ceil(lengthTotal/count))
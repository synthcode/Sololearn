text = input()
words = text.split()
newWords = []
for word in words:
    c = word[0]
    newWords.append(word[1:] + c + "ay")
print(*newWords)
sentence = input()
words = sentence.split()
flows = True

for idx, word in enumerate(words):
    if idx == 0:
        continue
    if not (words[idx - 1][-1] == word[0]):
        flows = False
        break

if flows:
    print("true")
else:
    print("false")
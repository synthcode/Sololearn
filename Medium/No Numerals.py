numberWords = {
    0: 'zero', 1: 'one', 2: 'two',
    3: 'three', 4: 'four', 5: 'five',
    6: 'six', 7: 'seven', 8: 'eight',
    9: 'nine', 10: 'ten'
}

inputWords = input().split()
for idx, word in enumerate(inputWords):
    try:
        isInt = (0 <= int(word) <= 10)
        if isInt:
            inputWords[idx] = numberWords[int(word)]
    except:
        pass
        
for word in inputWords:
    print(word, end = ' ')
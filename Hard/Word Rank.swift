var word: String = ""

if let input = readLine() {
    word = input;
}

var wordArray = Array(word)
var length = wordArray.count
var wordChars = wordArray
wordChars.sort()

func factorial(n: Int) -> Int {
    return n < 2 ? 1 : n
             * factorial(n: n - 1)
}

func combinations(chars: [Character])
  -> Int {
    var numer
      = factorial(n: chars.count)
    
    var dict = [Character: Int]()
    for char in chars {
        if let c = dict[char] {
            dict[char]! += 1
        }
        else {
            dict[char] = 1
        }
    }
    
    var denom = 1
    for (key, value) in dict {
        denom *= factorial(n: value)
    }
    
    return numer/denom
}

var prevTempChars = [Character]()
var pos: Int = 0
var cTotal: Int = 0

while length > 0 {
    pos = 0
    while pos < length {
        if wordArray[0]
             > wordChars[pos] {
            var tempChars = wordChars
            tempChars.remove(at: pos)
            if tempChars
                 != prevTempChars {
                cTotal += combinations(
                  chars: tempChars)
            }
            prevTempChars = tempChars
        }
        else {
            break
        }
        pos += 1
    }
    
    wordArray.remove(at: 0)
    wordChars.remove(at: pos)
    length -= 1
}

print(cTotal + 1)

// Too inefficient
/*
var wordsSet = Set<String>()

func permuter(s: String, left: Int,
  right: Int, set: inout Set<String>) {
    if left == right {
        set.insert(s)
    } else {
        var chars = Array(s)
        for var i in left..<right {
            chars.swapAt(left, i);
            permuter(s: String(chars),
                       left: left + 1,
                     right: right,
                        set: &set);
            chars.swapAt(left, i);
        }
    }
}

permuter(s: word, left: 0,
           right: length,
             set: &wordsSet)

var wordsArray = [String]()
for s in wordsSet {
    wordsArray.append(s);
}

wordsArray.sort()

for (i, s) in wordsArray.enumerated() {
    if word == s {
        print(i + 1);
        break;
    }
}
*/
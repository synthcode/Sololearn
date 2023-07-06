var listLength: Int = 0
if let input = readLine() {
    if let number = Int(input) {
        listLength = number
    }
}

var numArray = [Int]()
for index in 1...listLength {
    if let input = readLine() {
        if let number = Int(input) {
            numArray.append(number)
        }
    }
}

numArray.sort()
//print(numArray)

var prev = numArray[0]
for index in 1...(listLength - 1) {
    while numArray[index] != prev + 1 {
        print(prev + 1, terminator:" ")
        prev += 1
    }
    prev = numArray[index]
}
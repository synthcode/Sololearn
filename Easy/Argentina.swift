var currency: [Int] = [0, 0]

for index in 0...1 {
    if let input = readLine() {
        if let number = Int(input) {
            currency[index] = number
        }
    }
}

if currency[0]/50 < currency[1] {
    print("Pesos")
}
else {
    print("Dollars")
}
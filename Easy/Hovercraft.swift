var hovercraftsSold: Int = 0

if let input = readLine() {
    if let number = Int(input) {
        hovercraftsSold = number
    }
}

var cost: Int = 10 * 2000000 + 1000000
var sales: Int = hovercraftsSold * 3000000

if sales > cost {
    print("Profit")
}
else if sales == cost {
    print("Broke Even")
}
else {
    print("Loss")
}
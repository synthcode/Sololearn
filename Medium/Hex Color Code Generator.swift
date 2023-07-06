var integers: [Int] = [0, 0, 0]
var hexes: [String] = ["00", "00", "00"]

for i in 1...3 {
    if let input = readLine() {
        if let n = Int(input) {
            integers[i - 1] = n
            hexes[i - 1]
              = String(n, radix: 16)
        }
    }
}

/*
print(integers[0])
print(integers[1])
print(integers[2])
*/

print("#" + hexes[0]
        + hexes[1] + hexes[2])
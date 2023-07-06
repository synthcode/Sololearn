var x: Int = -1

if let input = readLine() {
    if let number = Int(input) {
        x = number
    }
}

// Recursion too slow
/*
func Q(n: Int) -> Int {
    if n == 1 || n == 2 {
        return 1
    }
    else if n > 2 {
        return Q(n: (n - Q(n: (n - 1))))
             + Q(n: (n - Q(n: (n - 2))))
    }
    else {
        // error
        return -1
    }
}
*/

var Q: [Int: Int] = [1: 1, 2: 1]
for n in 3...x {
    Q[n] = Q[n - Q[n - 1]!]!
             + Q[n - Q[n - 2]!]!
}

print(Q[x]!)
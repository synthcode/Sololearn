var siblings: Int = 0
var popsicles: Int = 0

if let input = readLine() {
    if let number = Int(input) {
        siblings = number
    }
}

if let input = readLine() {
    if let number = Int(input) {
        popsicles = number
    }
}

if popsicles % siblings == 0 {
    print("give away")
}
else {
    print("eat them yourself")
}
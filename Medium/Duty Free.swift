if let input = readLine() {
    let inputFloatChars
        = input.characters.split(
            separator: " ")
            
    let prices
        = inputFloatChars.map {
            Float(String($0))
          }
    
    //print(prices)
    var prices2 = [Float]()
    for price in prices {
        prices2.append(price ?? 0.0)
    }
    // print(prices2)
    // print(prices2.max()!)
    var maxprice = prices2.max()!
          
    if maxprice * 1.1 <= 20.0 {
        print("On to the terminal")
    } else {
        print("Back to the store")
    }
}
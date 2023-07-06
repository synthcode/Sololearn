import Foundation

let tax: Float = 0.07

if let input = readLine() {
    let stringArr
      = input.split(separator: ",")
    let floatArr
      = stringArr.compactMap{Float($0)}
      
    var total: Float = 0
    for i in floatArr {
        if i < 20 {
            total += i * (1 + tax)
        } else {
            total += i
        }
    }

    let formattedTotal
      = String(format: "%.2f", total)
    print(formattedTotal)
}
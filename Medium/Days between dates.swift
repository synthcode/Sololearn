import Foundation

var stringOld: String = ""
var stringNew: String = ""

if let input = readLine() {
    stringOld = input
}

if let input = readLine() {
    stringNew = input
}

var dateFormatter = DateFormatter();
dateFormatter.dateFormat
  = "MMMM dd, yyyy"
var dateOld
  = dateFormatter.date(from: stringOld)
var dateNew
  = dateFormatter.date(from: stringNew)

func days(fromDate: Date!, toDate: Date!)
 -> Int {
    let components
      = Calendar.current.dateComponents(
          [.day], from: fromDate,
             to: toDate)
    return Int(components.day!)
}

//print(stringOld)
//print(stringNew)
//print(dateOld)
//print(dateNew)
print(days(fromDate: dateOld,
             toDate: dateNew))
input = gets.chomp.split(',')

prices = []
for item in input
    prices << item.to_f
end

maxprice = prices.max
prices.delete(maxprice)

subtotal = 0.0
for price in prices
    subtotal += price
end

saving = (1.07 * 0.3 * subtotal)
puts saving.truncate
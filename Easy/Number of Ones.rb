x = gets.to_i

onesCount = 0
while x != 0
    if x % 2 == 1
        onesCount += 1
    end
    x /= 2
end

puts(onesCount)
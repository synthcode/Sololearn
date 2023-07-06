testNumber = gets.chomp.to_i
divisors = gets.chomp.split().map{|e| e.to_i}

divisible = true
for divisor in divisors
    if testNumber % divisor != 0
        divisible = false
    end
end

if divisible
    puts "divisible by all"
else
    puts "not divisible by all"
end
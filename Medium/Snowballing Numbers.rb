length = gets.to_i
last = gets.to_i
sum = 0
condition = true

for i in 2..length
    sum += last
    last = gets.to_i
    if sum >= last
        condition = false
        break
    end
end

if condition
    puts("true")
else
    puts("false")
end
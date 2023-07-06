open = false
for i in 1..4
    sign = gets.chomp
    sign_reverse = sign.reverse
    if sign == sign_reverse
        open = true
        break
    end
end

if open
    puts "Open"
else
    puts "Trash"
end
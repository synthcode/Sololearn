input = gets.chomp

vowels = 0
for i in 0...input.size
    case input[i]
    when 'a', 'e', 'i', 'o', 'u'
        vowels += 1
    when 'A', 'E', 'I', 'O', 'U'
        vowels += 1
    end
end

puts(vowels)
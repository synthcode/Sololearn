input = gets.chomp
link1 = input.split('=')

if link1.length == 2
    puts link1[1]
else
    link2 = input.split('/')
    puts link2[3]
end
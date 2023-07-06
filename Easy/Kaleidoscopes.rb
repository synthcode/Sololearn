kaleidoscopes = gets.to_i
tmp = 1.07 * (kaleidoscopes * 5.00)

if kaleidoscopes > 1
    puts((0.9 * tmp).round(2))
else
    puts(tmp.round(2))
end
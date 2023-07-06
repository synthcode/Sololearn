points = gets.to_i
ticketsGun = gets.to_i

ticketsHave = points/12
if ticketsHave >= ticketsGun
    puts "Buy it!"
else
    puts "Try again"
end
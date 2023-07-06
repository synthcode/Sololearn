bowls = []

for i in (1..6)
    bowls.push(gets.to_i)
end

for i in (0..5)
    if bowls[i] % 3 == 0
        print "Pop "
    elsif bowls[i] % 2 == 0
        print "Crackle "
    else
        print "Snap "
    end
end
from mpmath import *

mp.dps = 1000
pi_digit = int(input())

multiplier = 1
for i in range(1, pi_digit):
    multiplier = mp.fmul(multiplier, 10)

temp = mp.fmul(mp.pi, multiplier)
temp = mp.fsub(temp, mp.floor(temp))
temp = int(mp.floor(mp.fmul(temp, 10)))

print(temp)
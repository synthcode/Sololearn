dict = {"Chirp": "Bird", "Grr": "Lion", "Rawr": "Tiger", "Ssss": "Snake"}

noises = input().split()
for noise in noises:
    print(dict[noise] + ' ')
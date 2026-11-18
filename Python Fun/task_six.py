
sum = 0
countEvenNumbers = 0

for count in range (1, 11):

	score = int(input("Enter score: "))

	if (score % 2 == 0):
		sum = sum + score
		countEvenNumbers = countEvenNumbers + 1

average = sum / countEvenNumbers

print('average is', average)
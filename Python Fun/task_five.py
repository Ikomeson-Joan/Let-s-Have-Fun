
sum = 0

for count in range (1, 11):

	score = int(input("Enter score: "))

	if (score % 2 == 0):
		sum = sum + score
			

print('Sum is', sum)


count = 1
sum = 0

while (count <= 10):

	score = int(input("Enter score: "))

	if (score >= 0 and score <= 100):
		sum = sum + score
	count = count + 1
		
print('Sum is', sum)
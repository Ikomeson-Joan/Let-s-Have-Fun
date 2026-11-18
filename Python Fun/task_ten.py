count = 1
sum = 0
valid_score = 0


while (count <= 10):

	score = int(input("Enter score: "))

	if (score >= 0 and score <= 100):
		sum = sum + score
		valid_score = valid_score + 1
	count = count + 1
		
average = sum/valid_score
print("Average is", average)

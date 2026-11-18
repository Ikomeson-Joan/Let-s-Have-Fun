
import java.util.Scanner;
public class TaskSeven{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int count = 1;
		int sum = 0;
		int countEvenNumbers = 0;

		while (count <= 10) {

			System.out.print("Enter score: ");
			int score = sc.nextInt();

			if (score % 2 == 0){
				sum = sum + score;
				countEvenNumbers++;
			}
			
			count++;
		}

		double average = (double) sum/countEvenNumbers;
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + average);

	}

}
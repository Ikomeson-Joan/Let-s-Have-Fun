
import java.util.Scanner;
public class TaskNine{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int count = 1;
		int sum = 0;

		while (count <= 10) {

			System.out.print("Enter score: ");
			int score = sc.nextInt();

			if (score >= 0 && score <= 100){
				sum = sum + score;
			}

			count++;
		}

		System.out.println("Sum is " + sum);

	}

}
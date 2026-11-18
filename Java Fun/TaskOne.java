
import java.util.Scanner;
public class TaskOne{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int count = 1;
		int sum = 0;

		while (count <= 10) {

			System.out.print("Enter score: ");
			int score = sc.nextInt();

			sum = sum + score;
			count++;
		}

		System.out.println("Sum is " + sum);
		
	}

}
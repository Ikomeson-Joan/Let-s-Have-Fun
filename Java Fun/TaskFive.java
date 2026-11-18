
import java.util.Scanner;
public class TaskFive{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int count = 1;
		int sum = 0;

		while (count <= 10) {

			System.out.print("Enter score: ");
			int score = sc.nextInt();

			if (score % 2 == 0){
				sum = sum + score; 
			}
			
			count++;
		}

		System.out.println("Sum is " + sum);

	}

}
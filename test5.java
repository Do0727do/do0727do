import java.util.Scanner;

public class aaaaa{
	public static void main (String[] args) {
		int grade;
		Scanner input = new Scanner(System.in);
			System.out.println("Enter first integer:");
				grade = input.nextInt();

		if (grade >=90 & grade <=100) {
			System.out.println("a");
		}
		else if (grade >=80 & grade <=89) {
			System.out.println("b");
		}
		else if(grade >=70 & grade <=79) {
			System.out.println("c");
		}
		else if (grade >=60 & grade <=69) {
			System.out.println("d");
		}
		else{ 
			System.out.println("e");
		}	
	}
}			

				

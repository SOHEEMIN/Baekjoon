import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for(int j = 1; j <= i/4 ; j++){
			System.out.print("long ");
		}
		System.out.println("int");
		sc.close();
	}
}
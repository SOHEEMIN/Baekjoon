import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int count = sc.nextInt();
		int money = 0;
		int product = 0;
		int price = 0;

		for(int i = 1; i <=count ; i++){
			money = sc.nextInt();
			product = sc.nextInt();

			price += money * product;

		}
		if (price == total) {
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
	}
}
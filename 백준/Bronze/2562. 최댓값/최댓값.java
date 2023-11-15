import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int max = arr[0];
		int order = 0;

		for(int j = 0; j < arr.length; j++){
			arr[j] = sc.nextInt();

			if (arr[j] > max) {
				max = arr[j];
				order = j+1;
			}
		}
		System.out.println(max);
		System.out.println(order);
	}
}
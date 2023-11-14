import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int min = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
			if (arr[i] < min) {
				System.out.print(arr[i] + " ");
			}
		} 
	}
}
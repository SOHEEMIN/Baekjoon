import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int j = 0; j < n; j++){
			if (arr[j] > max) {
				max = arr[j];
			}else if (arr[j] < min) {
				min = arr[j];
			}
		}
		System.out.print(min+" ");
		System.out.println(max);
	}
}
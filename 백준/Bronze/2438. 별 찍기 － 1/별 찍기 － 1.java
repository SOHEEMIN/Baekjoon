import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

        for(int i = 1 ; i<=n; i++){
			for(int j = 1 ; j<=i; j++){
            System.out.print ("*");
			}
			System.out.println();
        }
	}
}

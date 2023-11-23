import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p = sc.next();
		sc.close();
		int len = p.length();
		int one = 1;

		StringBuilder sb = new StringBuilder(p);
		sb.reverse();

		for(int i = 0; i<len/2; i++){
			if (p.charAt(i) != sb.charAt(i)) {
				one = 0;
			}
		}
		System.out.println(one);
	}
}
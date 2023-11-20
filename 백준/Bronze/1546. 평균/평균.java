import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int subject = sc.nextInt();
		float max = 0;
		float avg = 0 ;
		float calculate = 0;
		int [] score = new int[subject];
		
		for(int i = 0 ; i < score.length ; i++){
			score[i] = sc.nextInt();
			if (max < score[i]) {
				max = score[i];
			}
		}
		for(int j = 0 ; j < score.length; j++){
			calculate += (score[j]/max)*100;
			avg = calculate/subject;
		}
		System.out.println(avg);
		sc.close();
	}
}
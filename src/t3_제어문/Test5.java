package t3_제어문;

import java.util.Scanner;

//점수가 60점 이상이면 합격, 60 점 미만이면 '불합격'
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		String res ="";
		
		System.out.print("점수를 입력하세요 :");
		score = sc.nextInt();
		
		if (score >= 90) {
			res ="A";
		}
		else if (score >= 80) {
			res = "B";
		}
		else if (score >= 70) {
			res = "C";
		}
		else if (score >= 60) {
			res = "D";
		}
		else {
			res ="f";
		}
		System.out.println("점수 "+score+"는 "+res+"입니다");
		
		
		
	
		
		sc.close();
		
	}

}

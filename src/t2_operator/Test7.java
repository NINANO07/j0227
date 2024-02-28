package t2_operator;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
	//점수가 90점 이상이면 A,80점 이상 '불학격'(String 변수)
		Scanner sc = new Scanner(System.in);
		
		int score ;
		char res;
		
		System.out.print("점수를 입력하세요 :");
		score =sc.nextInt();
		
		res = (score >=90 )? 'A' :(score >=80) ? 'B' : (score >=70) ? 'C' : (score >=60) ? 'D' : 'F' ;
		
		System.out.println("점수 "+score+"점은 "+res+"입니다");
		
		sc.close();
	}

}

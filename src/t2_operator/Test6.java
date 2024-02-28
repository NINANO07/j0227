package t2_operator;

import java.util.Scanner;

//점수가 60점 이상이면 합격, 60점 미만은 '불학격'(String 변수)
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		String res;
		
		System.out.print("점수를 입력하세요 :" );
		score =sc.nextInt(); 
		
		res = (score >=60 )? "합격" :"불합격";
		
		
		System.out.println("점수 "+score+"점은 "+res+"입니다");
		
		sc.close();
	}

}

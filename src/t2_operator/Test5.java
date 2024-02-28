package t2_operator;

//점수가 60점 이상이면 합격, 60점 미만은 '불학격'(String 변수)
public class Test5 {
	public static void main(String[] args) {
		int score = 40;
		String res = (score >=60 )? "합격" :"불합격";
		
		
		System.out.println("점수가 "+score+"점이면 "+res+"입니다");
		
	}

}

package t3_제어문;

import java.util.Scanner;

//입력받은 수가 양수, 음수 , 영인지 판별
public class Test6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		String str;
		
		System.out.print("====>숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num>0) str = "양수";
		else if(num<0) str = "음수";
		else str = "0";
		
		System.out.println("입력된 수 " + num + "는 "+str+"입니다");
				

		
		sc.close();
	
	}

}

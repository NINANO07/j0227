package t1_variable;

//실수 자료형(float(4byte), double(8byte)) 소숫점
public class Test4 {
	public static void main(String[] args) {
		double dd1, dd2;
		dd1 = 3.1415952;
		dd2 = 3.14159534839849832;
		System.out.println("dd1 :" + dd1);
		System.out.println("dd2 :" + dd2);
		System.out.println();
		
		float ff1, ff2;
		ff1 = 3.14f; //float 형은 f 뒤에 씀 (대소문자 관계 없음)
		ff2 = 3.14159534839849832f; //3.1415954까지 출력
		System.out.println("ff1 : " + ff1);
		System.out.println("ff2 : " + ff2);
		
		double dd3 = 5E3; //5 * 10의 3승
		System.out.println(dd3);
		 
		double dd4 = 5E-3; // 10의 마이너스 3승
		System.out.println(dd4);
		
	}

}

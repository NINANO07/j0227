package t1_variable;

//강제 타입 변환 (casting)
public class Test8 {
  public static void main(String[] args) {
		double su1 = 3.14;
		int res;
		
		// res =su1; double 형식을 int 형식에 넣으면 error
		
		//강제 형변환
		res = (int) su1;
		System.out.println("res :" +res); //3으로 출력 소숫점 탈락
		
	  short ss1 = 10, ss2;
	  int ii1 = 100;
	  
	  ii1 = ss1; //자동형변환
	  //ss1 = ii1; 에러
	  
	  ss1 = (short)ii1;
	  System.out.println("ss1 : " + ss1);
	  
	  int su = 1000000;
	  
	  System.out.println("su : " +su);

	  ss2 = (short) su;
	  System.out.println("ss2 :" +ss2); //16960 출력
  } 
}

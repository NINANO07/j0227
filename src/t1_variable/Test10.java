package t1_variable;

public class Test10 {
	public static void main(String[] args) {
		double res;
		double r = 10;
		
		res = r*r*3.14; 
		System.out.println("res :" +res);
		
		//res = 10/3.0; 출력값 3.3333333333333333
		//res = 10/3; 출력값 3
		res = (double) 10/3;
		System.out.println("2.res : " + res);
		
	}

}

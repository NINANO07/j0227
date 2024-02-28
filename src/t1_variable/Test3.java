package t1_variable;

//정수형 타입 (byte, char, short, int, long)
public class Test3 {
 public static void main(String[] args) {
	byte bb1, bb2;
	bb1= 127;  // Byte 타입의 수치 표현범위 : -128~127
	bb2= -128;
	
	System.out.println(bb1);
	System.out.println(bb2);
	System.out.println();
	
	short ss1 =128, ss2 = -129;
	System.out.println(ss1);
	System.out.println(ss2);
	
	short ss3 = 32000;
	System.out.println(ss3);
	System.out.println();
	int ii1 = 33000;
	System.out.println(ii1);
	System.out.println();
	
	int ii2 = 2100000000;
	System.out.println(ii2);
	System.out.println();
	long ll1 = 2200000000l; //long 타입은 대문자 소문자 상관없이 l 붙이기
	System.out.println(ll1);
	System.out.println();
  
	//char cc1 ='A';
  //System.out.printf("cc1 = %d\n", cc1);
  System.out.println();
  
  int cc2 ='A';
  System.out.println(cc2);
  int cc3 ='a';
  System.out.println(cc3);
	
  char cc4 = '한';
  System.out.println("cc4 : " +cc4);
  System.out.println();
  int cc5 = '한';
  System.out.println("cc5 : " +cc5);
  System.out.println();
  
  char cc6 = '\u0041'; //유니코드 
  System.out.println("cc6: " +cc6);
  
 }
}

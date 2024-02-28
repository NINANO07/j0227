package t1_variable;

public class Test6 {
	public static void main(String[] args) {
		String name, job, address, sign;
		
		name = "jun";
		job = "pilot";
		address = "seoul";
		sign ="!!!!";
		
		System.out.println(name + "의 직업은 " +job+ "이고 " +address+ "에 산다" +sign );
		System.out.println();
		System.out.println(name + "의 직업은 "+job+"이고 "+address+"에 산다" +sign);
		System.out.println();
		System.out.printf("%s의 직업은 %s이고 %s에 산다%s",name, job, address, sign);
		
	}

}

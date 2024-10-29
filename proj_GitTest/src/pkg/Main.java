package pkg;

public class Main {

	public static void main(String[] args) {
		
		Ref ref = new Ref();
		System.out.println(ref.mtd());
		System.out.println("OK!!");
		
		Test test = new Test();
		test.mtd();
		
	}
	
	public static void mtd() {
		
	}

}

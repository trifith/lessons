public class Exercise_8 {

	public void method_1(Exercise_8 myobj) {
		System.out.println(myobj);
	}
	public void method_2(Exercise_8 ex2) {
		this.method_1(ex2);
		ex2.method_1(ex2);
	}
	public static void main(String[] args) {
		Exercise_8 ex1 = new Exercise_8();
		ex1.method_2(ex1);
	}
}

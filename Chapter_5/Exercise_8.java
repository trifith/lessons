public class Exercise_8 {

	public void method_1(Object myobj) {
		System.out.println(myobj);
	}
	public void method_2(Object ex1) {
		this.method_1(ex1);
		ex1.method_1("string2");
	}
	public static void main(String[] args) {
		Exercise_8 ex1 = new Exercise_8();
		ex1.method_2(ex1);
	}
}

public class Exercise_7 {
	public static void main(String[] args) {
		Incrementable sf = new Incrementable();
		System.out.println(StaticTest.i);
		sf.increment();
		System.out.println(StaticTest.i);
	}
}

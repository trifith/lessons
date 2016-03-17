public class Exercise_8 {

	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		System.out.println("st3.i = " + st3.i);
		System.out.println("Executing Incrementable.increment()");
		Incrementable.increment();
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		System.out.println("st3.i = " + st3.i);
	}
}

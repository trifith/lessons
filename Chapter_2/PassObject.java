class Exercise_3 {
	float flt;
}

	public class PassObject {
		static void f(Exercise_3 y) {
			y.flt = 6.28f;
		}


	public static void main(String[] args) {
		Exercise_3 ex = new Exercise_3();
		ex.flt = 3.14f;
		System.out.println("ex.flt: " + ex.flt);
		f(ex);
		System.out.println("ex.flt: " + ex.flt);
	}
}

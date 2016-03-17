class DataOnly {
	int i;
	double d;
	boolean b;

	public static void main(String[] args) {
		DataOnly data = new DataOnly();
		data.i = 47;
		data.d = 1.1;
		data.b = false;
		System.out.println(data.i);
		System.out.println(data.d);
		System.out.println(data.b);
		System.out.println("Changing Variables for Ex 5");
		data.i = 999;
		data.d = 3.141592;
		data.b = true;
		System.out.println(data.i);
		System.out.println(data.d);
		System.out.println(data.b);
	}
}

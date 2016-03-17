public class Exercise_9 {
	boolean flag;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	
	public static void main(String[] args) {
		Exercise_9 myObject = new Exercise_9();
		myObject.flag = true;
		myObject.c = 'q';
		myObject.b = 1;
		myObject.s = 10;
		myObject.i = 100;
		myObject.l = 9999999999l;
		myObject.f = 1.0f;
		myObject.d = 2.0d;
		myObject.printVar(myObject.flag);
		myObject.printVar(myObject.c);
		myObject.printVar(myObject.b);
		myObject.printVar(myObject.s);
		myObject.printVar(myObject.i);
		myObject.printVar(myObject.l);
		myObject.printVar(myObject.f);
		myObject.printVar(myObject.d);
		myObject.printVar(false);
		myObject.printVar('x');
		myObject.printVar(2);
		myObject.printVar(11);
		myObject.printVar(256);
		myObject.printVar(Math.pow(2, 34));
		myObject.printVar(2.3);
		myObject.printVar(3.141592);
	}

	public void printVar(Object var) {
		System.out.println(var);
	}

}

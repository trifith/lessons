public class Exercise_2 {

	float f = .001f;
	public static void main (String[] args) {
		Exercise_2 ex1 = new Exercise_2();
		Exercise_2 ex2 = new Exercise_2();
		ex1.print();
		ex2.print();
		ex1.f = 3.141592f;
		ex2.f = 6.28f;
		ex1.print();
		ex2.print();
		ex1 = ex2;
		ex1.print();
		ex2.print();
		}
	public void print(){
		System.out.println(this);
		System.out.println(this.f);
		}
	}

public class Exercise_6{
	int storage(String s) {
		return s.length() * 2;
	}
	public static void main(String[] args) {
		Exercise_6 myObj = new Exercise_6();
		System.out.println(myObj.storage("A String"));
	}
}

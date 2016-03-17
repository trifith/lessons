class ATypeName {
	int myInt = 0;
	String myString = "The quick brown fox jumped over the lazy dogs.";

	public static void main(String[] args){
		ATypeName myType = new ATypeName();
		System.out.println(myType.myInt);
		System.out.println(myType.myString);
		System.out.println("Changing the variables");
		myType.myInt = 42;
		myType.myString = "Is the answer to life, the universe, and everything";
		System.out.println(myType.myInt);
		System.out.println(myType.myString);
	}
}

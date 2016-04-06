public class Dog {
	String name;
	String says;
	Dog(String name, String says){
	this.name = name;
	this.says = says;
	}
	Dog() {
		this("Ralph", "Bark");
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("Spot", "Ruff");
		Dog d2 = new Dog("Scruffy", "Wruf");
		Dog d3 = d1;
		System.out.println("Name: " + d1.name + " Says: " + d1.says);
		System.out.println("Name: " + d2.name + " Says: " + d2.says);
		System.out.println(d1 == d3);
		System.out.println(d1.equals(d3));
		}
}

public class Exercise_4 {

	public static void main(String[] args) {
		Double Distance = Double.parseDouble(args[0]);
		Double Time = Double.parseDouble(args[1]);
		Double Velocity = Distance / Time;
		System.out.println("The Velocity is: " + Velocity);
	}
}

public class Exercise_10 {

	public static void main(String[] args) {
		Integer endIn1 = 0x55555555;
		Integer endIn0 = 0xAAAAAAAA;
		System.out.println("endIn1: " + Integer.toBinaryString(endIn1));
		System.out.println("endIn0: " + Integer.toBinaryString(endIn0));
		System.out.println("endIn1 & endIn0: " + Integer.toBinaryString(endIn1 & endIn0));
		System.out.println("endIn0 & endIn1: " + Integer.toBinaryString(endIn0 & endIn1));
		System.out.println("endIn1 | endIn0: " + Integer.toBinaryString(endIn1 | endIn0));
		System.out.println("endIn0 | endIn1: " + Integer.toBinaryString(endIn0 | endIn1));
		System.out.println("endIn1 ^ endIn0: " + Integer.toBinaryString(endIn1 ^ endIn0));
		System.out.println("endIn0 ^ endIn1: " + Integer.toBinaryString(endIn0 ^ endIn1));
		System.out.println("~endIn1: " + Integer.toBinaryString(~endIn1));
		System.out.println("~endIn0: " + Integer.toBinaryString(~endIn0));
	}
}

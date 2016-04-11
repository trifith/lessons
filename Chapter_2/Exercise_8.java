public class Exercise_8 {

	public static void main(String[] args) {
		Long myHexLong = 0X93FL;
		Long myOctLong = 0475L;
		System.out.println("Hex Long: " + myHexLong  
				+ " " + Long.toBinaryString(myHexLong));
		System.out.println("Oct Long: " + myOctLong
				+ " " + Long.toBinaryString(myOctLong));
	}
}

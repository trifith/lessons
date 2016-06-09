public class Exercise_11 {

	public static void main(String[] args){
		Integer startWithOne = 0x5a1d23c1;
		System.out.println("startWithOne: " + startWithOne + " " + Integer.toBinaryString(startWithOne));
		Integer shifted = startWithOne;
		do {
			shifted = shifted >> 1;
			System.out.println("shifted: " + shifted + " " + Integer.toBinaryString(shifted) + " " + Integer.toHexString(shifted));
		} while(shifted != 0);


	}
}

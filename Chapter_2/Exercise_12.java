public class Exercise_12 {

	public static void main(String[] args){
		Integer startAllOnes = 0xFFFFFFFF;
		System.out.println("Starting with: " + startAllOnes + " " + Integer.toBinaryString(startAllOnes));
		Integer leftshifted = startAllOnes << 1;
		System.out.println("Left Shifted: " + leftshifted + " " + Integer.toBinaryString(leftshifted));
		Integer rightshifted = leftshifted;
		Integer signedRightshifted = leftshifted;
		Integer counter = 0;
		do {
			rightshifted = rightshifted >>> 1;
			signedRightshifted = signedRightshifted >> 1;
			System.out.println("Rightshifted: " + rightshifted + " " + Integer.toBinaryString(rightshifted));
			System.out.println("Signed Rightshifted: " + signedRightshifted + " " + Integer.toBinaryString(signedRightshifted));
			counter += 1;
		} while(counter < 32);

	}
}

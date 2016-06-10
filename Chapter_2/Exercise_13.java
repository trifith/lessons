public class Exercise_13 {

	public static void main(String[] args){
		char ch = 0;
		do{
		System.out.println("Character: " + ch + " " + String.format("%16s", Integer.toBinaryString(ch)).replace(" ", "0"));
		ch += 1;
		} while(ch < 255);


	}
}

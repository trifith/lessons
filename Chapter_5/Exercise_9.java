public class Exercise_9 {

	Exercise_9(){
		this("string1");
	}

	Exercise_9(String str){
		System.out.println(str);
	}

	public static void main(String[] args){
		Exercise_9 ex = new Exercise_9();
		Exercise_9 ex2 = new Exercise_9("string2");
	}
}

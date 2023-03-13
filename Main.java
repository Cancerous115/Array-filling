import java.util.Arrays;
class Main{
	public static void main(String[]args) {
		char vowels[]={'e','i','u','o','a'};
		//fill our arrays with 'x',start with 'e',end with a only changes would be 'i'-'o'.
		int startingIndex=1;
		int endingIndex=4;
		Arrays.fill(vowels,startingIndex,endingIndex,'x');

		System.out.println(Arrays.toString(vowels));
	}
}
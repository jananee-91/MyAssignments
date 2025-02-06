package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		int input = 12145;
		int sum=0;
		int rem;
		int temp = input;
		
		while(input>0) {
			//System.out.println(input);
			rem = input%10;
			input=input/10;
			sum = sum*10+rem;
			//System.out.println(output);
			}
			if(temp==sum) {
				System.out.println("Number is palindrome");
			}
			else {
				System.out.println("Number is not palindrome");
			}	
			
	
			
	}

}

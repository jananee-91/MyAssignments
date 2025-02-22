package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] c1 = test.toCharArray();
	
		for(int i=0; i<c1.length;i++) {
			if(i%2!=0) {
								c1[i]=Character.toUpperCase(c1[i]);
			}
			System.out.print(c1[i]);
			
		}
	}

}

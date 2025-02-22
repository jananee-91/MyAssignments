package week3.day2;

public class Button extends WebElement {
	
	public void submit() {
		System.out.println("Click on Submit button");
	}

	public static void main(String[] args) {
		
		Button b = new Button();
		b.submit();
		b.click();
		b.setText("Inheritance test");

	}

}

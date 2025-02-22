package week3.day2;

public class WebElement {
	
	public void click() {
		System.out.println("Click the Element");
	}
	
	public String setText(String text) {
		System.out.println("Set Text successfully");
		return text;
		
	}

	public static void main(String[] args) {
		WebElement we = new WebElement();
		we.click();
		String setText = we.setText("Hello World");
		System.out.println(setText);
	}

}

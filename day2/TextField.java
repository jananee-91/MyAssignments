package week3.day2;

public class TextField extends WebElement{
	
	public void getText() {
		System.out.println("Get the text");
	}

	public static void main(String[] args) {
		TextField t = new TextField();
		t.getText();
		t.click();
		t.setText("Text printed successfully");
	}

}

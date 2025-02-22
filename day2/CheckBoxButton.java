package week3.day2;

public class CheckBoxButton extends Button{
	
	public void clickCheckButton() {
		System.out.println("Click the Check Button");
	}
	
	public static void main(String[] args) {
		CheckBoxButton c = new CheckBoxButton();
		c.clickCheckButton();
		c.click();
		c.setText("Check box clicked successfully");
		c.submit();

	}

}

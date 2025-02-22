package week3.day2;

public class RadioButton extends Button{
	
	public void selectRadioButton() {
		System.out.println("Select radio button");
	}

	public static void main(String[] args) {
		RadioButton r = new RadioButton();
		r.selectRadioButton();
		r.click();
		r.setText("Radio Button clicked successfully");
		r.submit();
	
	}

}

package week3.day2;

public class Safari extends Browser{
	
	public void ReaderMode() {
		System.out.println("Reader mode");
}
	
	public void fullScreenMode() {
		System.out.println("Full Screen Mode");
	}

	public static void main(String[] args) {
		Safari s = new Safari();
		s.ReaderMode();
		s.fullScreenMode();
		s.openURL();
		s.closeBrowser();
		s.navigateBack();
	}

}

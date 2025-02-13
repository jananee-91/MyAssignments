package week2.day1;

public class Browser{
	
	public String launchBrowser(String br) {		
		return "browser launched successfully";
	}
	
	public void loadURL() {
		System.out.println("URL loaded successfully");
	}
	public static void main(String[] args) {
		Browser br = new Browser();
		String launchBrowser1 = br.launchBrowser("Chrome browser launched");
		System.out.println(launchBrowser1);
		//System.out.println(br.launchBrowser("Chrome browser launched"));
		br.loadURL();
	}

}

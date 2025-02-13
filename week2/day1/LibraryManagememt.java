package week2.day1;

public class LibraryManagememt {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		LibraryManagememt lm = new LibraryManagememt();
		String bookTitle = lm.addBook("Fault in the Stars");
		System.out.println(bookTitle);
		lm.issueBook();
		

		
	}

}

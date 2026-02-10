package package1;

public class Library {

	//Create method with return type String
	
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	//Create method with return type void
	
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an object for the class
		Library book=new Library();
		String book1 = book.addBook("Book Name : Harry potter");
		System.out.println(book1);
		book.issueBook();
	}

}

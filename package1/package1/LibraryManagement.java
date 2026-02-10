package package1;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object for class Library
		
		Library book2=new Library();
		String book=book2.addBook("Book Name:Kadalpura");
		System.out.println(book);
		book2.issueBook();
		

	}

}

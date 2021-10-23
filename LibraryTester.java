import java.util.*;
class LibraryTester{

	public static void main(String a[]){
	System.out.println("How many No of Books");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	
	Library lb = new Library(size);

	for(int i=0;i<size;i++){
	BookDTO dto = new BookDTO();
		System.out.println("Enter the Book Details");
		System.out.println();
		
		System.out.println("Enter the Id:");
			int bookId = sc.nextInt();
			dto.setBookId(bookId);
		
		System.out.println("Enter the Name:");
			String bookName = sc.next();	
			dto.setBookName(bookName);
			
		System.out.println("Enter the Price:");
			double bookPrice = sc.nextFloat();
			dto.setPrice(bookPrice);
			
		System.out.println("Enter the Author:");
			String bookAuthor = sc.next();
			dto.setAuthor(bookAuthor);
			
		System.out.println("Enter the Publisher");
			String bookPublisher = sc.next();
			dto.setPublisher(bookPublisher);
			
		System.out.println("Enter the Edition");
			String bookEdition = sc.next();
			dto.setEdition(bookEdition);
			
		boolean savedbook=lb.saveBooks(dto);
		System.out.println(savedbook);
		
	}
		
		lb.getBookById(2);
		System.out.println();
		lb.getAllBookDetails();
		System.out.println();
		
		lb.getBookNameByAuthor("William");
		System.out.println();
		lb.getAllBookDetails();
		System.out.println();
		
		lb.getPublisherNameByBookName("MyLife");
		System.out.println();
		lb.getAllBookDetails();
		System.out.println();
		
		lb.getBookIdByBookName("MyLife");
		System.out.println();
		lb.getAllBookDetails();
		System.out.println();
		
		lb.getAuthorByPrice(1589);
		System.out.println();
		lb.getAllBookDetails();
		System.out.println();
		
		lb.getEditionByPublisher("Priya");
		System.out.println();
		lb.getAllBookDetails();
		System.out.println();
		
		lb.updateAuthorNameByBookId("Aristlo",1);
		System.out.println();
		lb.getAllBookDetails();
		System.out.println();
		
	
	}


}
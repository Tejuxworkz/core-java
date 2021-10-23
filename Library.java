class Library{

	private BookDTO[] books;
	private int index;
	
	
	public Library(int size){
	books=new BookDTO[size];
	}

	public boolean saveBooks(BookDTO books){
	boolean savedBook=false;
		if(books!=null){
			this.books[index++]=books;
			savedBook=true;
		}
		else{
			System.out.println("Book not found");
			savedBook=false;
		}
	return savedBook;
	}
	
	
	
	public void getAllBookDetails(){
		for(int i=0;i<books.length;i++){
			System.out.println(books[i]);
		}
	}
	

	
	public BookDTO getBookById(int bookId){
	BookDTO dto=null;
		System.out.println("Inside getBookByID method");
		if(bookId!=0){
			for(int i=0;i<books.length;i++){
				if(books[i].getBookId()== bookId){
				System.out.println("ID to find the Book is :"+bookId);
				dto=books[i];
				System.out.println(dto);
				}
				else{
				System.out.println("Book cannot be found by this ID");
				}
			}
		}
	return dto;
	}
	
	public String getBookNameByAuthor(String author){
		String authorName = null;
		System.out.println("Inside the getBookNameByAuthor Method");
		if(author!=null){
			for(int i=0;i<books.length;i++){
				if(books[i].getAuthor().equals(author)){
				System.out.println("Author to find the BookName :"+author);
				authorName=books[i].getBookName();
				System.out.println(authorName);
				}
				else{
					System.out.println("Book not found by this Author");
				}
			}
		}	
	return authorName;
	}
	
	public String getPublisherNameByBookName(String book){
		String bookName = null;
		System.out.println("Inside the getPublisherNameByBookName Method");
		if(book!=null){
			for(int i=0;i<books.length;i++){
				if(books[i].getBookName().equals(book)){
				System.out.println("BookName to find the publisher :"+book);
				bookName=books[i].getPublisher();
				System.out.println(bookName);
				}
				else{
					System.out.println("Book not found by this Publish");
				}
			}
		}	
	return bookName;
	}
	
	
	public BookDTO getBookIdByBookName(String book){
		BookDTO dto = null;
		System.out.println("Inside the getBookIdByBookName Method");
		if(book!=null){
			for(int i=0;i<books.length;i++){
				if(books[i].getBookName().equals(book)){
					System.out.println("BookId can be found by Book Name is : "+book);
					dto=books[i];
					System.out.println(dto);
				}
				else {
					System.out.println("BookId cannot be found by Book Name");
				}
			}
		}
		return dto;
	}
	
	public String getAuthorByPrice(double price){
		String authorName=null;
		System.out.println("Inside getAuthorByPrice Method");
		if(price!=0){
			for(int i=0;i<books.length;i++){
				if(books[i].getPrice()==price){
				System.out.println("Author can by this Price is "+price);
				authorName=books[i].getAuthor();
				System.out.println(authorName);
				}
				else{
					System.out.println("Author cannot found by this price book");
				}
			}
		}
	return authorName;
	}
	
	public String getEditionByPublisher(String publisher){
		String edition=null;
		System.out.println("Inside getEditionByPublisher Method");
		if(publisher!=null){
			for(int i=0;i<books.length;i++){
				if(books[i].getPublisher().equals(publisher)){
					System.out.println("Edition By this Publisher "+publisher);
					edition=books[i].getEdition();
					System.out.println(edition);
				}
				else{
					System.out.println("Edition not be found by this Publisher");
				}
			}
		}
	return edition;
	}
	
	public boolean updateAuthorNameByBookId(String authorName,int bookId){
		boolean update=false;
		if(authorName!=null && bookId>0){
			for(int i=0;i<books.length;i++){
				if(books[i].getBookId()==bookId){
					System.out.println("Updateing the author Name by this bookId "+bookId);
					books[i].setAuthor(authorName);
				}
				else{
					System.out.println("AuthorName Cannot be Updated");
				}
			}	
		}
	return update;
	}

	
}
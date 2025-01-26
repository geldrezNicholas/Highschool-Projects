package assignments;

public class Book {

	public String referenceNumber;
	public String title;
	public String author;

	// Default Constructor
	public Book() {
			
		this.referenceNumber = "";
		this.title = "";
		this.author = "";
		
	}
	// Parameterized Constructor
	public Book(String r, String t, String a) {
		
		this.referenceNumber = r;
		this.title = t;
		this.author = a;
	
	}
	
	public String getReferenceNum() {
		
		return this.referenceNumber;
		
	}
	
	public String getTitle() {
		
		return this.title;
		
	}
	
	public String getAuthor() {
		
		return this.author;
		
	}
	
	public void setReferenceNum(String r) {
		
		this.referenceNumber = r;
		
	}
	
	public void setTitle(String t) {
		
		this.title = t;
		
	}
	
	public void setAuthor(String a) {
		
		this.author = a;
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "." + this.referenceNumber + "." + this.title + "." + this.author;
				
	}
}

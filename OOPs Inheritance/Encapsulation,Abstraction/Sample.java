
class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName(String name) {
		return name;
	}
	public String getEmail(String email) {
		return email;
	}
	public char getGender(char gender) {
		return gender;
	}
	@Override
	public String toString() {
		return "[Name : "+name+ ", Email : "+email+", Gender : "+gender+"]";
	}
}

class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String name, Author author, double price, int qtyInStock)
	{
		this.name=name;
		this.author= author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getQtyIntStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	@Override
	public String toString() {
		return "Book Name: "+name+", Author"+author+", Price:"+price+", QtyInStock: "+qtyInStock;
	}
}
public class Sample{
	public static void main(String[] args)
	{
		Author author = new Author("ABC","abc@gmail.com",'M');
		Book book = new Book("XYZ", author, 200.00, 20);
		System.out.println(book);
	}
}


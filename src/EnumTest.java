import java.util.EnumSet;

public class EnumTest {

	public static void main(String[] args) {
		System.out.println("All books");
		
		for(Book book: Book.values()) {
			System.out.printf("%-10s%-45s%s%n", book, 
					book.getTitle(),
					book.getPublishedYear());
		}
		System.out.println("%n enum constants%n");
		
		for(Book book: EnumSet.range(Book.JHTP,  Book.AAMT)) {
			System.out.printf("%-10s%-45s%s%n", book, 
					book.getTitle(),
					book.getPublishedYear());
		}
		

	}

}


public enum Book {
	
	JHTP("Java How to Program", "2018"),
	MSFM("Man's search for meaning", "1946"),
	AAMT("As a man thinketh", "1903"),
	CHTP("C How to Program", 2002),
	TCBS("I know why the caged bird sings", "1969");

	private final String title;
	private final String publishedYear;
	
	Book(String title, String yearPublished){
		this.title = title;
		this.publishedYear = yearPublished;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getPublishedYear() {
		return publishedYear;
	}
}

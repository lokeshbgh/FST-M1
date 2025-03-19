package fsthello;

abstract public class Book {
	
	String title;
	
	abstract public void setTitle(String a);
	
	public String getTitle() {
		return this.title;
	}
}
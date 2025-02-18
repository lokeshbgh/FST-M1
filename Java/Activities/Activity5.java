package activities;


abstract class Book {
	String title;
	//Abstract Method 
	abstract void setTitle(String s);
	
	//Concrete Method
	String getTitle() {
		return title;
	}
	
}

 class MyBook extends Book {
	public void setTitle(String s){
		title = s;
	}

}
public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBook newNovel = new MyBook();
		String title = "The Hindden Hindu"; 
		newNovel.setTitle(title);
		
		System.out.println("The Title of the Book is: " + newNovel.getTitle());
		
		
	}

}


public class Book {

 

		String title; boolean borrowed;

		public Book(String bookTitle) {

		title=bookTitle;

		}

		public void rented() {

		borrowed=true;

		}

		public void returned() {

		borrowed=false;

		}

		public boolean isBorrowed() {

		return borrowed;

		}

		public String getTitle() {// Implement this method

		return title;

		}

		public static void main(String[] arguments) {

		Book bk=new Book("The Da Vinci Code");

		bk1.new Book("oops");

		System.out.println("Title: " + bk.getTitle());

		System.out.println("Borrowed? : " + bk.isBorrowed());

		bk.rented();

		System.out.println("Borrowed? : " + bk.isBorrowed());

		bk.returned();

		System.out.println("Borrowed?: " + bk.isBorrowed());

		}

	}



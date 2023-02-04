class MyBook extends Book {

	private int price;
	MyBook(String title, String author,int price) {
		super(title, author);
		this.price = price;
	}
	@Override
	void display() {
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("Price: "+ price);
	}

}

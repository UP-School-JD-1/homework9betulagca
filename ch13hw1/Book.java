package ch13hw1;
public class Book {
    Author author;
    String title;
    BookType type;
    int currentPage;

    public Book(Author author, String title, BookType type, int currentPage) {
        this.author = author;
        this.title = title;
        this.type = type;
        this.currentPage = currentPage;
        
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type.getDescription();
    }

    public void setType(BookType type) {
        this.type = type;
    }
    
    public int getPage() {
		return currentPage;
	}

	public void setPage(int page) {
		this.currentPage = page;
	}

    public void getInfo() {
        System.out.println("Book: " + author.name + " , " + title + " , " + type.getDescription() + " , " + currentPage);
    }
}
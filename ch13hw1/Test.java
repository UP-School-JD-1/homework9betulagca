package ch13hw1;
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.printBookTypes();
        test.changeBookTypes();
        test.printBookTypes();
        System.out.println();

        Reader reader = new Reader("Betul","Agca", 25, 'K');
        reader.getInfo();

        Author author = new Author("Oguz Atay");
        author.getInfo();

        Book book = new Book(author, "Tutunamayanlar", BookType.CLASSICS, 724);
        book.getInfo();

    }

    private void changeBookTypes() {
        System.out.println("Changing.....");
        BookType.ADVENTURE.setDescription("ADVENTURE");
        BookType.FANTASY.setDescription("FANTASY");
        BookType.NONFICTION.setDescription("NONFICTION");
        BookType.CLASSICS.setDescription("CLASSICS");
        BookType.HORROR.setDescription("HORROR");
    }

    public void printBookTypes() {
        System.out.print("Book Types : ");

        for (BookType bookType : BookType.values()) {
            System.out.print(bookType.getDescription() + ", ");
        }
        System.out.println();
    }

}
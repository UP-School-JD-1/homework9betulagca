package p2ch9hw2;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BookComparator {
    public static void main(String[] args) {
        Book book1 = new Book("Şeker Portakalı", "Jose", "Vasconcelos", 183);
        Book book2 = new Book("Tehlikeli Oyunlar", "Oguz", "Atay", 479);
       
        Comparator<Book> comparatorByPageNumber = (b1, b2) -> b1.getPages() - b2.getPages();

        BinaryOperator<Book> maxPageNumberOperator = BinaryOperator.maxBy(comparatorByPageNumber);

        System.out.println("\n--- Comparing " + book1.getPages() + " and " + book2.getPages() + " ---");
        System.out.println("Max page number -> " + maxPageNumberOperator.apply(book1, book2).getPages());
       
    }
}
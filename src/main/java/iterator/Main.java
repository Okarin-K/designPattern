package iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("裏バイト:逃亡禁止"));
        bookShelf.appendBook(new Book("王様達のヴァイキング"));
        bookShelf.appendBook(new Book("5分後の世界"));
        bookShelf.appendBook(new Book("Java言語で学ぶデザインパターン入門"));

        Iterator iterator = bookShelf.iterator();

        while (iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Name", "Author", "Text");
        Print print = new Print(book);
        print.PrintText();
    }

}

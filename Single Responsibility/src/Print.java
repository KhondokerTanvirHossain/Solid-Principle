public class Print {
    private Book book;

    public Print(Book book) {
        this.book = book;
    }
    void PrintText(){
        System.out.println(book.getText());
    }
}

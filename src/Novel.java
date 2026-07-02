public class Novel extends BookClass{
    private String bookLanguage;
    private int bookPages;
    public Novel(){}

    public Novel(String bookTitle, String bookAuthor, String bookPublisher,String bookLanguage,int bookPages){
        super(bookTitle, bookAuthor, bookPublisher);
        this.bookLanguage=bookLanguage;
        this.bookPages=bookPages;

    }


    public void setBookLanguage(String bookLanguage) {
        this.bookLanguage = bookLanguage;
    }

    public void setPages(int pages) {
        this.bookPages = pages;
    }

    public int getPages() {
        return bookPages;
    }

    public String getBookLanguage() {
        return bookLanguage;
    }

    @Override
    public String toString() {
        return "\nBook title:" + super.getBookTitle() + "\nBook author is : " + super.getBookAuthor() +
                "\nBook Publisher:" + super.getBookPublisher() +"\nLanguage:"+bookLanguage+"Pages:" + bookPages ;}
}

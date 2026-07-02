public abstract class BookClass extends Library {

    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;

    public BookClass(){}

    public BookClass(String bookTitle, String bookAuthor, String bookPublisher)// used to contain the information
    {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;


    }

    //setter
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }



    //getter
    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }



    public String toString(){return "Book Title: "+bookTitle+"Author:"+bookAuthor+"Publisher:"+bookPublisher;}
}
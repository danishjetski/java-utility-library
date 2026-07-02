public class ComicBook extends BookClass {
    private double bookPrice;
    private String bookCountry;
    public ComicBook(){}

    public ComicBook(String bookTitle, String bookAuthor, String bookPublisher, double bookPrice, String bookCountry) {
        super(bookTitle, bookAuthor, bookPublisher);
        this.bookPrice = bookPrice;
        this.bookCountry = bookCountry;
    }
//setters

    public void setPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setBookCountry(String bookCountry) {
        this.bookCountry = bookCountry;
    }
//getters

    public Double getPrice() {
        return bookPrice;
    }

    public String getBookCountry() {
        return bookCountry;
    }


    public String toString() {
        return "\nBook title:" + super.getBookTitle() + "\nBook author is : " + super.getBookAuthor() +
                "\nBook Publisher:" + super.getBookPublisher() + "\nBook price: " + bookPrice + "\nBook Country:" + bookCountry;
    }
}




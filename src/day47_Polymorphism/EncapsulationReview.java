package day47_Polymorphism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishedDate;

    public EncapsulationReview(String bookTitle, String publishedDate) {
        setBookTitle(bookTitle);
        this.publishedDate = publishedDate;//we can not use 'set' because it is 'final'
    }

    public String getBookTitle() {//we can give condition in the getter method as well
        if (bookTitle == null) {
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle == null || bookTitle.isEmpty()) {
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishedDate() {
        return publishedDate;
    }
}

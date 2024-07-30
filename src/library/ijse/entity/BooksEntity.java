package library.ijse.entity;

public class BooksEntity {
    private Integer book_id;
    private String title;
    private String author;
    private String isbn;
    private Integer catagory_id;

    public BooksEntity(){

    }

    public BooksEntity(Integer book_id, String title, String author, String isbn, Integer catagory_id) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.catagory_id = catagory_id;

   }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getCatagory_id() {
        return catagory_id;
    }

    public void setCatagory_id(Integer catagory_id) {
        this.catagory_id = catagory_id;
    }

    @Override
    public String toString() {
        return "BooksEntity [book_id=" + book_id + ", title=" + title + ", author=" + author + ", isbn=" + isbn
                + ", catagory_id=" + catagory_id + "]";
    }

   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.ijse.dto;

/**
 *
 * @author laksh
 */
public class BooksDto {
    private Integer book_id;
    private String title;
    private String author;
    private String isbn;
    private Integer catagory_id;

    public BooksDto() {
    }

    public BooksDto(Integer book_id, String title, String author, String isbn, Integer catagory_id) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.catagory_id = catagory_id;
    }

    /**
     * @return the book_id
     */
    public Integer getBook_id() {
        return book_id;
    }

    /**
     * @param book_id the book_id to set
     */
    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the catagory_id
     */
    public Integer getCatagory_id() {
        return catagory_id;
    }

    /**
     * @param catagory_id the catagory_id to set
     */
    public void setCatagory_id(Integer catagory_id) {
        this.catagory_id = catagory_id;
    }
    
   
    
}

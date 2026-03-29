package com.example.model;

import java.math.BigDecimal;

public class Ebook extends DigitalProduct {
    private String author;
    private int pageCount;
    private String isbn;

    public Ebook() {}

    public Ebook(Long id, String name, String description, BigDecimal price, String author, int pageCount) {
        super(id, name, description, price);
        this.author = author;
        this.pageCount = pageCount;
        setFileFormat("PDF");
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public int getPageCount() { return pageCount; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
}

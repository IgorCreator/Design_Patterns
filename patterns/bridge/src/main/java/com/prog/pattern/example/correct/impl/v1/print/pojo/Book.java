package com.prog.pattern.example.correct.impl.v1.print.pojo;

import java.math.BigInteger;
import java.time.LocalDate;

public class Book {

    private String author;
    private String name;
    private LocalDate creationDate;
    private BigInteger pages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public BigInteger getPages() {
        return pages;
    }

    public void setPages(BigInteger pages) {
        this.pages = pages;
    }
}

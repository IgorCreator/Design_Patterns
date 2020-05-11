package com.prog.pattern.example.correct.impl.v1.print.printer;

import com.prog.pattern.example.correct.impl.v1.print.pojo.Book;

import java.util.ArrayList;
import java.util.List;

public class BookPrinter extends Printer {

    private Book book;

    public BookPrinter(Book book) {
        this.book = book;
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(new Detail("Author", book.getAuthor()));
        details.add(new Detail("Year", book.getName()));
        details.add(new Detail("Creation Date", book.getCreationDate().toString()));
        details.add(new Detail("Pages", book.getPages().toString()));

        return details;
    }

    @Override
    protected String getHeader() {
        return "Book";
    }
}

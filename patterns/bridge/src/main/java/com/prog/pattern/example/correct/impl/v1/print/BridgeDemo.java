package com.prog.pattern.example.correct.impl.v1.print;

import com.prog.pattern.example.correct.impl.v1.print.foramatter.Formatter;
import com.prog.pattern.example.correct.impl.v1.print.foramatter.HtmlFormatter;
import com.prog.pattern.example.correct.impl.v1.print.foramatter.JsonFormatter;
import com.prog.pattern.example.correct.impl.v1.print.foramatter.PrintFormatter;
import com.prog.pattern.example.correct.impl.v1.print.pojo.Book;
import com.prog.pattern.example.correct.impl.v1.print.pojo.Movie;
import com.prog.pattern.example.correct.impl.v1.print.printer.BookPrinter;
import com.prog.pattern.example.correct.impl.v1.print.printer.MoviePrinter;
import com.prog.pattern.example.correct.impl.v1.print.printer.Printer;

import java.math.BigInteger;
import java.time.LocalDate;

public class BridgeDemo {

    public static void main(String[] args) {
        Movie movie = createMockMovie();
        Book book = createMockBook();

        Printer moviePrinter = new MoviePrinter(movie);
        Printer bookPrinter = new BookPrinter(book);

        Formatter printFormatter = new PrintFormatter();
        Formatter htmlFormatter = new HtmlFormatter();
        Formatter jsonFormatter = new JsonFormatter();

		printOutput(moviePrinter, printFormatter, htmlFormatter, jsonFormatter);
		printOutput(bookPrinter, printFormatter, htmlFormatter, jsonFormatter);
	}

	private static void printOutput(Printer printer, Formatter simpleFormatter, Formatter htmlStyle, Formatter jsonStyle) {
		System.out.println("\nSimple printing:\n" + printer.print(simpleFormatter));
		System.out.println("\nHTML printing:\n" + printer.print(htmlStyle));
		System.out.println("\nJson printing:\n" + printer.print(jsonStyle));
	}

	private static Book createMockBook() {
        Book book = new Book();
        book.setAuthor("Gang of Four");
        book.setName("Design Patterns");

        LocalDate date = LocalDate.of(1996, 2, 20);
        book.setCreationDate(date);
        book.setPages(BigInteger.valueOf(404));
        return book;

    }


    private static Movie createMockMovie() {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");
        return movie;
    }

}

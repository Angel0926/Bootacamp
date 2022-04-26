package HomeWorks.Creational_DP_HMW.ImmutableDesignPattern;

import java.time.LocalDate;
import java.util.Objects;

public class BookBuilder {
    private String code;
    private String title;
    private  String genre;
    private Author author;
    private LocalDate publishingYear;
    private    String description;

    public BookBuilder setCode(String code) {
        this.code = code;
        return this;
    }

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public BookBuilder setAuthor(Author author) {
        this.author = author;
        return this;
    }

    public BookBuilder setPublishingYear(LocalDate publishingYear) {
        this.publishingYear = publishingYear;
        return this;
    }

    public BookBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public Book build() {
return new Book(code,title, genre, author, publishingYear, description);
    }
}

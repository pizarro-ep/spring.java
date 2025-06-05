package com.zero.spring.sce_java.models.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.zero.spring.sce_java.models.Book;

import lombok.Data;

@Data
public class BookDTO {
    private Integer id;
    private String title;
    private String editorial;
    private String genre;
    private BigDecimal price;
    private LocalDate editionDate;
    private AuthorDTO authorDTO;

    public BookDTO(Book book) {
        this.id = book.getId();
        this.title = book.getTitle();
        this.editorial = book.getEditorial();
        this.genre = book.getGenre();
        this.price = book.getPrice();
        this.editionDate = book.getEditionDate();
        this.authorDTO = new AuthorDTO(book.getAuthor());
    }

}

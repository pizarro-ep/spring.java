package com.zero.spring.sce_java.models.dto;

import com.zero.spring.sce_java.models.Author;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorDTO {
    private Integer id;
    private String name, surnames, phone;

    public AuthorDTO(Author author) {
        this.id = author.getId();
        this.name = author.getName();
        this.surnames = author.getSurnames();
        this.phone = author.getPhone();
    }

}

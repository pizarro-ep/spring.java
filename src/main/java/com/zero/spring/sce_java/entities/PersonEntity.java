package com.zero.spring.sce_java.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons") // Para casos donde la tabla no tiene el mismo nombre que la clase
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name, surnames;

    @Column(name = "languages") // Para casos donde la columna no tiene el mismo nombre que el atributo
    private String language;

    public PersonEntity() {
    }

    public PersonEntity(Long id, String name, String surnames, String language) {
        this.id = id;
        this.name = name;
        this.surnames = surnames;
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + ", surnames=" + surnames + ", language=" + language + "]";
    }

}

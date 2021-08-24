package com.example.bookmaneger.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nameBook;

    @Column(nullable = false)
    private Integer pages;

    @Column(nullable = false)
    private Integer capitulos;

    @Column(nullable = false)
    private String isbn;

    @Column(nullable = false, unique = true)
    private String editora;

    @ManyToOne(fetch = FetchType.LAZY, cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name="autor_id")
    private  Autor autor;
}

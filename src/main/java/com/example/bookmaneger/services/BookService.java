package com.example.bookmaneger.services;

import com.example.bookmaneger.dto.MessageResponseDTO;
import com.example.bookmaneger.entity.Book;
import com.example.bookmaneger.repository.Bookrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private Bookrepository bookrepository;

    @Autowired
    public BookService(Bookrepository bookrepository) {
        this.bookrepository = bookrepository;
    }

    @PostMapping
    public MessageResponseDTO create( Book book){
        Book livroSalvo= bookrepository.save(book);
        return MessageResponseDTO.builder().message("Livro criado com ID "+ livroSalvo.getId()).build();
    }
}

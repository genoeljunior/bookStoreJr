package repository;

import com.example.bookmaneger.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookrepository extends JpaRepository<Book, Long> {
}

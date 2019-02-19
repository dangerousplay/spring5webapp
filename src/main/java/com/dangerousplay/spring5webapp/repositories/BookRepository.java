package com.dangerousplay.spring5webapp.repositories;

import com.dangerousplay.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {


}

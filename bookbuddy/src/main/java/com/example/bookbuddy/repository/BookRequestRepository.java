package com.example.bookbuddy.repository;

import com.example.bookbuddy.model.BookRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRequestRepository extends JpaRepository<BookRequest, Long> {
}

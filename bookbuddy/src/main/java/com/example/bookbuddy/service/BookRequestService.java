package com.example.bookbuddy.service;

import com.example.bookbuddy.model.BookRequest;
import com.example.bookbuddy.repository.BookRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookRequestService {

    @Autowired
    private BookRequestRepository repository;

    public BookRequest saveRequest(BookRequest request) {
        return repository.save(request);
    }

    public List<BookRequest> getAllRequests() {
        return repository.findAll();
    }

    public BookRequest approveRequest(Long id) {
        BookRequest req = repository.findById(id).orElse(null);
        if (req != null) {
            req.setStatus("APPROVED");
            repository.save(req);
        }
        return req;
    }
    public boolean deleteRequest(Long id) {
        Optional<BookRequest> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

}

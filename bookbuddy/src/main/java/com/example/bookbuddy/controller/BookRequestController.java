package com.example.bookbuddy.controller;

import com.example.bookbuddy.model.BookRequest;
import com.example.bookbuddy.service.BookRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5566")
@RestController
@RequestMapping("/api/request")
public class BookRequestController {

    @Autowired
    private BookRequestService service;

    @PostMapping
    public BookRequest submitRequest(@RequestBody BookRequest request) {
        return service.saveRequest(request);
    }

    @GetMapping
    public List<BookRequest> getAll() {
        return service.getAllRequests();
    }

    @PutMapping("/{id}/approve")
    public BookRequest approve(@PathVariable Long id) {
        return service.approveRequest(id);
    }

    @DeleteMapping("/{id}")
    public String deleteRequest(@PathVariable Long id) {
        boolean deleted = service.deleteRequest(id);
        if (deleted) {
            return "Request denied and deleted successfully.";
        } else {
            return "Request not found.";
        }
    }
}

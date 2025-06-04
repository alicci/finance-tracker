package com.example.finance_tracker;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class TransactionController {

    private final TransactionService service;

    @GetMapping
    public List<Transaction> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ResponseEntity<Transaction> add(@RequestBody Transaction t) {
        Transaction saved = service.add(t);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}

package com.example.finance_tracker;

import lombok.RequiredArgsConstructor;
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
    public Transaction add(@RequestBody Transaction t) {
        return service.add(t);
    }
}

package com.example.finance_tracker;

import com.example.finance_tracker.Transaction;
import com.example.finance_tracker.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository repo;

    public List<Transaction> getAll() {
        return repo.findAll();
    }

    public Transaction add(Transaction t) {
        return repo.save(t);
    }
}

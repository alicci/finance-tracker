package com.example.finance_tracker;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public List<Transaction> getAll() {
        return transactionRepository.findAll();
    }

    public Transaction add(Transaction t) {
        return transactionRepository.save(t);
    }
}

package by.ganevich.service;

import by.ganevich.entity.Transaction;
import by.ganevich.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public List<Transaction> readAll() {
        List<Transaction> transactions = transactionRepository.findAll();
        log.info("The list of all transactions in successfully read.");
        return transactions;
    }

    public Transaction save(Transaction transaction) {
        Transaction savedTransaction = transactionRepository.save(transaction);
        log.info("Transactions is saved");
        return savedTransaction;
    }
}

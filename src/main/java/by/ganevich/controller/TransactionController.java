package by.ganevich.controller;

import by.ganevich.entity.Transaction;
import by.ganevich.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping(value = "/transactions")
    public ResponseEntity<List<Transaction>> readAllOfAccount() {
        List<Transaction> transactions = transactionService.readAll();
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }
}

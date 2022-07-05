package by.ganevich.kafka;

import by.ganevich.dto.TransactionDto;
import by.ganevich.entity.Transaction;
import by.ganevich.service.TransactionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@EnableKafka
@Component
@AllArgsConstructor
@Slf4j
public class Consumer {
    private final TransactionService transactionService;

    @KafkaListener(topics = "messages", groupId = "group_id")
    public void consume(TransactionDto transactionDto) {
        Transaction transaction = new Transaction();
        transaction.setTransactionDto(transactionDto);
        transactionService.save(transaction);
    }
}

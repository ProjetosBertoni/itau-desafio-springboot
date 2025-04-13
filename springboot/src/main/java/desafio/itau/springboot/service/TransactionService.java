package desafio.itau.springboot.service;

import desafio.itau.springboot.model.Transaction;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

@Service
public class TransactionService {
    private final Queue<Transaction> transactions = new ConcurrentLinkedDeque<>();

    public void addTransction(Transaction transaction){
        transactions.add(transaction);
    }

    public void clearTrasaction(){
        transactions.clear();
    }

    public DoubleSummaryStatistics getStatistics(){
        OffsetDateTime now = OffsetDateTime.now();
        return transactions.stream()
                .filter(t -> t.getDateHora().isAfter(now.minusMinutes(60)))
                .mapToDouble(Transaction::getValor)
                .summaryStatistics();
    }


}

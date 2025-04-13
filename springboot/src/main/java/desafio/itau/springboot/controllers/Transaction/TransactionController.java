package desafio.itau.springboot.controllers.Transaction;


import desafio.itau.springboot.dto.TransactionRequest;
import desafio.itau.springboot.model.Transaction;
import desafio.itau.springboot.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/transacao")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<Void> createTransaction(@RequestBody @Valid TransactionRequest request){
        if (request.getDateHora().isAfter(OffsetDateTime.now()) || request.getValor() <= 0){
            return ResponseEntity.unprocessableEntity().build();
        }
        transactionService.addTransction(new Transaction(request.getValor(), request.getDateHora()));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> clearTransction(){
        transactionService.clearTrasaction();
        return ResponseEntity.ok().build();
    }





}

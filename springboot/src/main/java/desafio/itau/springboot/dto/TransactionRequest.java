package desafio.itau.springboot.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactionRequest {
    @NotNull
    private Double valor;

    @NotNull
    private OffsetDateTime dateHora;

    public OffsetDateTime getDateHora() {
        return dateHora;
    }

    public Double getValor() {
        return valor;
    }
}

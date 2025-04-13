package desafio.itau.springboot.model;

import java.time.OffsetDateTime;

public class Transaction {
    private double valor;
    private OffsetDateTime dateHora;

    public Transaction(double valor, OffsetDateTime dateHora){
        this.valor = valor;
        this.dateHora = dateHora;

    }

    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDateHora() {
        return dateHora;
    }
}

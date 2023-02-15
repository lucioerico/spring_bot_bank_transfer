package itau.canais.api.dto;

import itau.canais.api.entities.Conta;

import java.math.BigDecimal;

public record DadosListagemContas(
        Long id,
        String cpf,
        String agencia,
        String nconta,
        BigDecimal saldo) {

    public DadosListagemContas(Conta conta){
        this(conta.getId(), conta.getCpf(), conta.getAgencia(), conta.getNconta(), conta.getSaldo());
    }
}

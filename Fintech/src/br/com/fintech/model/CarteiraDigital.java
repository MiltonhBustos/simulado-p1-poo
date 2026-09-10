package br.com.fintech.model;

import java.util.List;

public class CarteiraDigital {
    private String codigoCarteira;
    private int capacidadeMaximaTransacoes;
    private List<Transacao> transacoes;

    //construtor
    public CarteiraDigital(String codigoCarteira, int capacidadeMaximaTransacoes, List<Transacao> transacoes) {
        this.codigoCarteira = codigoCarteira;
        this.capacidadeMaximaTransacoes = capacidadeMaximaTransacoes;
        this.transacoes = transacoes;
    }
/* 
    public void adicionarTransacao(Transacao transacao) throws LimiteTransacoesExcedidoException{
        if(capacidadeMaximaTransacoes){
            throw new LimiteTransacoesExcedidoException("Capacidade de Transacoes excedida");
        }
        this.add(transacao);
    }
*/
    

    //get
    public String getCodigoCarteira() {
        return codigoCarteira;
    }
    public int getCapacidadeMaximaTransacoes() {
        return capacidadeMaximaTransacoes;
    }
    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}

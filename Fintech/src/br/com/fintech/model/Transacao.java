package br.com.fintech.model;

public class Transacao {
    private String idTransacao;
    private String tipo;
    private double valor;
    private double tarifa;

    //construtor
    public Transacao(String idTransacao, String tipo, double valor, double tarifa) {

        if(idTransacao == null || idTransacao.trim().isEmpty()){
            throw new IllegalArgumentException("ID de transacao nao pode ser nulo ou vazio.");
        }

        this.idTransacao = idTransacao;
        this.tipo = tipo;
        this.valor = valor;
        this.tarifa = tarifa;
    }

    //tostring
    @Override
    public String toString() {
        return "Transacao [id=<idTransacao>, tipo=<tipo>, valor=R$ <valor>, tarifa=R$ <tarifa>]";
    }

    //get e set
    public String getIdTransacao() {
        return idTransacao;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getTarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idTransacao == null) ? 0 : idTransacao.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        long temp;
        temp = Double.doubleToLongBits(valor);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tarifa);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Transacao other = (Transacao) obj;
        if (idTransacao == null) {
            if (other.idTransacao != null)
                return false;
        } else if (!idTransacao.equals(other.idTransacao))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        if (Double.doubleToLongBits(tarifa) != Double.doubleToLongBits(other.tarifa))
            return false;
        return true;
    }

    
}

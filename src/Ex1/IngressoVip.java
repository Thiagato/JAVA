package Ex1;

public class IngressoVip extends Ingresso{
    private Double valorAdicional;

//primitivo = minusculo = 0 (bool = false) (int && double = 0)
    public Double getValorAdicional() {
        return valorAdicional;
    }

    public IngressoVip( Double valor,Double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        var total = valorAdicional + getValor();
        return "IngressoVip{" +
                "valorAdicional=" + valorAdicional +
                '}';
    }



}

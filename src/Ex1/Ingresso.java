package Ex1;

public class Ingresso {
    private Double valor;

    public Ingresso(Double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "valor◕‿◕=" + valor +
                '}';
    }
}

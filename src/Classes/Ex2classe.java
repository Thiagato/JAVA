package Classes;

public class Ex2classe {

    public String nome;
    public Double salario;
    public Double vendas;
    public Double celular;

    //double valortotal = (0.15 * vendedor.celular)* vendedor.vendas + vendedor.salario;

    public double salariofinal(){
        double salariofinal = (0.15 * celular)* vendas + salario;
        return salariofinal;
    }

}

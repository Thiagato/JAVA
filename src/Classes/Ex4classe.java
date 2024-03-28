package Classes;

public class Ex4classe {
    public String nome;
    public Double salarioBruto;
    public Double imposto;


    public Double salarioLiquido(){
        double salarioLiquido = salarioBruto - imposto;
        return salarioLiquido;
    }

    public void incrementoSalario(double porcentagem){
        salarioBruto += salarioBruto * (porcentagem / 100) - imposto;
    }
}

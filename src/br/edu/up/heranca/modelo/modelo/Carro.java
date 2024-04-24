package br.edu.up.heranca.modelo.modelo;

public class Carro  extends Veiculo{
    private String porta;
    public Carro() {
    }

    public Carro(String marca, String modelo, String porta) {
        super(marca, modelo);
        this.porta = porta;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", porta='" + porta + '\'' +
                '}';
    }

    //super só aparece quando o pai não precisa obrigatoriamente dos filhos
    // tipo veiculo pode ter 323804e324980 veiculos e aparece o super
    // mas a classe sessão precisa obrigatoriamente de ingresso sala e filme para existir

}

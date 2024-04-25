package Teste;

public class Equipamento {
    private Boolean Ligado;

    public void ligar(){
        this.Ligado=true;
    }
    public void desligar(){
        this.Ligado=false;
    }

    public Boolean getLigado() {
        return Ligado;
    }
}

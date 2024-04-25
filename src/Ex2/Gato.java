package Ex2;

public class Gato extends Animal{
    public Gato(String name) {
        super(name);
    }


    @Override
    public void emitirSom() {
        System.out.println("miau Uwu");
    }
}

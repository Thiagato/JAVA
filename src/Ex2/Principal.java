package Ex2;

public class Principal {
    public static void main(String[] args) {
        Animal gato = new Gato("branquinho");
        Animal cachorro = new Cachorro("lobinho");

        gato.emitirSom();
        cachorro.emitirSom();

    }
}

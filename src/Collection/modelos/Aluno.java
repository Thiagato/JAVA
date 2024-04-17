package Collection.modelos;

import java.util.UUID;

public class Aluno {

    private UUID uuid;

    private  String nome;


    public Aluno(UUID uuid, String nome) {
        this.uuid = UUID.randomUUID();
        this.nome = nome;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

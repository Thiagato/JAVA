package Relacoes.modelos;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private List<Aluno> alunos;

    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void addAluno(Aluno aluno) {
        if (aluno.getTurma() == this) {
            alunos.add(aluno);
        } else {
            System.out.println("O aluno " + aluno.getNome() + " não está matriculado nesta turma.");
        }
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
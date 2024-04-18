package Relacoes;

import Relacoes.modelos.Aluno;
import Relacoes.modelos.Turma;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma("Dev de software");
        Turma turma2 = new Turma("Dev de sexo");

        for (int i = 1; i < 5; i++) {
            Aluno aluno = new Aluno("\nBrito " + i);
            aluno.setTurma(turma);
            turma.addAluno(aluno);
        }

        System.out.println(turma);
    }
}

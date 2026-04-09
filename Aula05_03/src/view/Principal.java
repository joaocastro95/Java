package view;

import model.*;

public class Principal {
    public static void main(String[] args) {

        // Professor
        Professor prof = new Professor(
            "Carlos Silva", 
            "carlos@email.com", 
            "PROF123"
        );

        // Disciplina
        Disciplina disc = new Disciplina(
            "POO101", 
            "Programação Orientada a Objetos"
        );

        // Matéria
        Materia mat = new Materia(
            "Herança", 
            "Conceitos de herança em Java"
        );

        // Aula
        Aula aula = new Aula(prof, disc, mat);

        // 5 alunos
        aula.adicionarAluno(new Aluno("João", "joao@email.com", "A1"));
        aula.adicionarAluno(new Aluno("Maria", "maria@email.com", "A2"));
        aula.adicionarAluno(new Aluno("Pedro", "pedro@email.com", "A3"));
        aula.adicionarAluno(new Aluno("Ana", "ana@email.com", "A4"));
        aula.adicionarAluno(new Aluno("Lucas", "lucas@email.com", "A5"));

        // Exibir tudo
        aula.exibirAula();
    }
}
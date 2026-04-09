package model;

import java.util.ArrayList;

public class Aula {

    private Professor professor;
    private ArrayList<Aluno> alunos;
    private Disciplina disciplina;
    private Materia materia;

    public Aula(Professor professor, Disciplina disciplina, Materia materia) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.materia = materia;
        this.alunos = new ArrayList<>();
    }

    // método de negócio
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // método de negócio
    public void exibirAula() {
        System.out.println("=== DADOS DA AULA ===");
        System.out.println("Disciplina: " + disciplina.getCodigo());
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Tópico: " + materia.getTopico());

        System.out.println("\nAlunos:");
        for (Aluno a : alunos) { // foreach ✔️
            System.out.println("- " + a.getNome());
        }
    }
}
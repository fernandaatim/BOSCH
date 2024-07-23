package exercicio03;

import java.util.ArrayList;

public class Escola {
    public ArrayList<Alunos> listadeAlunos = new ArrayList<Alunos>();

    public void adicionarAluno(Alunos a) {
        this.listadeAlunos.add(a);
    }

    public Alunos encontrarAluno(String nome, String turma) {
        for (Alunos a : this.listadeAlunos) {
            if (a.nome.equalsIgnoreCase(nome) && a.turma.equalsIgnoreCase(turma)) {
                return a;
            }
        }
        return null;
    }

    public String listarAlunos() {
        String todosAlunos = "";

        for (Alunos a : this.listadeAlunos) {
            todosAlunos += "Aluno: " + a.nome +
                    "\nTurma: " + a.turma +
                    "\nData de Nascimento: " + a.dataNascimento;
            for (Notas n : a.listadeNotas) {
                todosAlunos += "\nDescrição: " + n.descricao + "\nNota:" + n.nota+"\n\n";
            }

        }
        return todosAlunos;
    }

}

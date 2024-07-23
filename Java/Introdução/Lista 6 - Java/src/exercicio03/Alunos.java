package exercicio03;

import java.util.ArrayList;

public class Alunos {
    public String nome;
    public String turma;
    public String dataNascimento;

    public ArrayList<Notas> listadeNotas = new ArrayList<Notas>();
    
    public void adicionarNota(Notas n){
        this.listadeNotas.add(n);
    }

    

}

package exercicio03;

public class Calculos {
    public static Double calculamedia(Alunos a) {
        int cont = 0;
        double acumuladora = 0;
        for (Notas n : a.listadeNotas) {
            cont += 1;
            acumuladora += n.nota;
        }
        return acumuladora / cont;
    }

}
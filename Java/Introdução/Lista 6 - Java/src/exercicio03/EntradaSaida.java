package exercicio03;

import javax.swing.JOptionPane;

public class EntradaSaida {

    public static int pedirOpcao() {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1- Cadastrar aluno\n" +
                            "2- Cadastrar notas\n" +
                            "3- Ver dados dos alunos\n" +
                            "4- Ver dados de aluno específico\n" +
                            "5- Alterar nome\n" +
                            "6- Calcular média aritmética\n" +
                            "7- Sair."));
        } while (opcao <= 0 || opcao > 7);
        return opcao;
    }

    public static String pedirDadoAluno(String msg) {
        return JOptionPane.showInputDialog("Insira " + msg + " do aluno");
    }

    public static boolean opcaoInserirNota() {
        int opcao;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar uma nota agora?\n\n1- Sim\n2- Não"));
        if (opcao == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static String pedirDescriçãoNota() {
        return JOptionPane.showInputDialog("Descrição da nota:");
    }

    public static double pedirNota() {
        double nota;
        do {
            nota = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota de 1 a 10"));
        } while (Validacao.validarNota(nota) == false);
        return nota;
    }

    public static void mostrarAlunos(String msg) {
        JOptionPane.showMessageDialog(null, msg + "\n\n");
    }

    public static void mostrarMensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void mostrarAlunoEspecifico(Alunos a) {
        String notas = "";
        for (Notas n : a.listadeNotas) {
            notas += "\nDescrição: " + n.descricao + "\nNota:" + n.nota;
        }
        JOptionPane.showMessageDialog(null, "Nome aluno: " + a.nome + "\nTurma: " + a.turma + "\nData Nascimento: "
                + a.dataNascimento + "\n\nNotas: " + notas);
    }

    public static int opcaoQuantidadeNota() {
        return Integer.parseInt(JOptionPane.showInputDialog("Quantas notas serão inseridas para o Aluno: "));
    }

    public static String pedirNovoNome(String nome) {
        return JOptionPane.showInputDialog("Nome atual: " + nome + "\n\nInsira o novo nome: ");
    }

    public static void mostrarMedia(Double media, String nome) {
        JOptionPane.showMessageDialog(null, "A média de " + nome + " é: " + media);
    }
}

package exercicio04;

import javax.swing.JOptionPane;

public class EntradaSaida {

    public static int pedirOpcao() {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1- Cadastrar tarefa\n" +
                            "2- Ver todas as tarefas\n" +
                            "3- Ver tarefas em aberto\n" +
                            "4- Ver tarefas concluídas\n" +
                            "5- Alterar status da tarefa\n" +
                            "6- Excluir uma tarefa\n" +
                            "7- Ver os tipos de tarefas\n" +
                            "8- Sair."));
        } while (opcao <= 0 || opcao > 8);
        return opcao;
    }

    public static String pedirDadoTarefa(String msg) {
        return JOptionPane.showInputDialog("Insira " + msg + " da tarefa:");
    }

    public static void mostrarTodasTarefas(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void mostrarTarefasEmAbertoConcluida(String tarefas) {
        JOptionPane.showMessageDialog(null, tarefas);
    }

    public static void mostrarMensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static Boolean alterarTarefa() {
        int opcao = 0;
        do {
            opcao = Integer
                    .parseInt(
                            JOptionPane.showInputDialog(
                                    "Selecione para qual Status deseja alterar: \n1- Concluido\n2- Em aberto"));
            if (opcao == 1) {
                return true;
            } else {
                return false;
            }
        } while (opcao != 1 && opcao != 2);
    }

    public static void mostrarTodasCategorias(String listarTarefas) {
        JOptionPane.showMessageDialog(null,listarTarefas);
    }

}

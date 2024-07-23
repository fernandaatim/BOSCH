package exercicio02;

import javax.swing.JOptionPane;

public class EntradaSaida {

    public static int pedirOpcao() {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opção\n1- Cadastrar peças\n2-Remover uma peça\n3- Ver todas as peças\n\n4- Sair do sistema"));
        } while (opcao <= 0 || opcao > 4);
        return opcao;
    }

    public static String solicitarDadosPeca(String msg) {
        return JOptionPane.showInputDialog("Digite " + msg + " da peça: ");
    }

    public static double solicitarNumerosPeca(String msg) {
        return Double.parseDouble(JOptionPane.showInputDialog("Insira " + msg + " da peça: "));
    }

    public static void mostrarPecas(String listarPecas) {
        JOptionPane.showMessageDialog(null, listarPecas);
    }

    public static int pecaRemover() {
        return Integer.parseInt(JOptionPane.showInputDialog("Qual peça você deseja remover?"));
    }

    public static String mensagemAlerta(String msg) {
        return msg;
    }
}
import javax.swing.JOptionPane;
 
public class EntradaSaida {
    public static int escolherOpcaoMenu() {
        return Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção:" + "\n1 - Cadastrar uma nova conta \n"
                + "2- Ver todas as contas \n" + "3- Depositar em uma conta \n" + "4- Sacar de uma conta \n" + "5- Sair"));
    }
 
    public static int solicitarDadoConta(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog("Informe " +msg+ " da conta:"));
    }

    public static long solicitarCpf() {
        return Long.parseLong(JOptionPane.showInputDialog("Informe o CPF do titular"));
    }

    public static String solicitarDadoTitular(String msg) {
        return JOptionPane.showInputDialog("Informe o "+msg+" do titular");
    }

    public static void mostrarContas(String listarContas) {
        JOptionPane.showMessageDialog(null, listarContas);
    }

    public static double solicitarValorOperacao(String msg){
        return Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do "+msg));
    }

    public static void mostrarAlerta(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}

 
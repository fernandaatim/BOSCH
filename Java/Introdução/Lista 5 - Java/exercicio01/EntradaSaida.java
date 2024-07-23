import javax.swing.JOptionPane;

public class EntradaSaida {
    public static double pedirNota(String contador) {
        return Double.parseDouble(JOptionPane.showInputDialog("Digite a" + contador + " nota"));
    }

    public static int opcoes() {
        return Integer.parseInt(JOptionPane
                .showInputDialog("Com qual método será calculada a média?\n" + "[1]Aritmética\n" + "[2]Ponderada"));
    }

    public static double pesos(String pesos) {
        double pesosQtd = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da" + pesos + " nota"));
        pesosQtd = 0;
        return pesosQtd;
    }


    public static void mensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void mostrarResultado(double mediaUm, String resultadoUm){
        JOptionPane.showMessageDialog(null, "A média é:"+mediaUm+"\nSituação: "+resultadoUm);
    }
}
import javax.swing.JOptionPane;

public class atividade06 {
    public static void main(String[] args) {
        
     int numberUser = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
     int i = 0;
     int tabuada = 0;

     for (i = 0; i <= 10; i++) {
        tabuada = numberUser * i;
        JOptionPane.showMessageDialog(null, tabuada);
     }
    }
}

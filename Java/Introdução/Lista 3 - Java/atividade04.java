import javax.swing.JOptionPane;

public class atividade04 {
public static void main(String[] args) {
  
    int numberUser = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
    int incrementoUser = Integer.parseInt(JOptionPane.showInputDialog("Digite um incremento"));
    int i = 0;

    for (i = 0; i <= numberUser; i += incrementoUser)
    {
    JOptionPane.showMessageDialog(null, "numeros:"+i);
    }
}
}
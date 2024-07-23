import java.util.Random;
import javax.swing.JOptionPane;

public class exercicio01 {
    public static void main(String[] args) {

        Random rand = new Random();

        int vetor[] = new int[10];
        int i = 0;
        int inputUser = 0;
        String mensagem = "Número não encontrado!";

        for (i = 0; i < 10; i++) {
            vetor[i] = rand.nextInt(100) + 1;
            System.out.println(vetor[i]);
        }

        inputUser = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        for (i = 0; i < 10; i++) {
            if (inputUser == vetor[i]) {
                mensagem = "Número encontrado!";
            }
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
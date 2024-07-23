import java.util.Random;
 
import javax.swing.JOptionPane;
 
public class exercicio05 {
    public static void main(String[] args) {

        Random rand = new Random();

        int numeros[] = new int[10];
        int i = 0;
        int temp = 0;
        String resultado = "Vetor:\n";
 
        for (i = 0; i < 10; i++) {
            numeros[i] = rand.nextInt(10);
 
            if (i == 9) {
                resultado += numeros[i] + ".";
            } else {
                resultado += numeros[i] + ", ";
            }
        }
       
        resultado += "\nVetor invertido:\n";
        for (i = 0; i < numeros.length / 2; i++) {
            temp = numeros[i];
            numeros[i] = numeros[numeros.length - i - 1];
            numeros[numeros.length - i - 1] = temp;
        }
 
        for (i = 0; i < 10; i++) {
            if (i == 9) {
                resultado += numeros[i] + ".";
            } else {
                resultado += numeros[i] + ", ";
            }
        }
 
        JOptionPane.showMessageDialog(null, resultado);
    }
}

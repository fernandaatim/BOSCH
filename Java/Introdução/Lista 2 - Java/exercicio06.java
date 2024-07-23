import javax.swing.JOptionPane;
import java.util.Random;

public  class exercicio06 {
    public static void main(String[] args_) {
 
        Random rand = new Random();
         int int_random = rand.nextInt(100);
        System.out.println(int_random);
 
        int inputUser = Integer.parseInt(JOptionPane.showInputDialog("Tente acertar o número"));
        int contador = 0;
       
        String resultado = "Suas chances terminaram. Você não acertou!";
 
        if (inputUser == int_random) {
                resultado="Você acertou";
        }
       
 
        while (contador < 2 && inputUser!= int_random) {
            contador += 1;          
            inputUser = Integer.parseInt(JOptionPane.showInputDialog("Tente novamente!"));
           
            if (inputUser == int_random) {
                resultado="Você acertou";
                break;
            }
           
        }
       
        JOptionPane.showMessageDialog(null, resultado);
    }
}
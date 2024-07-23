import java.util.Random;

import javax.swing.JOptionPane;

public class exercicio06 {
    public static void main(String[] args) {
        
        Random rand = new Random ();

        int vetor1[] = new int [10];
        int soma[] = new int [10];
        int vetor2[] = new int [10];

        String valoresVetor1 = "";
        String valoresVetor2 = "";
        String valoresSoma = "";
        int i = 0;

        for (i=0; i <10; i++){
        vetor1[i] = rand.nextInt(100) + 1;

        if (i==9){
            valoresVetor1 += vetor1[i] + ".";
            }else{
            valoresVetor1 += vetor1[i] + ", ";
            }
        }

        for (i=0; i <10; i++){
        vetor2[i] = rand.nextInt(100) + 1;

        if (i==9){
            valoresVetor2 += vetor2[i] + ".";
            }else{
            valoresVetor2 += vetor2[i] + ", ";
            }
        }

         for (i=0; i<10; i++){
        soma[i] = vetor1[i] + vetor2[i];

        if (i==9){
            valoresSoma += soma[i] + ".";
            }else{
            valoresSoma += soma[i] + ", ";
            }
        }

        JOptionPane.showMessageDialog(null, "Vetor 1:" + valoresVetor1 + "\nVetor 2: "+valoresVetor2+"\nSoma: "+valoresSoma);
        }
    } 

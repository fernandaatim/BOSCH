import javax.swing.JOptionPane;

public class exercicio03 {
    public static void main(String[] args) {

        double vetor[] = new double[10];
        int i = 0;
        double inputUser = 0;
        double maior = 0;
        int posicaoMaior = 0;
        double menor = 99999999;
        int posicaoMenor = 0;

        for (i = 0; i < 5; i++) {
            inputUser = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número"));
            vetor[i] = inputUser;
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i+1;
            }
        }

        for(i=0; i <5; i++){
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i+1;
            }
        }

        JOptionPane
        .showMessageDialog(null, "O maior número é: " + maior+" que está na posicação "+ posicaoMaior+"\n O menor é: "+menor+" que está na posicação "+ posicaoMenor);
    }
}

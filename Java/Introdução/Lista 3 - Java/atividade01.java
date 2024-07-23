import javax.swing.JOptionPane;

public class atividade01 {
    public static void main(String[] args) {
        
        int i = 0;
        int numeros = 0;
        int quantidadePar = 0;
        int quantidadeImpar = 0;
        int quantidadePositivo = 0;
        int quantidadeNegativo = 0;

        for (i = 0; i < 10; i++){
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if (numeros % 2 == 0){
                quantidadePar = quantidadePar + 1;
            }
            if (numeros % 2 == 1){
                quantidadeImpar = quantidadeImpar + 1;
            }
            if (numeros > 0){
                quantidadePositivo = quantidadePositivo + 1;
            } else {
                quantidadeNegativo = quantidadeNegativo + 1;
            }
        }
         int opcao = Integer.parseInt(JOptionPane.showInputDialog
         ("O que você deseja saber:\n[1]Quantidade de números pares?\n[2]Quantidade de números ímpares?\n[3]Quantidade de números positivos?\n[4]Quantidae de números negativos?\n[5]Sair do programa"));

        while (opcao != 5) {
            
        switch (opcao){
            case 1: 
            JOptionPane.showMessageDialog(null, "Quantidade pares: "+quantidadePar); 
            break;
            case 2: 
            JOptionPane.showMessageDialog(null, "Quantidade ímpares: "+quantidadeImpar);
            case 3: 
            JOptionPane.showMessageDialog(null, "Quantidade positivos:"+quantidadePositivo);
            case 4: 
            JOptionPane.showMessageDialog(null, "Quantidade negativos:"+quantidadeNegativo); 
            case 5:
            System.exit(0); 
        }
        opcao = Integer.parseInt(JOptionPane.showInputDialog
         ("O que você deseja saber:\n[1]Quantidade de números pares?\n[2]Quantidade de números ímpares?\n[3]Quantidade de números positivos?\n[4]Quantidae de números negativos?\n[5]Sair do programa"));
    }
    }
}

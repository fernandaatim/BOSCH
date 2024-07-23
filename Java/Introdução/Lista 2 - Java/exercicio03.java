import javax.swing.JOptionPane;

public class exercicio03{
    public static void  main (String [] args_){


    double quantidadeGolsA=Integer.parseInt(JOptionPane.showInputDialog("Digite os gols do Time A"));
    double quantidadeGolsB=Integer.parseInt(JOptionPane.showInputDialog("Digite os gols do Time B"));
    String resultado=" ";
    
    if (quantidadeGolsA>quantidadeGolsB) {
    resultado+="o vencedor é o Time A!";
    }

    if (quantidadeGolsB>quantidadeGolsA){
    resultado+="O vencedor é o Time B!";
    }

    if (quantidadeGolsA==quantidadeGolsB) {
    resultado+="Empate!";
    }  
     
    JOptionPane.showMessageDialog(null,resultado);

    }
}
import javax.swing.JOptionPane;

public class exercicio02{
    public static void main (String [] args_){

    double valorUnitario=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário do produto"));
    int quantidadeProduto=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que irá comprar"));
    double valorAtacado=valorUnitario-(valorUnitario*0.10);
    String valorFinal="O valor final é R$";

    if (quantidadeProduto>12) {
    valorFinal+=(valorAtacado*quantidadeProduto);
    }
    else{

    valorFinal+=(valorUnitario*quantidadeProduto);
    }    
    JOptionPane.showMessageDialog(null,valorFinal);
}
}
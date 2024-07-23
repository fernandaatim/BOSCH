import javax.swing.JOptionPane;

public class Exercicio03{
public static void main(String[] args){
    double valorCompra=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de compra:"));
    double valorRepresentante=(valorCompra*0.20);
    double valorImposto=(valorCompra*0.30);
    double valorFinal=(valorCompra+valorImposto+valorRepresentante);

    JOptionPane.showMessageDialog(null,"Valor de compra: R$"+valorCompra+"\n"
    +"Valor Representante(20%): R$"+valorRepresentante+"\n"
    +"Imposto(30%): R$"+valorImposto+"\n"
    +"Valor Final: R$"+valorFinal+"\n"
    );
}
}
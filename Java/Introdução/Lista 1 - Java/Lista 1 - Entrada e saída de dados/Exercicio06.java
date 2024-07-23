import javax.swing.JOptionPane;

public class Exercicio06{
    public static void main (String[] args){

        double nota1=Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota:"));
        double nota2=Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota:"));
        double calculoNota1=nota1*0.40;
        double calculoNota2=nota2*0.60;
        double media=calculoNota1+calculoNota2;
        String mensagemFinal="A média final é: ";
        String mensagemReprova="Reprovado";
        String mensagemAprova="Aprovado";

        if (media<7){
        JOptionPane.showMessageDialog(null,mensagemFinal+media+"\n"+
        mensagemReprova
        );
        }
        else{
        JOptionPane.showMessageDialog(null,mensagemFinal+media+"\n"+
        mensagemAprova);    
        }       
 }
}
import javax.swing.JOptionPane;

public class Exercicio02 {
/**
 * @param args
 */
public static void main(String[] args) {

 double numero1=Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º número"));
 double numero2=Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º número"));
 String mensagemResto="";
 String mensagemDivisao="";
 double elevado=Math.pow(numero1,numero2);
 double divisao= 0;
double restoDivisao=(numero1%numero2);

  if (numero2==0){
   mensagemDivisao = "A divisão não pode ser feita";
   mensagemResto = "O resto não pode ser feito";
  }
  else{
   divisao = numero1/numero2;
   mensagemDivisao = divisao+"";
   mensagemResto = restoDivisao+"";
  } 

  JOptionPane.showMessageDialog(null,
 "Soma: "+(numero1+numero2)+"\n"+
 "Subtração: "+(numero1-numero2)+"\n"+
 "Multiplicação: "+(numero1*numero2)+"\n"+
 "Divisão: "+mensagemDivisao+"\n"+
 "O 1º número elevado ao 2º é: "+elevado+"\n"+
 "Resto: "+mensagemResto);
}  
}

import javax.swing.JOptionPane;

public class Exercicio04{

public static void main(String[] args){

int numeroInteiro=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
int sucessor=(numeroInteiro+1);
int antecessor=(numeroInteiro-1);

JOptionPane.showInputDialog("Número digitado: "+numeroInteiro+"\n"+
"Sucessor: "+sucessor+"\n"+
"Antecessor: "+antecessor
  );
 }
}   
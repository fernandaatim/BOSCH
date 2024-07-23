import javax.swing.JOptionPane;

public class exercicio02 {
    public static void main(String[] args) {
        
      double vetor[] =  new double[10];
      String valores = " ";
      double inputUser = 0;
      double soma = 0;
      double media = 0;

      for (int i=0; i<10; i++){
        inputUser = Double.parseDouble(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número"));
        vetor[i] = inputUser;
        soma = vetor[0]+vetor[1]+vetor[2]+vetor[3]+vetor[4]+vetor[5]+vetor[6]+vetor[7]+vetor[8]+vetor[9];
        media = soma/10;

        if (i==9){
        valores += vetor[i] +".";
        }else{
        valores += vetor[i] + ", ";
        }
      }
      JOptionPane.showMessageDialog(null, "Os valores são: "+valores+"\nA soma total é: "+soma+"\nA media é:"+media);
    }
}

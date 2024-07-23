import javax.swing.JOptionPane;

public class atividade05 {
   public static void main(String[] args) {
    
    double saldoPessoa = 0;
    double saldoTotal = 0;
    String opcao;
    int quantidadePessoas = 0;
    String mensagem = " ";

      do {
            saldoPessoa = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo:"));
            saldoTotal = saldoPessoa + saldoPessoa;
            quantidadePessoas = quantidadePessoas + 1;
            opcao = JOptionPane.showInputDialog("Deseja continuar\nS - Sim\nN - Não");
            
            if (quantidadePessoas > (0.50 * quantidadePessoas)){
            if (saldoTotal <= -1) {
               mensagem = "Risco ao banco!";
            } else {
               mensagem = "Sem risco!";
            }   
            }

        } while(opcao.equalsIgnoreCase("s"));
   JOptionPane.showMessageDialog(null, mensagem);
   } 
}
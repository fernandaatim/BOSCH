import javax.swing.JOptionPane;

public class exercicio05 {

    public static void main(String[] args) {
        
    int quantidadeAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o estoque atual"));
    int quantidadeMaxima = Integer.parseInt(JOptionPane.showInputDialog("Digite o estoque máximo"));
    int quantidadeMinima = Integer.parseInt(JOptionPane.showInputDialog("Digite o estoque mínimo"));
    int quantidadeMedia = (quantidadeMaxima+quantidadeMinima)/2;
    String mensagemFinal = " ";

    if (quantidadeAtual>=quantidadeMedia){
    mensagemFinal="Não efetuar compra.";   
    }else{
    mensagemFinal="Efetuar compra";    
    }
    JOptionPane.showMessageDialog(null, mensagemFinal);
    }
}

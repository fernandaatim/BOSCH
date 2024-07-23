import javax.swing.JOptionPane;

public class atividade03 {
    public static void main(String[] args) {

        int nota = 0;
        int qtdBom = 0;
        int qtdOtimo = 0;
        int qtdRuim = 0;
        int notaBom = 0;
        int notaOtimo = 0;
        int notaRuim = 0;
        int quantidadeTotal = 0;
        int media = 0;
        String opcao = "";

        do {
            nota = Integer.parseInt(JOptionPane
                    .showInputDialog("Digite uma nota para o filme Bastardos Inglórios\n3-Ótimo\n2-Bom\n1-Ruim"));
                    if (nota == 3) {
                            qtdOtimo = qtdOtimo + 1;
                            notaOtimo = 3 + notaOtimo;
                          }  else if (nota == 2) {
                                qtdBom = qtdBom + 1;
                                notaBom = 2 + quantidadeTotal;
                          }else   if (nota == 1) {
                                    qtdRuim = 1 + qtdRuim;
                                    notaRuim = 1 + quantidadeTotal;
                                }
            
            quantidadeTotal = quantidadeTotal + 1;
            media = (notaRuim + notaBom + notaOtimo) / quantidadeTotal;

            opcao = JOptionPane.showInputDialog("Deseja continuar\nS - Sim\nN - Não");
        } while (opcao.equalsIgnoreCase("s"));
        JOptionPane.showMessageDialog(null,
                "Quantidade de pessoas que votaram: " + quantidadeTotal + "\n Quantidade votos 'ótimo': " + qtdOtimo
                        + "\n Quantidade votos 'bom': " + qtdBom + "\n Quantidade votos 'ruim': " + qtdRuim +
                        "\nA nota média do filme é: " + media);
    }
}
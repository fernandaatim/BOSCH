package exercicio01;

import javax.swing.JOptionPane;

public class EntradaSaida {

    public static int cadastrarProduto() {
        return Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um novo produto?\n1- Sim\n2- Não"));
    }

    public static String pedirNomeProduto() {
        String nome;
        do {
            nome = JOptionPane.showInputDialog("Digite o nome do Produto:");
        } while (nome.isEmpty());
        return nome;
    }

    public static double pedirPrecoProduto() {
        double preco = 0;
        do {
            preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
        } while (preco <= 0);
        return preco;
    }

    public static String pedirCategoriaProduto() {
        String categoria;
        do {
            categoria = JOptionPane.showInputDialog("Digite a categoria do Produto:");
        } while (categoria.isEmpty());
        return categoria;
    }

    public static long pedirCodigodeBarrasProduto() {
        return Long.parseLong(JOptionPane.showInputDialog("Digite o código de barras do produto: "));
    }

    public static String pedirMarcaProduto() {
        return JOptionPane.showInputDialog("Digite a marca do produto: ");
    }

    public static void exibirProduto(String nome, String categoria, double preco, long ean, String marcas) {
        JOptionPane.showMessageDialog(null, "Nome do produto: " + nome + "\nCategoria: " + categoria + "\nPreço: R$"
                + preco + "\nCódigo de barras: " + ean + "\nMarca do produto: " + marcas);
    }

}

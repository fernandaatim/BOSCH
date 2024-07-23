import javax.swing.JOptionPane;

public class EntradaSaida {

    public static final String atualizarNome = null;
    public static double atualizarCodigo; 

    public static int menu() {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "SELECIONE UMA OPÇÃO\n" + "[1] Cadastro de Produtos\n" + "[2] Consulta de produtos\n" +
                            "[3] Consultar código\n" + "[4] Consultar marca\n" + "[5] Editar produto\n"
                            + "[6] Excluir produto\n" + "[7] Entrada/Baixa de um produto\n"
                            +  "[8] Sair"));
        } while (opcao <= 0 || opcao >= 9);
        return opcao;
    }

    public static void mensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void mostarListaProdutos(String listaProdutos) {
        JOptionPane.showMessageDialog(null, listaProdutos);
    }

    public static String adicionarProdutos(String adicionarProdutos) {
        return JOptionPane.showInputDialog(adicionarProdutos);
    }

    public static double adicionarNumeroProduto(String msg) {
        double adicionarNumeroProduto;
        adicionarNumeroProduto = Double.parseDouble(JOptionPane.showInputDialog("Insira " + msg));
        return adicionarNumeroProduto;
    }

    public static void removerProdutos(String removerProdutos) {
        JOptionPane.showInputDialog(removerProdutos);
    }

    public static void visualizarProdutos(String listarProdutos) {
        JOptionPane.showMessageDialog(null, listarProdutos);
    }

    public static String adicionarMarca() {
        return JOptionPane.showInputDialog("Digite a marca:");
    }

    public static int procurarProdutos(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));

    }

    public static String atualizarNome(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    public static int pesquisarProdutos(String msg, String produtosListados) {
        return Integer.parseInt(JOptionPane.showInputDialog("Informe " + msg + " do produto:\n" + produtosListados));
    }

    public static double atualizarPreco(String msg) {
        return Double.parseDouble(JOptionPane.showInputDialog(msg));
    }

    public static void consultarMarca(String insiraMarca) {
    }

    public static int adicionarNumero(String msg) {
        int adicionarNumeroProduto;
        adicionarNumeroProduto = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return adicionarNumeroProduto;
    }

    public static void mostarListaProdutosEmEstoque(String listarProdutosEmEstoque) {
        JOptionPane.showMessageDialog(null, listarProdutosEmEstoque);
    }

}
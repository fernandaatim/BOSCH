public class Validacao {
ProdutoEmEstoque ep;

    public static boolean validaPreco(double preco) {
        if (preco <= 0) {
            return false;
        }
        return true;
    }

    public static boolean validaCompra(double quantidade, double quantidadeMin) {
        if (quantidade <= quantidadeMin) {
            return false;
        }
        return true;
    }
}
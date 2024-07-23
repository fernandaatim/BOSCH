package exercicio01;

public class Principal {
    public static void main(String[] args) {
        int opcao;
        opcao = EntradaSaida.cadastrarProduto();

        switch (opcao) {
            case 1:
                Produto p = new Produto();
                
                Marca m = new Marca();
                p.nome = EntradaSaida.pedirNomeProduto();
                p.categoria = EntradaSaida.pedirCategoriaProduto();
                p.preco = EntradaSaida.pedirPrecoProduto();
                p.ean = EntradaSaida.pedirCodigodeBarrasProduto();
                m.nome = EntradaSaida.pedirMarcaProduto();
                p.m = m;

                EntradaSaida.exibirProduto(p.nome, p.categoria, p.preco, p.ean, p.m.nome);
                break;

            case 2:
                System.exit(0);
                break;
        }

    }
}

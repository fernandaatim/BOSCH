public class Principal {
    public static void main(String[] args) {
        Estoque e = new Estoque();
        int opcaoMenu = 0;
        int inputCodigoUser = 0;
        String insiraMarca = "";
        boolean precoValido;
        double precoProduto;

        do {
            opcaoMenu = EntradaSaida.menu();

            switch (opcaoMenu) {
                case 1:
                    Produto p = new Produto();
                    Marca m = new Marca();

                    p.setNome(EntradaSaida.adicionarProdutos("Qual é o nome do produto?"));

                    do {
                        precoProduto = EntradaSaida.adicionarNumeroProduto("o preço do produto?");
                        precoValido = Validacao.validaPreco(precoProduto);
                    } while (precoValido == false);
                    p.setPreco(precoProduto);

                    p.setCodigo(EntradaSaida.adicionarNumero("Qual o código?"));

                    p.setModelo(EntradaSaida.adicionarProdutos("Qual é o modelo do produto?"));

                    m.marca = EntradaSaida.adicionarMarca();
                    p.m = m;

                    e.adicionarProdutos(p);

                    break;

                case 2:
                    if (!e.listarProdutos().isEmpty()) {
                        EntradaSaida.mostarListaProdutos(e.listarProdutos());
                    } else {
                        EntradaSaida.mensagem("Nenhum produto cadastrado!");
                    }

                    break;

                case 3:
                    Produto consultarProduto = e.consultarProdutoCodigo(inputCodigoUser);
                    
                    if (consultarProduto != null) {
                        EntradaSaida.mostarListaProdutos(e.listarProdutosPorCodigo(consultarProduto));
                    } else {
                        EntradaSaida.mensagem("Código inválido ou produto não cadastrado!");
                    }
                    break;

                case 4:
                    Marca consultarMarca = e.consultarMarca(insiraMarca);
                    if (consultarMarca != null) {
                        EntradaSaida.mostarListaProdutos(e.listarProdutosDeUmaMarca(consultarMarca));
                    } else {
                        EntradaSaida.mensagem("Nenhum produto cadastrado para essa marca ou marca inexistente!");
                    }
                    break;

                case 5:

                    inputCodigoUser = EntradaSaida.procurarProdutos("Digite o código:");

                    Produto alterarProduto = e.consultarProdutoCodigo(inputCodigoUser);

                    if (alterarProduto != null) {
                        alterarProduto.setNome(EntradaSaida.atualizarNome("Digite o novo nome: "));
                        alterarProduto.setPreco(EntradaSaida.atualizarPreco("Digite o novo preço: "));
                        alterarProduto.setModelo(EntradaSaida.atualizarNome("Digite o novo nome da modelo "));
                        alterarProduto.setMarca(EntradaSaida.atualizarNome("Digite o novo nome da marca: "));
                    } else {
                        EntradaSaida.mensagem("Nenhum produto encontrado");
                    }
                    break;

                case 6:
                    int posicaoProduto = EntradaSaida.pesquisarProdutos("a posição", e.listarProdutos());
                    e.excluirProduto(posicaoProduto);
                    break;

                case 7:
                    inputCodigoUser = EntradaSaida.procurarProdutos("Digite o código:");

                    EntradaSaida.mostarListaProdutos(e.listarProdutos());
                    ProdutoEmEstoque pe = new ProdutoEmEstoque();

                    pe.setQuantidadeMin(EntradaSaida.adicionarNumero("Qual a quantidade mínima de estoque?"));
                    pe.setQuantidadeAtual(EntradaSaida.adicionarNumero("Qual a quantidade atual do estoque?"));
                    p = e.consultarProdutoCodigo(inputCodigoUser);
                    pe.setP(p);

                    e.adicionarProdutosEmEstoque(pe);

                    if (pe.getQuantidadeAtual() < pe.getQuantidadeMin()) {
                       EntradaSaida.mensagem("Quantidade insuficiente de produto! Realize a compra.");
                    } else {
                       EntradaSaida.mensagem("Não é necessário realizar a compra do produto!");
                    }

                    EntradaSaida.mostarListaProdutosEmEstoque(e.listarProdutosEmEstoque());

                    
                    break;

                case 8:
                    System.exit(0);
                    break;
            }
        } while (opcaoMenu != 8);
    }
}

import java.util.ArrayList;

import javax.swing.JOptionPane;;

public class Estoque {

    private ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
    private ArrayList<ProdutoEmEstoque> listaDeProdutoEmEstoque = new ArrayList<ProdutoEmEstoque>();

    public void adicionarProdutosEmEstoque(ProdutoEmEstoque e) {
        listaDeProdutoEmEstoque.add(e);
    }

    public ArrayList<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public void adicionarProdutos(Produto p) {
        this.listaDeProdutos.add(p);
    }

    public void removerProdutos(Produto p) {
        this.listaDeProdutos.remove(p);
    }


    public String produtosFaltantes(Double codigo) {
        return "";
    }

    public String listarProdutos() {
        int posicao = 0;
        String produtos = "";

        produtos += "Lista de produtos: \n\n";

        for (Produto p : this.listaDeProdutos) {
            posicao += 1;
            produtos += "Posição: " + posicao +
                    "\nNome do Produto: " + p.getNome() +
                    "\nPreço " + p.getPreco() +
                    "\nCódigo do produto: " + p.getCodigo() +
                    "\nModelo: " + p.getModelo() +
                    "\nMarca: " + p.m.marca + "\n\n";
        }
        return produtos;
    }

    public Marca consultarMarca(String insiraMarca) {
        insiraMarca = JOptionPane.showInputDialog("Digite a marca:");
        for (Produto p : this.listaDeProdutos) {
            if (p.m.marca.equals(insiraMarca) == true) {
                return p.m;
            }

        }
        return null;
    }

    public String listarProdutosDeUmaMarca(Marca marca) {

        String produtos = "";

        produtos += "Lista de produtos: \n";

        for (Produto p : this.listaDeProdutos) {
            if (p.m.marca.equals(marca.marca)) {
                produtos += "\nNome do Produto: " + p.getNome() +
                        "\nPreço " + p.getPreco() +
                        "\nCódigo do produto: " + p.getCodigo() +
                        "\nModelo: " + p.getModelo() +
                        "\nMarca: " + p.m.marca + "\n\n";
            }
        }
        return produtos;
    }

    public void excluirProduto(int posicaoProduto) {
        this.listaDeProdutos.remove(posicaoProduto - 1);
    }

    public String listarProdutosEmEstoque() {
        int posicao = 0;
        String listarProdutosEmEstoque = "";

        listarProdutosEmEstoque += "Baixa de produtos: \n";

        for (ProdutoEmEstoque ep : this.listaDeProdutoEmEstoque) {
            posicao += 1;
            listarProdutosEmEstoque += "\nPosição: " + posicao +
                    "\nCódigo: " + ep.getP().getCodigo() +
                    "\nQuantidade atual: " + ep.getQuantidadeAtual() +
                    "\nQuantidade mínima: " + ep.getQuantidadeMin();
        }
        return listarProdutosEmEstoque;
    }

    public void seListaDeProdutosEmEstoque(ArrayList<ProdutoEmEstoque> listaDeProdutoEmEstoque) {
        this.listaDeProdutoEmEstoque = listaDeProdutoEmEstoque;
    }
    
        public Produto consultarProdutoCodigo(int insiraProduto) {
        insiraProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite o código:"));
        for (Produto p : this.listaDeProdutos) {
            if ((p.getCodigo() == insiraProduto) == true) {
                return p;
            }
        }
        return null;
    }

        public String listarProdutosPorCodigo(Produto p) {
        String insiraProduto = "Não foi encontrado";

        for (Produto produto : this.listaDeProdutos){
        if (p.getCodigo() == p.getCodigo()) {
            insiraProduto = "\nPosição: " + (this.listaDeProdutos.indexOf(produto)+1) + "\nNome do Produto: " + produto.getNome() +
                        "\nPreço " + produto.getPreco() +
                        "\nCódigo do produto: " + produto.getCodigo() +
                        "\nModelo: " + produto.getModelo() +
                        "\nMarca: " + produto.m.marca + "\n";
            }
        }
        return insiraProduto;
        }
    }

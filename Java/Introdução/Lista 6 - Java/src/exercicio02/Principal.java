package exercicio02;

public class Principal {
    public static void main(String[] args) {
        int opcao;
        Estoque e = new Estoque();

        do {
            opcao = EntradaSaida.pedirOpcao();
            switch (opcao) {
                case 1:
                    Pecas p = new Pecas();
                    p.nome = EntradaSaida.solicitarDadosPeca("o nome");
                    p.preco = EntradaSaida.solicitarNumerosPeca("o preço");
                    p.altura = EntradaSaida.solicitarNumerosPeca("a altura");
                    p.largura = EntradaSaida.solicitarNumerosPeca("a largura");
                    p.cor = EntradaSaida.solicitarDadosPeca("a cor");
                    e.adicionarPeca(p);
                    break;
                case 2:
                    if (!e.listadePecas.isEmpty()) {
                        EntradaSaida.mostrarPecas(e.listarPecas());
                        e.removerPeca(EntradaSaida.pecaRemover());
                    }
                    break;

                case 3:
                    if (!e.listadePecas.isEmpty()) {
                        EntradaSaida.mostrarPecas(e.listarPecas());
                    } else {
                    EntradaSaida.mensagemAlerta("Não há produtos cadastrados!");
                    }
                    break;
            }
        } while (opcao != 4);

    }
}
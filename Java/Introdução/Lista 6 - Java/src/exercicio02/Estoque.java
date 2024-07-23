package exercicio02;

import java.util.ArrayList;

public class Estoque {
    public ArrayList<Pecas> listadePecas = new ArrayList<Pecas>();

    public void adicionarPeca(Pecas p) {
        this.listadePecas.add(p);
    }

    public void removerPeca(int p) {
        this.listadePecas.remove(p - 1);
    }

    public String listarPecas() {
        String pecas = "Os dados das peças são:\n\n";
        int cont = 0;
        for (Pecas p : this.listadePecas) {
            cont += 1;
            pecas += cont + "- Nome do produto: " + p.nome +
                    "\nPreço: R$" + p.preco +
                    "\nAltura: " + p.altura +
                    "\nLargura: " + p.largura +
                    "\nCor: " + p.cor + "\n\n";
        }
        return pecas;
    }

}
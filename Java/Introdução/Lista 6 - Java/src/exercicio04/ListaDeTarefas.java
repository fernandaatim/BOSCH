package exercicio04;

import java.util.ArrayList;

public class ListaDeTarefas {
    public ArrayList<Tarefas> listadeTarefas = new ArrayList<Tarefas>();

    public void adicionarTarefa(Tarefas t) {
        this.listadeTarefas.add(t);
    }

    public void removerTarefa(Tarefas t) {
        this.listadeTarefas.remove(t);
    }

    public Tarefas encontrarTarefas(String descricao, String tipo) {
        for (Tarefas t : this.listadeTarefas) {
            if (t.descricao.equalsIgnoreCase(descricao) && t.tipo.equalsIgnoreCase(tipo)) {
                return t;
            }
        }
        return null;
    }

    public String listarTarefas() {
        String todasTarefas = "";

        for (Tarefas t : this.listadeTarefas) {
            todasTarefas += "Descrição: " + t.descricao +
                    "\nPrazo: " + t.prazo +
                    "\nStatus: " + Validacao.validaStatus(t.status) +
                    "\nTipo: " + t.tipo + "\n";

        }
        return todasTarefas;
    }

    public String tarefasAberto() {
        String emAberto = "";
        for (Tarefas t : this.listadeTarefas) {
            if (t.status == false) {
                emAberto += "Descrição: " + t.descricao + "\nPrazo: " + t.prazo + "\nStatus: Em Aberto"
                        + t.tipo + "\n";
            }
        }
        return emAberto;

    }

    public String tarefasConcluida() {
        String concluida = "";
        for (Tarefas t : this.listadeTarefas) {
            if (t.status == true) {
                concluida += "Descrição: " + t.descricao + "\nPrazo: " + t.prazo + "\nStatus: Em Aberto\nCategoria: "
                        + t.tipo + "\n";
            }
        }
        return concluida;
    }

    public String listarCategorias() {
        String listarCategorias = "Categorias existentes: \n";
        int cont = 0;
        for (Tarefas t : this.listadeTarefas) {
            cont += 1;
            if (!t.tipo.contains(listarCategorias)) {
                listarCategorias += "Categoria " + cont + ": " + t.tipo + "\n";
                System.out.println(listarCategorias);
            }
        }
        return listarCategorias;
    }

}

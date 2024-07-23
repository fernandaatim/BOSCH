package exercicio04;

public class Principal {
    public static void main(String[] args) {
        ListaDeTarefas l = new ListaDeTarefas();
        int opcao = 0;
        do {
            opcao = EntradaSaida.pedirOpcao();

            switch (opcao) {
                case 1:
                    Tarefas t = new Tarefas();
                    t.descricao = EntradaSaida.pedirDadoTarefa("a descrição");
                    t.prazo = EntradaSaida.pedirDadoTarefa("o prazo");
                    t.status = false;
                    t.tipo = EntradaSaida.pedirDadoTarefa("a categoria");
                    l.adicionarTarefa(t);
                    break;

                case 2:
                    if (!l.listadeTarefas.isEmpty()) {
                        EntradaSaida.mostrarTodasTarefas(l.listarTarefas());
                    } else {
                        EntradaSaida.mostrarMensagem("Nenhuma tarefa cadastrada!");
                    }

                    break;

                case 3:
                    EntradaSaida.mostrarTarefasEmAbertoConcluida(l.tarefasAberto());
                    break;

                case 4:
                    EntradaSaida.mostrarTarefasEmAbertoConcluida(l.tarefasConcluida());
                    break;

                case 5:
                    String descricao = EntradaSaida.pedirDadoTarefa("a descrição");
                    String categoria = EntradaSaida.pedirDadoTarefa("a categoria");
                    Tarefas alterarTarefa = l.encontrarTarefas(descricao, categoria);
                    if (alterarTarefa != null) {
                        alterarTarefa.status = EntradaSaida.alterarTarefa();
                    } else {
                        EntradaSaida.mostrarMensagem("Nenhuma tarefa encontrada");
                    }

                    break;

                case 6:
                    String descricaoTarefa = EntradaSaida.pedirDadoTarefa("a descrição");
                    String tipoTarefa = EntradaSaida.pedirDadoTarefa("o tipo");
                    t = l.encontrarTarefas(descricaoTarefa, tipoTarefa);

                    if (t != null) {
                        l.removerTarefa(t);
                    } else {
                        EntradaSaida.mostrarMensagem("Nenhuma tarefa encontrada");
                    }

                    break;

                case 7:
                    if (!l.listadeTarefas.isEmpty()) {
                        EntradaSaida.mostrarTodasCategorias(l.listarCategorias());
                    } else {
                        EntradaSaida.mostrarMensagem("Nenhuma tarefa cadastrada!");
                    }
                    break;

                case 8:
                    System.exit(0);
                    break;
            }

        } while (opcao != 8);
    }
}
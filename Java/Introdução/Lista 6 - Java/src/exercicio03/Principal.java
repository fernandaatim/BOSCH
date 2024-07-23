package exercicio03;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;
        Escola e = new Escola();
        String nomeAluno = "";
        String turma = "";

        do {
            opcao = EntradaSaida.pedirOpcao();
            System.out.println(opcao);
            switch (opcao) {
                case 1:
                    Alunos a = new Alunos();
                    a.nome = EntradaSaida.pedirDadoAluno("o nome");
                    a.turma = EntradaSaida.pedirDadoAluno("a turma");
                    a.dataNascimento = EntradaSaida.pedirDadoAluno("a data de nascimento");
                    e.adicionarAluno(a);
                    if (EntradaSaida.opcaoInserirNota()) {
                        int i = 0;
                        int quantNotas = EntradaSaida.opcaoQuantidadeNota();
                        for (i = 0; i < quantNotas; i++) {
                            Notas n = new Notas();
                            n.descricao = EntradaSaida.pedirDescriçãoNota();
                            n.nota = EntradaSaida.pedirNota();
                            a.adicionarNota(n);
                        }
                    }
                    break;
                case 2:
                    nomeAluno = EntradaSaida.pedirDadoAluno("o nome");
                    turma = EntradaSaida.pedirDadoAluno("a turma");
                    Alunos al = e.encontrarAluno(nomeAluno, turma);
                    if (al != null) {
                        int i = 0;
                        int quantNotas = 0;
                        quantNotas = EntradaSaida.opcaoQuantidadeNota();
                        for (i = 0; i < quantNotas; i++) {
                            Notas n = new Notas();
                            n.descricao = EntradaSaida.pedirDescriçãoNota();
                            n.nota = EntradaSaida.pedirNota();
                            al.adicionarNota(n);
                        }
                    } else {
                        EntradaSaida.mostrarMensagem("Nenhum aluno encontrado");
                    }
                    break;
                case 3:
                    if (!e.listadeAlunos.isEmpty()) {
                        EntradaSaida.mostrarAlunos(e.listarAlunos());
                    } else {
                        EntradaSaida.mostrarMensagem("Nenhum aluno cadastrado");
                    }
                    break;
                case 4:
                    nomeAluno = EntradaSaida.pedirDadoAluno("o nome");
                    turma = EntradaSaida.pedirDadoAluno("a turma");
                    a = e.encontrarAluno(nomeAluno, turma);
                    if (a != null) {
                        EntradaSaida.mostrarAlunoEspecifico(a);
                    } else {
                        EntradaSaida.mostrarMensagem("Nenhum aluno foi encontrado");
                    }
                    break;

                case 5:
                    nomeAluno = EntradaSaida.pedirDadoAluno("o nome");
                    turma = EntradaSaida.pedirDadoAluno("a turma");
                    Alunos aluno = e.encontrarAluno(nomeAluno, turma);
                    aluno.nome = EntradaSaida.pedirNovoNome(aluno.nome);
                    break;

                case 6:
                    nomeAluno = EntradaSaida.pedirDadoAluno("o nome");
                    turma = EntradaSaida.pedirDadoAluno("a turma");
                    Alunos alunoCalculo = e.encontrarAluno(nomeAluno, turma);
                    EntradaSaida.mostrarMedia(Calculos.calculamedia(alunoCalculo),alunoCalculo.nome);

                    break;

                case 7:
                    System.exit(0);
                    break;

            }
        } while (opcao != 7);
    }
}
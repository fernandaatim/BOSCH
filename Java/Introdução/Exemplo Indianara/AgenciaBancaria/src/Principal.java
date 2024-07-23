public class Principal {
    public static void main(String[] args) {

        Banco b = new Banco(); // porque queremos apenas um objeto banco

        int opcao;
        int agencia = 0;
        int numero = 0;
        Conta conta;

        do {
            opcao = EntradaSaida.escolherOpcaoMenu();

            switch (opcao) {
                case 1:
                    Conta c = new Conta(); // sempre precisamos criar um novo objeto conta
                    c.setAgencia (EntradaSaida.solicitarDadoConta("a agência"));
                    c.setNumero (EntradaSaida.solicitarDadoConta("o número"));
                    Pessoa p = new Pessoa();
                    p.setCpf  (EntradaSaida.solicitarCpf());
                    p.setDataNascimento (EntradaSaida.solicitarDadoTitular("a data de nascimento"));
                    p.setNome (EntradaSaida.solicitarDadoTitular("o nome completo"));
                    c.setTitular(p);
                    /*
                     * System.out.println(c.agencia);
                     * System.out.println(c.numero);
                     * System.out.println(c.titular.cpf);
                     * System.out.println(c.titular.nome);
                     * System.out.println(c.titular.dataNascimento);
                     * System.out.println(c.saldo);
                     */
                    b.adicionarConta(c); // adicionando o objeto conta na lista do objeto banco

                    break;

                case 2:
                if (!b.listaDeContas.isEmpty()){
                    EntradaSaida.mostrarContas(b.listarContas());
                }else{
                    EntradaSaida.mostrarAlerta("Nenhuma conta foi cadastrada até o momento.");
                }
                    break;

                case 3:
                    agencia = EntradaSaida.solicitarDadoConta("a agência");
                    numero = EntradaSaida.solicitarDadoConta("o número");

                    conta = b.encontrarConta(agencia, numero);
                    if (conta != null) {
                        conta.depositar(EntradaSaida.solicitarValorOperacao("depósito"));
                    } else {
                        EntradaSaida.mostrarAlerta(
                                "A agência e o número digitados não correpondem a nenhuma conta cadastrada.");
                    }
                    break;

                case 4:
                    agencia = EntradaSaida.solicitarDadoConta("a agência");
                    numero = EntradaSaida.solicitarDadoConta("o número");

                    conta = b.encontrarConta(agencia, numero);
                    if (conta != null) {
                        conta.sacar(EntradaSaida.solicitarValorOperacao("saque"));
                    } else {
                        EntradaSaida.mostrarAlerta(
                                "A agência e o número digitados não correpondem a nenhuma conta cadastrada.");
                    }
                    break;

            }
        } while (opcao != 5);

    }
}
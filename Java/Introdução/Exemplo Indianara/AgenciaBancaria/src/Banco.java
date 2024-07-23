import java.util.ArrayList;

public class Banco {

    public ArrayList<Conta> listaDeContas = new ArrayList<>();

    public void adicionarConta(Conta c) {
        this.listaDeContas.add(c);
    }

    public String listarContas() {
        String contas = "Os dados das contas são\n";

        for (Conta c : this.listaDeContas) {
            contas += "\nAgência: " + c.getAgencia() + "\n" +
                    "Conta: " + c.getNumero() + "\n" +
                    "Saldo: " + c.getSaldo() + "\n" +
                    "Nome do titular: " + c.getTitular().getNome() + "\n" +
                    "CPF do titular: " + c.getTitular().getCpf() + "\n" +
                    "Data de nascimento do titular: " + c.getTitular().getDataNascimento();
        }
        return contas;
    }

    public Conta encontrarConta(int agencia, int numero) {
        for (Conta c : this.listaDeContas){
            if (c.getAgencia() == agencia && c.getNumero() == numero){
                return c;
            }
        }
        return null;
    }
}

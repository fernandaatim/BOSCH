import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        double nota1 = 0;
        double nota2 = 0;
        boolean validarNota = false;
        double resultado = 0;

        while (validarNota == false) {
            nota1 = EntradaSaida.pedirNota(" 1ª ");
            nota2 = EntradaSaida.pedirNota(" 2ª ");
            if (validarNota == false) {
                EntradaSaida.mensagem("Nota inválida!");
            }
        }

        int tipoMedia = EntradaSaida.opcoes();
        switch (tipoMedia) {
            case 1:
                resultado = Calculo.mediaUm(nota1, nota2);
                break;
            case 2:
                double peso1 = EntradaSaida.pesos(" 1º\nEx: 10% = 0.10");
                double peso2 = EntradaSaida.pesos(" 2º\nEx: 5% = 0.05");
                resultado = Calculo.mediaDois(nota1, nota2, peso1, peso2);
                break;
            default:
                EntradaSaida.mensagem("Opção inválida");
                break;
        }


    }
}

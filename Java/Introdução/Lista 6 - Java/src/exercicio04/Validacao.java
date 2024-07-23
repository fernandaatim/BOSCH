package exercicio04;

public class Validacao {
    public static String validaStatus(Boolean status) {
        if (status) {
        return "Concluído";
        } else {
            return "Em aberto";
        }
    }
}

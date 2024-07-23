public class Validacao {
    public static boolean validarNota(double nota1, double nota2) {
        if ((nota1 > 10 || nota1 < 0 || nota2 > 10 || nota2 < 0)) {
            return false;
        } else {
            return true;
        }

    }
}

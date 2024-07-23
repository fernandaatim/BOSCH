import javax.swing.JOptionPane;

public class atividade07 {
    public static void main(String[] args) {
        
        String nome = " ";
        double peso = 0;
        double pesado = 0;
        double altura = 0;
        double alto = 0;
        String pessoaPesada = "";
        String pessoaAlta = "";

        for (int i = 0; i <= 1; i++){
            nome = JOptionPane.showInputDialog("Digite o seu nome:");
            peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso"));
            altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o altura"));

        if (peso > pesado){
         pesado = peso;
         pessoaPesada = nome;
        }
        if (altura > alto){
         alto = altura;
         pessoaAlta = nome;
        }
        }
     JOptionPane.showMessageDialog(null, "A pessoa mais pesada é:"+pessoaPesada+ "\n E a mais alta é: "+pessoaAlta);
    }
}
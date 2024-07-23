import javax.swing.JOptionPane;

public class Exercicio01{
    /**
     * @param args
     */
    public static void main(String[] args){
        String nome=JOptionPane.showInputDialog("Informe seu nome");
        String sobrenome=JOptionPane.showInputDialog("Informe seu sobrenomnome");
        String dataNascimento=JOptionPane.showInputDialog("Informe a data de nascimento(00/00/0000)");
        String cargoPretendido=JOptionPane.showInputDialog("Informe o cargo pretendido)");
        double pretensaoSalarial=Double.parseDouble(JOptionPane.showInputDialog("Informe sua pretensão salarial"));
        String escolaridade=JOptionPane.showInputDialog("Informe seu grau de ensino");
        String cnhB=JOptionPane.showInputDialog("Você possuí CNH B? Informe sim ou não");

        JOptionPane.showMessageDialog(null, "Cadastro realizado, confirme seus dados \n" 
        +nome+" "+sobrenome+"\n"
        +dataNascimento+"\n"
        +cargoPretendido+"\n"
        +pretensaoSalarial+"\n"
        +escolaridade+"\n"
        +cnhB
        );
    }
}
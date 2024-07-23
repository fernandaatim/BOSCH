import javax.swing.JOptionPane;

public class exercicio04 {
    public static void main(String[] args) {

        String materias[] = new String[4];
        String inputUser = " ";
        int inputUser2 = 0;
        String inputUser3 = "";
        int cargaHoraria[] = new int[4];
        String nomeProfessor[] = new String[4];
        int i = 0;
        int opcao = 0;

        for (i = 0; i < 3; i++) {
            inputUser = JOptionPane.showInputDialog("Digite o nome da matéria");
            inputUser2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária"));
            inputUser3 = JOptionPane.showInputDialog("Digite o nome do professor(a)");
           
            materias[i] = inputUser;
            cargaHoraria[i] = inputUser2;
            nomeProfessor[i] = inputUser3;
        }

        opcao = Integer.parseInt(JOptionPane.showInputDialog("Informações de matéria\n" + "[1] " + materias[0] + "\n[2] " + materias[1] + "\n[3] " + materias[2]));

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Matéria:" + materias[0] + "\nCarga horária: " + cargaHoraria[0]
                        + "\n Professor(a): " + nomeProfessor[0]);
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "Matéria:" + materias[1] + "\nCarga horária: " + cargaHoraria[1]
                        + "\n Professor(a): " + nomeProfessor[2]);
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "Matéria:" + materias[2] + "\nCarga horária: " + cargaHoraria[2]
                        + "\n Professor(a): " + nomeProfessor[2]);
            break;
        }
    }
}

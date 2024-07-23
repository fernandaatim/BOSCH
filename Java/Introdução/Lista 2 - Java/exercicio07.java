import javax.swing.JOptionPane;

public class exercicio07 {
    public static void main(String[] args_) {

        int perguntas = Integer.parseInt(JOptionPane.showInputDialog("Qual a resposta correta? \nEscolha entre pergunta 1 e 2\n"));
        String mensagem = " ";

        switch (perguntas) 
            {
            case 1:
            int alternativas = Integer.parseInt(JOptionPane.showInputDialog("Qual o planeta mais distante do sol?\n[1]Netuno\n[2]Saturno\n[3]Urano"));
            
                switch (alternativas) {
                    case 1:
                        mensagem = "Você acertou, pode retirar seu bônus na Shostners and Shostners!";
                        break;
                    case 2:
                        mensagem = "Você errou!";
                    case 3:
                        mensagem = "Você errou!";
                }
                break;

            case 2:
            int alternativas2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o maior planeta do sistema solar?\n[1]Marte\n[2]Júpiter\n[3]Plutão"));
                switch (alternativas2) {
                    
                    case 1:
                        mensagem = "Você não acertou, mas tente novamente numa próxima!";
                    break;
                    case 2:
                        mensagem = "Você acertou,pode retirar seu bônus na Shostners and Shostners!";
                    case 3:
                        mensagem = "Você não acertou, mas tente novamente numa próxima!";
                }
                break;
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}